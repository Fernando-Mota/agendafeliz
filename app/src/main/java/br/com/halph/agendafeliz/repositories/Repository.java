package br.com.halph.agendafeliz.repositories;

import java.util.List;

/**
 * Created by Android on 20/02/2017.
 */

public interface Repository<T, ID> {

    public void add(T t);

    public void update(T t);

    public T findById(ID id);

    public void delete(ID id);

    public List<T> list();
}
