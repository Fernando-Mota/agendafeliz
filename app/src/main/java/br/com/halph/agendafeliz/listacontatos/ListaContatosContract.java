package br.com.halph.agendafeliz.listacontatos;

import java.util.List;

import br.com.halph.agendafeliz.infra.BasePresenter;
import br.com.halph.agendafeliz.infra.BaseView;
import br.com.halph.agendafeliz.contatos.data.Contato;

/**
 * Created by Android on 20/02/2017.
 */

public interface ListaContatosContract {

    public interface Presenter extends BasePresenter {

        public List<Contato> lista();

    }

    public interface View extends BaseView<Presenter> {

        public void adicionaContatoClick();

        public void contatoVisualizaClick();

    }
}
