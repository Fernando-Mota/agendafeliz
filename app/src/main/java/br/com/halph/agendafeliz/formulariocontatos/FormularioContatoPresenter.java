package br.com.halph.agendafeliz.formulariocontatos;

import java.util.UUID;

import javax.inject.Inject;

import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;

/**
 * Created by Android on 20/02/2017.
 */

public class FormularioContatoPresenter implements FormularioContatoContract.Presenter {

    private ContatoRepository contatoRepository;

    @Inject
    public FormularioContatoPresenter(ContatoRepository contatoRepository) {
        this.contatoRepository = contatoRepository;
    }

    @Override
    public void gravaContato(Contato contato) {
        if (contato.getId() == null || contato.getId().isEmpty()) {
            contato.setId(UUID.randomUUID().toString());
            contatoRepository.add(contato);
        }
        else {
            contatoRepository.update(contato);
        }
    }

    @Override
    public Contato lecontatoPeloId(String id) {
        return contatoRepository.findById(id);
    }

    @Override
    public void start() {
    }
}
