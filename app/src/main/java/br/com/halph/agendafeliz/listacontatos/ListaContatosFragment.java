package br.com.halph.agendafeliz.listacontatos;

import android.support.v4.app.Fragment;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosFragment extends Fragment implements ListaContatosContract.View {

    ListaContatosContract.Presenter presenter;

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
