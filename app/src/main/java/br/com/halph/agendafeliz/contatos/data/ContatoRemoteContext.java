package br.com.halph.agendafeliz.contatos.data;

/**
 * Created by fernando on 19/03/17.
 */

public interface ContatoRemoteContext {
    public static final String CONTEXT = "/contatos";
    public static final String DELETE = "/contatos/{id}";
    public static final String READ = "/contatos/{id}";
}
