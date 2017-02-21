package br.com.halph.agendafeliz.contatos.data;

import android.annotation.SuppressLint;
import android.util.Log;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Android on 20/02/2017.
 */

public class ContatoRepository implements ContatoDataSource<Contato, String> {

    @SuppressLint("LongLogTag")
    @Override
    public void deleteAllContatos() {
        Log.v("Apagando todos os contatos", "Contatos apagados com sucesso!");
    }

    @Override
    public void add(Contato contato) {
        Log.v("Incluido contato", "Contato: " + contato.getNome() + " incluso");
    }

    @Override
    public void update(Contato contato) {
        Log.v("Alterando contato", "Contato: " + contato.getNome() + " alterado");
    }

    @Override
    public List<Contato> list() {
        return Arrays.asList(new Contato(), new Contato(), new Contato());
    }

    @Override
    public void delete(String id) {
        Contato contato = findById(id);
        Log.v("Deletando contato", "Contato: " + contato.getNome() + " alterado");
    }

    @Override
    public Contato findById(String id) {
        Contato contato = new Contato();
        Log.v("Alterando contato", "Contato: " + contato.getNome() + " alterado");
        return contato;
    }
}
