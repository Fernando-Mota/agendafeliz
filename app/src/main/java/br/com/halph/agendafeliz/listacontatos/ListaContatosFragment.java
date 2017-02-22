package br.com.halph.agendafeliz.listacontatos;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.halph.agendafeliz.R;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosFragment extends Fragment implements ListaContatosContract.View {

    ListaContatosContract.Presenter presenter;

    Context context;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.lista_contato_fragment, container, false);

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

    }

    @Override
    public void alteraContatoClick() {

    }

    @Override
    public void setPresenter(ListaContatosContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
