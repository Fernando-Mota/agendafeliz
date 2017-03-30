package br.com.halph.agendafeliz.telefones.data;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Android on 20/02/2017.
 */

public class Telefone extends RealmObject {

    @PrimaryKey
    private String id;

    private String numero;

    private String codigoArea;

    private String tipo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
