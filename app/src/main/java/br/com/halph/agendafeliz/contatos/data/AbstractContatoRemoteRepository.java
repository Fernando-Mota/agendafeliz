package br.com.halph.agendafeliz.contatos.data;

import android.app.Application;

import java.net.IDN;
import java.util.List;

import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.repositories.RemoteRepository;
import br.com.halph.agendafeliz.repositories.Repository;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

import static android.provider.Settings.Global.CONTACT_METADATA_SYNC_ENABLED;
import static android.provider.Settings.Global.getString;

/**
 * Created by fernando on 17/03/17.
 */

public interface AbstractContatoRemoteRepository extends RemoteRepository<Contato, String> {

    @Override
    @POST(ContatoRemoteContext.CONTEXT)
    Call<Contato> add(@Body Contato contato);

    @Override
    @PUT(ContatoRemoteContext.CONTEXT)
    Call<Contato> update(@Body Contato contato);

    @Override
    @GET(ContatoRemoteContext.READ)
    Call<Contato> findById(@Path("id") String id);

    @Override
    @GET(ContatoRemoteContext.CONTEXT)
    Call<List<Contato>> findAll();

    @Override
    @DELETE(ContatoRemoteContext.DELETE)
    Call<Void> delete(@Path("id") String id);
}
