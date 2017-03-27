package br.com.halph.agendafeliz.di.realm;

import android.app.Application;

import javax.inject.Singleton;

import br.com.halph.agendafeliz.AgendaFelizApplication;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by fernando on 26/03/17.
 */

@Module
public class RealmModule {

    @Provides
    public Realm providesRealm(AgendaFelizApplication application) {
        Realm.init(application);
        return Realm.getDefaultInstance();
    }
}
