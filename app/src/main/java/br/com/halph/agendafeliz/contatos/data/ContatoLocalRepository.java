package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

import br.com.halph.agendafeliz.repositories.AbstractRepository;
import io.realm.Realm;
import io.realm.internal.Context;

/**
 * Created by fernando on 17/03/17.
 */

public class ContatoLocalRepository extends AbstractRepository<Contato, String> {
    @Override
    public void add(Contato contato) {
        super.add(contato);
    }

    @Override
    public void delete(Contato contato) {
        super.delete(contato);
    }

    @Override
    public void update(Contato contato) {
        super.update(contato);
    }

    @Override
    public Contato findById(String id) {
        return super.findById(id);
    }

    @Override
    public void initializer(Realm realm) {
        this.realm = realm;
    }

    @Override
    public List<Contato> findAll(Class<Contato> typeClass) {
        return super.findAll(typeClass);
    }

    public List<Contato> findByNome(String nome) {
        return realm.where(Contato.class).equalTo("nome", nome).findAll();
    }
}
