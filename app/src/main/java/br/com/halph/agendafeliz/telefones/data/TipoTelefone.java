package br.com.halph.agendafeliz.telefones.data;

/**
 * Created by Android on 20/02/2017.
 */

public enum TipoTelefone {

    RESIDENCIAL("Residêncial"), CELULAR("Celular"), COMERCIAL("Comercial");

    private String text;

    TipoTelefone(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
