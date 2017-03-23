package br.com.halph.agendafeliz.repositories;

import java.util.List;

import io.realm.Realm;
import io.realm.RealmObject;

/**
 * Created by fernando on 17/03/17.
 */

public abstract class AbstractRepository<T extends RealmObject, ID> implements Repository<T, ID> {

    @Override
    public void add(T t) {
        realm.beginTransaction();
        realm.insertOrUpdate(t);
        realm.commitTransaction();
    }

    @Override
    public void update(T t) {
        realm.beginTransaction();
        realm.insertOrUpdate(t);
        realm.commitTransaction();
    }

    @Override
    public void delete(T t) {
        realm.beginTransaction();
        t.deleteFromRealm();
        realm.commitTransaction();
    }

    @Override
    public List<T> findAll(Class<T> typeClass) {
        return realm.where(typeClass).findAll();
    }

    @Override
    public T findById(ID id) {
        return null;
    }


}
