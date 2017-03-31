package br.com.halph.agendafeliz.listacontatos;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import br.com.halph.agendafeliz.R;
import br.com.halph.agendafeliz.contatos.data.Contato;

/**
 * Created by Android on 09/03/2017.
 */

public class ListaContatoAdapter extends RecyclerView.Adapter<ListaContatoAdapter.ListaContatoViewHolder> {

    public List<Contato> contatos;

    public ListaContatoAdapter(List<Contato> contatos) {
        this.contatos = contatos;
    }

    @Override
    public ListaContatoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_lista_contato, parent, false);

        ListaContatoViewHolder listaContatoViewHolder = new ListaContatoViewHolder(view);

        return listaContatoViewHolder;
    }

    @Override
    public void onBindViewHolder(ListaContatoViewHolder holder, int position) {

        holder.valorSexo.setText(contatos.get(position).getSexo());
        holder.valorNome.setText(contatos.get(position).getNome());
        holder.id = contatos.get(position).getId();

    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }


    public class ListaContatoViewHolder extends RecyclerView.ViewHolder {

        TextView valorNome;

        TextView valorSexo;

        String id;


        public ListaContatoViewHolder(View itemView) {
            super(itemView);

            valorNome = (TextView) itemView.findViewById(R.id.lblValorNome);
            valorSexo = (TextView) itemView.findViewById(R.id.lblValorSexo);

        }
    }

    public Contato getContatoByPosition(int position) {
        return contatos.get(position);
    }
}
