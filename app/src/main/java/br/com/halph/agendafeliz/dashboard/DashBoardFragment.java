package br.com.halph.agendafeliz;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.halph.agendafeliz.dashboard.DashBoardContract;
import br.com.halph.agendafeliz.dashboard.DashBoardPresenter;

/**
 * Created by Android on 16/02/2017.
 */

public class DashBoardFragment extends Fragment implements DashBoardContract.View {

    DashBoardPresenter presenter;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.dash_board_fragment, container, false);
    }

    @Override
    public void abrirListaContato() {

    }

    @Override
    public void abrirListaEnderecos() {

    }

    @Override
    public void setPresenter(DashBoardContract.Presenter presenter) {
        this.presenter = (DashBoardPresenter) presenter;
    }
}
