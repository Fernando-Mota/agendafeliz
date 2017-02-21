package br.com.halph.agendafeliz.dashboard;

import br.com.halph.agendafeliz.BasePresenter;
import br.com.halph.agendafeliz.BaseView;

/**
 * Created by Android on 16/02/2017.
 */

public interface DashBoardContract {

    public interface Presenter extends BasePresenter {

        void abrirListaContato();

        void abrirListaEnderecos();
    }

    public interface View extends BaseView<Presenter> {
        void abrirListaContato();

        void abrirListaEnderecos();
    }
}
