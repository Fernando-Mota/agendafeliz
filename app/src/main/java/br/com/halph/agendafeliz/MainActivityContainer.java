package br.com.halph.agendafeliz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.halph.agendafeliz.dashboard.DashBoardFragment;
import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.di.contato.ContatoComponent;
import br.com.halph.agendafeliz.di.contato.DaggerContatoComponent;

public class MainActivityContainer extends AppCompatActivity {

    private static ContatoComponent contatoComponent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        contatoComponent = DaggerContatoComponent.builder().realmComponent(AgendaFelizApplication.getRealmComponent()).build();

        if(getSupportFragmentManager().findFragmentByTag("dash_board") == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container, new DashBoardFragment(), "dash_board")
                    .commit();
    }

    public static ContatoComponent getContatoComponent() {
        return contatoComponent;
    }
}
