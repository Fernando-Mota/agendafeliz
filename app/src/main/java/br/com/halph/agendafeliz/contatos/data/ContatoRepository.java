package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

import javax.inject.Inject;

import io.realm.Realm;

/**
 * Created by fernando on 22/03/17.
 */

public class ContatoRepository implements ContatoDataSource {

    private ContatoLocalRepository contatoLocalRepository;

    @Inject
    public ContatoRepository(ContatoLocalRepository contatoLocalRepository) {
        this.contatoLocalRepository = contatoLocalRepository;
    }

    @Override
    public List<Contato> listaContatos() {
        return contatoLocalRepository.findAll(Contato.class);
    }

    @Override
    public void add(Contato contato) {
        contatoLocalRepository.add(contato);
    }

    @Override
    public Contato findById(String id) {
        return contatoLocalRepository.findById(id);
    }

    @Override
    public void closeLocalRepository() {
        contatoLocalRepository.close();
    }
}
