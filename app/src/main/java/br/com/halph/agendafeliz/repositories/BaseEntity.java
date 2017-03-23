package br.com.halph.agendafeliz.repositories;

import br.com.halph.agendafeliz.repositories.enums.SyncType;

/**
 * Created by fernando on 17/03/17.
 */

public interface BaseEntity {

    public void setSynchronized(SyncType synctype);

    public SyncType getSyncronized();

}
