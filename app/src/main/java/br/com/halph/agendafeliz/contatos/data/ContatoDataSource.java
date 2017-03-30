package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

/**
 * Created by fernando on 22/03/17.
 */

public interface ContatoDataSource {

    public List<Contato> listaContatos();

    public void add(Contato contato);

    public Contato findById(String id);

    public void closeLocalRepository();

    public void update(Contato contato);

}
