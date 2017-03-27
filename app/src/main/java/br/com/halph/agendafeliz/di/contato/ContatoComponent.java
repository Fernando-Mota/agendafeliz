package br.com.halph.agendafeliz.di.contato;

import br.com.halph.agendafeliz.contatos.data.ContatoLocalRepository;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;
import br.com.halph.agendafeliz.di.realm.RealmComponent;
import br.com.halph.agendafeliz.listacontatos.ListaContatosFragment;
import br.com.halph.agendafeliz.listacontatos.ListaContatosPresenter;
import dagger.Component;

/**
 * Created by fernando on 22/03/17.
 */

@Component(modules = ContatoModule.class, dependencies = RealmComponent.class)
public interface ContatoComponent {

    public ContatoLocalRepository getContatoLocalRepository();

    public ContatoRepository getContatoRepository();

    public ListaContatosPresenter getListaContatoPresenter();

    void inject(ListaContatosFragment listaContatosFragment);

}
