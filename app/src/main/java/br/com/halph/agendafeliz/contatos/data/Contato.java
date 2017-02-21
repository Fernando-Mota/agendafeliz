package br.com.halph.agendafeliz.contatos.data;

import java.util.List;

import br.com.halph.agendafeliz.enderecos.data.Endereco;
import br.com.halph.agendafeliz.telefones.data.Telefone;

/**
 * Created by Android on 20/02/2017.
 */

public class Contato {

    private String id;

    private String nome;

    private String sexo;

    private List<Telefone> telefones;

    private List<Endereco> enderecos;

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

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }
}
