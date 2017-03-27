package br.com.halph.agendafeliz.di.realm;

import br.com.halph.agendafeliz.di.app.ApplicationComponent;
import dagger.Component;
import io.realm.Realm;

/**
 * Created by fernando on 26/03/17.
 */

@Component(modules = RealmModule.class, dependencies = ApplicationComponent.class)
public interface RealmComponent {

    Realm getRealm();

}
