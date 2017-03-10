package br.com.halph.agendafeliz.listacontatos;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.List;

import br.com.halph.agendafeliz.contatos.data.Contato;
import br.com.halph.agendafeliz.contatos.data.ContatoRepository;
import br.com.halph.agendafeliz.contatos.data.ContatoService;
import retrofit2.Retrofit;

/**
 * Created by Android on 20/02/2017.
 */

public class ListaContatosPresenter implements ListaContatosContract.Presenter {

    private ContatoRepository contatoRepository;

    private ContatoService contatoService = ContatoService.retrofit.create(ContatoService.class);

    AsyncTask<Void, Void, List<Contato>> contatoTask = new AsyncTask<Void, Void, List<Contato>>() {
        @Override
        protected List<Contato> doInBackground(Void... params) {
            return listaContatoOnline();
        }

        @Override
        protected void onPostExecute(List<Contato> contatos) {
            
        }
    };

    @Override
    public List<Contato> listaContatos() {
        return contatoRepository.list();
    }

    @Override
    public List<Contato> listaContatoOnline() {
        try {
            return contatoService.contatos().execute().body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public void start() {
        this.contatoRepository = new ContatoRepository();
    }
}
