package br.com.halph.agendafeliz.enderecos.data;

/**
 * Created by Android on 20/02/2017.
 */

public enum TipoEndereco {

    RESIDENCIAL("Residêncial"), COMERCIAL("Comercial");

    private String text;

    TipoEndereco(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }
}
