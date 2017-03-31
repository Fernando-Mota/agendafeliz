package br.com.halph.agendafeliz.dashboard;


import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.transitionseverywhere.Transition;

import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.UpdateActionBarTitleListener;
import br.com.halph.agendafeliz.dashboard.DashBoardContract;
import br.com.halph.agendafeliz.dashboard.DashBoardPresenter;
import br.com.halph.agendafeliz.listacontatos.ListaContatosFragment;

/**
 * Created by Android on 16/02/2017.
 */

public class DashBoardFragment extends Fragment implements DashBoardContract.View {

    DashBoardPresenter presenter;

    ImageView imageButton;

    Context context;

    @Override
    public void onAttach(Context context) {

        super.onAttach(context);

        this.context = context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.dash_board_fragment, container, false);
        imageButton = (ImageView) view.findViewById(R.id.adiciona_contato);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirListaContato(v);
            }
        });
        return view;
    }

    @Override
    public void abrirListaContato(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.anim_click));
        Fragment newFragment = new ListaContatosFragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.setCustomAnimations(R.anim.frag_fade_in, R.anim.frag_fade_out, R.anim.frag_fade_in, R.anim.frag_fade_out);
        transaction.replace(R.id.container, newFragment);
        transaction.addToBackStack("dash_board_to_lista_contato");
        transaction.commit();
    }

    @Override
    public void abrirListaEnderecos() {

    }

    public void setPresenter(DashBoardContract.Presenter presenter) {
        this.presenter = (DashBoardPresenter) presenter;
    }

    @Override
    public void onResume() {
        super.onResume();
        ((UpdateActionBarTitleListener) context).updateActionbarTitle(getString(R.string.dashboard_title));
    }
}
