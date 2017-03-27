package br.com.halph.agendafeliz.di.app;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import br.com.halph.agendafeliz.AgendaFelizApplication;
import dagger.Module;
import dagger.Provides;
import io.realm.Realm;

/**
 * Created by fernando on 26/03/17.
 */

@Module
public class ApplicationModule {

    public static AgendaFelizApplication application;

    public ApplicationModule(AgendaFelizApplication application) {
        this.application = application;
    }

    @Provides
    public AgendaFelizApplication providesApplication() {
       return application;
    }
}
