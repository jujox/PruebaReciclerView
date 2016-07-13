package es.juanjo.pruebareciclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

/**
 * Created by juanjo on 13/07/16.
 */
public class Adaptador extends RecyclerView.Adapter <Adaptador.AdaptadorViewHolder> {
    private List<Mascota> mascotas;

    @Override
    public AdaptadorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.mascota_layout, parent, false);
        return new AdaptadorViewHolder(v);
    }

    @Override
    public void onBindViewHolder(AdaptadorViewHolder holder, int position) {
        holder.imagen.setImageResource(mascotas.get(position).getImagen());
        holder.nombre.setText(mascotas.get(position).getNombre());
        holder.raza.setText(mascotas.get(position).getRaza());
    }

    @Override
    public int getItemCount() {
        return mascotas.size();
    }

    public Adaptador(List<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public static class AdaptadorViewHolder extends RecyclerView.ViewHolder {
        public ImageView imagen;
        public TextView nombre;
        public TextView raza;

        public AdaptadorViewHolder(View itemView) {
            super(itemView);
            imagen = (ImageView) itemView.findViewById(R.id.imagenMascota);
            nombre = (TextView) itemView.findViewById(R.id.textViewNombre);
            raza = (TextView) itemView.findViewById(R.id.textViewRaza);
        }
    }
}
