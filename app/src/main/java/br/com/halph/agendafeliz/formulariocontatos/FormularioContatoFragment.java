package br.com.halph.agendafeliz.formulariocontatos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.halph.agendafeliz.R;

/**
 * Created by Android on 20/02/2017.
 */

public class FormularioContatoFragment extends Fragment implements FormularioContatoContract.View{

    private FormularioContatoContract.Presenter presenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.formulario_contato_fragment, container, false);


        // Inflate the layout for this fragment
        return view;
    }


    @Override
    public void gravaContatoClick() {

    }

    @Override
    public void setPresenter(FormularioContatoContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
