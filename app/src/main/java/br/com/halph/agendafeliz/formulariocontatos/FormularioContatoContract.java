package br.com.halph.agendafeliz.formulariocontatos;

import android.view.View;

import br.com.halph.agendafeliz.infra.BasePresenter;
import br.com.halph.agendafeliz.infra.BaseView;
import br.com.halph.agendafeliz.contatos.data.Contato;

/**
 * Created by Android on 20/02/2017.
 */

public interface FormularioContatoContract {

    public interface View extends BaseView<Presenter> {

        public void gravaContatoClick(android.view.View view);

        public void retornaParaLista();

    }

    public interface Presenter extends BasePresenter {

        public void gravaContato(Contato contato);

        public Contato lecontatoPeloId(String id);

    }
}
