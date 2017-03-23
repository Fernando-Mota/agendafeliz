package br.com.halph.agendafeliz.di;

import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.contatos.data.ContatoLocalRepository;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;
import br.com.halph.agendafeliz.listacontatos.ListaContatosContract;
import br.com.halph.agendafeliz.listacontatos.ListaContatosPresenter;
import br.com.halph.agendafeliz.repositories.AbstractRepository;
import dagger.Module;
import dagger.Provides;

/**
 * Created by fernando on 22/03/17.
 */

@Module
public class ContatoModule {

    @Provides
    public ContatoLocalRepository providesContatoLocalRepository() {
        return new ContatoLocalRepository();
    }

    @Provides
    public ContatoRepository providesContatoRepository(ContatoLocalRepository contatoLocalRepository) {
        return new ContatoRepository(contatoLocalRepository);
    }

    @Provides
    public ListaContatosContract.Presenter providesListaContatoPresenter(ContatoRepository contatoRepository) {
        return new ListaContatosPresenter(contatoRepository);
    }
}
