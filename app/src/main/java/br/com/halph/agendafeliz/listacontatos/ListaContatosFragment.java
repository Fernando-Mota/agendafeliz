package br.com.halph.agendafeliz.listacontatos;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import br.com.halph.agendafeliz.MainActivityContainer;
import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.formulariocontatos.FormularioContatoFragment;
import br.com.halph.agendafeliz.repositories.Repository;
import io.realm.Realm;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosFragment extends Fragment implements ListaContatosContract.View {

    @Inject
    ListaContatosContract.Presenter listaContatosPresenter;

    private Context context;

    private FloatingActionButton botaoAdicionaContato;

    private RecyclerView recyclerView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.lista_contato_fragment, container, false);

        recyclerView = (RecyclerView) view.findViewById(R.id.lista_contatos_recycler_view);

        List<Contato> contatos = listaContatosPresenter.lista();

        Log.d("QUANTIDADE_CONTATOS", "onCreateView: Contatos count " + contatos.size());

        recyclerView.setLayoutManager(new LinearLayoutManager(context));

        recyclerView.setAdapter(new ListaContatoAdapter(contatos));

        botaoAdicionaContato = (FloatingActionButton) view.findViewById(R.id.adiciona_contatos);

        botaoAdicionaContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adicionaContatoClick();
            }
        });

        return view;
    }


    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        context = context;

        MainActivityContainer.getContatoComponent().inject(this);

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

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listaContatosPresenter.closeRepository();
        Log.d("CLOSE_REALM", "Realm fechado!");
    }
}
