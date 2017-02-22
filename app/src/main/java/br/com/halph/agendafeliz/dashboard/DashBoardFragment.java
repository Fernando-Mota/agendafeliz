package br.com.halph.agendafeliz.dashboard;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.dashboard.DashBoardContract;
import br.com.halph.agendafeliz.dashboard.DashBoardPresenter;
import br.com.halph.agendafeliz.listacontatos.ListaContatosFragment;

/**
 * Created by Android on 16/02/2017.
 */

public class DashBoardFragment extends Fragment implements DashBoardContract.View {

    DashBoardPresenter presenter;

    ImageButton imageButton;

    Context context;

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.dash_board_fragment, container, false);

        imageButton = (ImageButton) view.findViewById(R.id.adiciona_contato);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirListaContato(v);
            }
        });


        // Inflate the layout for this fragment
        return view;



    }

    @Override
    public void abrirListaContato(View view) {

        // Create new fragment and transaction
        Fragment newFragment = new ListaContatosFragment();
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
    public void abrirListaEnderecos() {

    }

    @Override
    public void setPresenter(DashBoardContract.Presenter presenter) {
        this.presenter = (DashBoardPresenter) presenter;
    }
}
