package br.com.halph.agendafeliz.repositories;

import java.util.List;

import io.realm.Realm;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Android on 20/02/2017.
 */

public interface Repository<T, ID> {

    public void add(T t);

    public void update(T t);

    public T findById(ID id);

    public void delete(T t);

    public List<T> findAll(Class<T> typeClass);
}
