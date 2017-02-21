package br.com.halph.agendafeliz.contatos.data;

import br.com.halph.agendafeliz.repositories.Repository;

/**
 * Created by Android on 20/02/2017.
 */

public interface ContatoDataSource<Contato, String> extends Repository<Contato, String> {

    public void deleteAllContatos();

}
