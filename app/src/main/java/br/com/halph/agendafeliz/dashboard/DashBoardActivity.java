package br.com.halph.agendafeliz.dashboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import br.com.halph.agendafeliz.dashboard.DashBoardFragment;
import br.com.halph.agendafeliz.R;

public class DashBoardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        if(getSupportFragmentManager().findFragmentByTag("dash_board") == null)
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.dash_board_container, new DashBoardFragment(), "dash_board")
                    .commit();
    }
}
