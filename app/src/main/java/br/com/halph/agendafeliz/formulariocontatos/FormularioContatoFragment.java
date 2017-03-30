package br.com.halph.agendafeliz.formulariocontatos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import java.util.UUID;

import javax.inject.Inject;

import br.com.halph.agendafeliz.MainActivityContainer;
import br.com.halph.agendafeliz.R;
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
                gravaContatoClick();
            }
        });


        MainActivityContainer.getContatoComponent().inject(this);



        return view;
    }


    @Override
    public void gravaContatoClick() {
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
}
