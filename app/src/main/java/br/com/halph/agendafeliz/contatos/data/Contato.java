package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

import br.com.halph.agendafeliz.enderecos.data.Endereco;
import br.com.halph.agendafeliz.repositories.BaseEntity;
import br.com.halph.agendafeliz.repositories.enums.SyncType;
import br.com.halph.agendafeliz.telefones.data.Telefone;
import io.realm.RealmObject;

/**
 * Created by Android on 20/02/2017.
 */

public class Contato extends RealmObject {

    private String id;

    private String nome;

    private String sexo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
