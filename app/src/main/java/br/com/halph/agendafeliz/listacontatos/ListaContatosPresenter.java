package br.com.halph.agendafeliz.listacontatos;

import java.util.List;

import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosPresenter implements ListaContatosContract.Presenter {

    private ContatoRepository contatoRepository;

    @Override
    public List<Contato> listaContatos() {
        return contatoRepository.list();
    }

    @Override
    public void start() {
        this.contatoRepository = new ContatoRepository();
    }
}
