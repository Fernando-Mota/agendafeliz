package br.com.halph.agendafeliz.listacontatos;

import java.util.List;

import br.com.halph.agendafeliz.infra.BasePresenter;
import br.com.halph.agendafeliz.infra.BaseView;
import br.com.halph.agendafeliz.contatos.data.Contato;
import io.realm.Realm;

/**
 * Created by Android on 20/02/2017.
 */

public interface ListaContatosContract {

    public interface Presenter extends BasePresenter {

        public List<Contato> lista();

        public void initializer(Realm realm);

    }

    public interface View extends BaseView<Presenter> {

        public void adicionaContatoClick();

        public void contatoVisualizaClick();

    }
}
