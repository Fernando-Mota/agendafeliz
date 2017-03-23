package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

/**
 * Created by fernando on 19/03/17.
 */

public interface ContatoListenerContract {

    public interface CreateContatoListener {
        public void onCreateContato(Contato contato);
        public void onCreateContatoError(Throwable throwable);
    }

    public interface UpdateContatoListener {
        public void onUpdateContato(Contato contato);
        public void onUpdateContatoError(Throwable throwable);
    }

    public interface DeleteContatoListener {
        public void onDeleteContato();
        public void onDeleteContatoError(Throwable throwable);
    }

    public interface FindByIDContatoListener {
        public void onFindConatoById(Contato contato);
        public void onFindContatoByIdError(Throwable throwable);
    }

    public interface FindAllContatoListener {
        public void onFindAllContatos(List<Contato> contatos);
        public void onFindAllContatosError(Throwable throwable);
    }
}
