package br.com.halph.agendafeliz.contatos.data;

import android.provider.CalendarContract;

import java.util.List;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by Android on 09/03/2017.
 */

public interface ContatoRemoteService {

    @GET("contatos")
    public Call<List<Contato>> contatos();

    @GET("contatos/{id}")
    public Call<Contato> findContatoById(@Path("id") String is);

    @PUT("contatos/{id}")
    public Call<Contato> alteraContato(@Path("id") String is);

    @PUT("contatos")
    public Call<Void> alteraContato(@Body Contato contato);

    @DELETE("contatos/{id}")
    public Call<Void> deleteContato(@Path("id") String id);

    public static final Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://happyshedule.herokuapp.com/")
            .addConverterFactory(GsonConverterFactory.create()).client(new OkHttpClient()).build();
}
