package br.com.halph.agendafeliz.listacontatos;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;

import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.contatos.data.ContatoLocalRepository;
import br.com.halph.agendafeliz.contatos.data.ContatoRemoteService;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;
import io.realm.Realm;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosPresenter implements ListaContatosContract.Presenter {

    private ContatoRepository contatoRepository;

    @Inject
    public ListaContatosPresenter(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public void start() {
    }

    @Override
    public List<Contato> lista() {
        return contatoRepository.listaContatos();
    }

    @Override
    public void closeRepository() {
        contatoRepository.closeLocalRepository();
    }

    @Override
    public void addContato(Contato contato) {
        contatoRepository.add(contato);
    }

    @Override
    public void cleanDB() {
        contatoRepository.cleanDB();
    }
}