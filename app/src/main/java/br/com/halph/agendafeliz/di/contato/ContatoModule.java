package br.com.halph.agendafeliz.di.contato;

import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.contatos.data.ContatoLocalRepository;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;
import br.com.halph.agendafeliz.formulariocontatos.FormularioContatoContract;
import br.com.halph.agendafeliz.formulariocontatos.FormularioContatoPresenter;
import br.com.halph.agendafeliz.listacontatos.ListaContatosContract;
import br.com.halph.agendafeliz.listacontatos.ListaContatosPresenter;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by fernando on 22/03/17.
 */

@Module
public class ContatoModule {

    @Provides
    public ContatoLocalRepository providesContatoLocalRepository(Realm realm) {
        return new ContatoLocalRepository(realm);
    }

    @Provides
    public ContatoRepository providesContatoRepository(ContatoLocalRepository contatoLocalRepository) {
        return new ContatoRepository(contatoLocalRepository);
    }

    @Provides
    public ListaContatosContract.Presenter providesListaContatoPresenter(ContatoRepository contatoRepository) {
        return new ListaContatosPresenter(contatoRepository);
    }

    @Provides
    public FormularioContatoContract.Presenter providesFormularioContatoPresenter(ContatoRepository contatoRepository) {
        return new FormularioContatoPresenter(contatoRepository);
    }
}
