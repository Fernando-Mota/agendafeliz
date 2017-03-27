package br.com.halph.agendafeliz;

import android.app.Application;

import br.com.halph.agendafeliz.di.app.ApplicationComponent;
import br.com.halph.agendafeliz.di.app.ApplicationModule;
import br.com.halph.agendafeliz.di.app.DaggerApplicationComponent;
import br.com.halph.agendafeliz.di.realm.DaggerRealmComponent;
import br.com.halph.agendafeliz.di.realm.RealmComponent;

/**
 * Created by fernando on 26/03/17.
 */

public class AgendaFelizApplication extends Application {

    private static ApplicationComponent applicationComponent;

    private static RealmComponent realmComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();

        realmComponent = DaggerRealmComponent.builder().applicationComponent(applicationComponent).build();
    }

    public static ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }

    public static RealmComponent getRealmComponent() {
        return realmComponent;
    }
}
