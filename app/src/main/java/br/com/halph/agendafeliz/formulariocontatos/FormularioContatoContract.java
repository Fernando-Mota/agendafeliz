package br.com.halph.agendafeliz.formulariocontatos;

import java.util.List;

import br.com.halph.agendafeliz.BasePresenter;
import br.com.halph.agendafeliz.BaseView;
import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.enderecos.data.Endereco;

/**
 * Created by Android on 20/02/2017.
 */

public interface FormularioContatoContract {

    public interface View extends BaseView<Presenter> {

        public void gravaContatoClick();

    }

    public interface Presenter extends BasePresenter {

        public void gravaContato(Contato contato);


        public Contato lecontatoPeloId(String id);

    }
}
