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

import javax.inject.Inject;

import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.formulariocontatos.FormularioContatoFragment;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosFragment extends Fragment implements ListaContatosContract.View {

    @Inject
    ListaContatosPresenter listaContatosPresenter;

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
        Fragment newFragment = new FormularioContatoFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container, newFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

    @Override
    public void contatoVisualizaClick() {
        //Deve fazer o handle do click na linha do recyclerview para abrir a tela de visualização
    }
}
