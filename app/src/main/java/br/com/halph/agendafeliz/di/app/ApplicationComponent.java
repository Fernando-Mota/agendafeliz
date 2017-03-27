package br.com.halph.agendafeliz.di.app;

import android.app.Application;

import javax.inject.Singleton;

import br.com.halph.agendafeliz.AgendaFelizApplication;
import dagger.Component;

/**
 * Created by fernando on 26/03/17.
 */

@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    AgendaFelizApplication getApplication();

    void inject(AgendaFelizApplication agendaFelizApplication);

}
