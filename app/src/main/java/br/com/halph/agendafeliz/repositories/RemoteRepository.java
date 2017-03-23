package br.com.halph.agendafeliz.repositories;

import java.util.List;

import br.com.halph.agendafeliz.contatos.data.Contato;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Created by fernando on 19/03/17.
 */

public interface RemoteRepository<T, ID> {

        public Call<List<T>> findAll();

        public Call<T> findById(@Path("id") ID id);

        public Call<T> update(@Body T t);

        public Call<T> add(@Body T t);

        public Call<Void> delete(@Path("id") ID id);

        public static final OkHttpClient client = new OkHttpClient();

        public static final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://agendafeliz.herokuapp.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .client(client)
                .build();
}
