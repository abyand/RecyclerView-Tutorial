package com.example.abyandafa.tutorrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Abyan Dafa on 11/11/2017.
 */

public class KontakAdapter extends RecyclerView.Adapter<KontakAdapter.ViewHolder>{

    private List<String> values;

    public KontakAdapter(List<String> myDataset) {
        values = myDataset;
    }

    @Override
    public KontakAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View v = layoutInflater.inflate(R.layout.kontakview, parent, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(final KontakAdapter.ViewHolder holder, final int position) {

        final String name = values.get(position);
        holder.kontakHP.setText(name);
        holder.kontakNama.setText(name + "ganteng");
        holder.kontakGambar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                remove(holder.getPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return values.size();
    }

    public void add(int position, String item)
    {
        values.add(position,item);
        notifyItemInserted(position);
    }

    public void remove(int position)
    {
        values.remove(position);
        notifyItemRemoved(position);
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView kontakNama, kontakHP;
        public ImageView kontakGambar;
        public  View layout;
        public ViewHolder(View itemView) {
            super(itemView);
            layout = itemView;
            kontakNama = (TextView) itemView.findViewById(R.id.kontakNama);
            kontakHP = (TextView) itemView.findViewById(R.id.kontakHP);
            kontakGambar = (ImageView) itemView.findViewById(R.id.kontakGambar);
        }
    }

}
