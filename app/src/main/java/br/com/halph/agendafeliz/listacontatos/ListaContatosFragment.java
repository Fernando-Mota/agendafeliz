package br.com.halph.agendafeliz.listacontatos;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.formulariocontatos.FormularioContatoFragment;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosFragment extends Fragment implements ListaContatosContract.View {

    private ListaContatosContract.Presenter presenter;

    private Context context;

    private FloatingActionButton botaoAdicionaContato;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.lista_contato_fragment, container, false);


        botaoAdicionaContato = (FloatingActionButton) view.findViewById(R.id.adiciona_contatos);

        botaoAdicionaContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaContatoClick();
            }
        });

        // Inflate the layout for this fragment
        return view;
    }


    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        context = context;
    }

    @Override
    public void adicionaContatoClick() {

        // Create new fragment and transaction
        Fragment newFragment = new FormularioContatoFragment();
        // consider using Java coding conventions (upper first char class names!!!)
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        // Replace whatever is in the fragment_container view with this fragment,
        // and add the transaction to the back stack
        transaction.replace(R.id.dash_board_container, newFragment);
        transaction.addToBackStack(null);

        // Commit the transaction
        transaction.commit();
    }

    @Override
    public void alteraContatoClick(Contato contato) {

    }

    @Override
    public void setPresenter(ListaContatosContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
