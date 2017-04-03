package br.com.halph.agendafeliz.formulariocontatos;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.UUID;

import javax.inject.Inject;

import br.com.halph.agendafeliz.MainActivityContainer;
import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.UpdateActionBarTitleListener;
import br.com.halph.agendafeliz.contatos.data.Contato;

/**
 * Created by Android on 20/02/2017.
 */

public class FormularioContatoFragment extends Fragment implements FormularioContatoContract.View{

    @Inject
    FormularioContatoContract.Presenter presenter;

    private EditText edtNomeContato;

    private EditText edtSexoContato;

    private FloatingActionButton button;
    private Context context;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        this.context = context;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((UpdateActionBarTitleListener) context).updateActionbarTitle(getString(R.string.form_contato_add_title));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.formulario_contato_fragment, container, false);

        edtNomeContato = (EditText) view.findViewById(R.id.nome_contato);
        edtSexoContato = (EditText) view.findViewById(R.id.sexo_contato);
        button = (FloatingActionButton) view.findViewById(R.id.grava_contato);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gravaContatoClick(v);
            }
        });


        MainActivityContainer.getContatoComponent().inject(this);


        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.form_contato_holder);

        View view1 = LayoutInflater.from(getActivity()).inflate(R.layout.item_telefone, null);
        linearLayout.addView(view1);

        ViewGroup parent = (ViewGroup) view1.getParent();

        Log.d("FORM_HOLDER_ID", "ID_CARD_VIEW: " + (parent.getId() == R.id.form_contato_holder));



        return view;
    }


    @Override
    public void gravaContatoClick(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.anim_click));
        Contato contato = new Contato();
        contato.setId(UUID.randomUUID().toString());
        contato.setNome(edtNomeContato.getText().toString());
        contato.setSexo(edtSexoContato.getText().toString());
        presenter.gravaContato(contato);
        retornaParaLista();
    }

    @Override
    public void retornaParaLista() {
        getActivity().onBackPressed();
    }

    public void setPresenter(FormularioContatoContract.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        this.context = null;
    }
}
