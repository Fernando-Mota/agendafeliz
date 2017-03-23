package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by fernando on 19/03/17.
 */

public class ContatoRemoteRepository {

    public final AbstractContatoRemoteRepository contatoCloudRepository = AbstractContatoRemoteRepository.retrofit.create(AbstractContatoRemoteRepository.class);

    public void create(Contato contato, final ContatoListenerContract.CreateContatoListener listener) {
        contatoCloudRepository.add(contato).enqueue(new Callback<Contato>() {
            @Override
            public void onResponse(Call<Contato> call, Response<Contato> response) {
                listener.onCreateContato(response.body());
            }

            @Override
            public void onFailure(Call<Contato> call, Throwable t) {
                listener.onCreateContatoError(t);
            }
        });
    }

    public void read(String id, final ContatoListenerContract.FindByIDContatoListener listener) {
        contatoCloudRepository.findById(id).enqueue(new Callback<Contato>() {
            @Override
            public void onResponse(Call<Contato> call, Response<Contato> response) {
                listener.onFindConatoById(response.body());
            }

            @Override
            public void onFailure(Call<Contato> call, Throwable t) {
                listener.onFindContatoByIdError(t);
            }
        });
    }

    public void update(final Contato contato, final ContatoListenerContract.UpdateContatoListener listener) {
        contatoCloudRepository.update(contato).enqueue(new Callback<Contato>() {
            @Override
            public void onResponse(Call<Contato> call, Response<Contato> response) {
                listener.onUpdateContato(response.body());
            }

            @Override
            public void onFailure(Call<Contato> call, Throwable t) {
                listener.onUpdateContatoError(t);
            }
        });
    }

    public void delete(String id, final ContatoListenerContract.DeleteContatoListener listener) {
        contatoCloudRepository.delete(id).enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                listener.onDeleteContato();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {
                listener.onDeleteContatoError(t);
            }
        });
    }

    public void findAll(final ContatoListenerContract.FindAllContatoListener listener) {
        contatoCloudRepository.findAll().enqueue(new Callback<List<Contato>>() {
            @Override
            public void onResponse(Call<List<Contato>> call, Response<List<Contato>> response) {
                listener.onFindAllContatos(response.body());
            }

            @Override
            public void onFailure(Call<List<Contato>> call, Throwable t) {
                listener.onFindAllContatosError(t);
            }
        });
    }
}
