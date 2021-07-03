package com.example.assign4;



import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class StatusAdapter extends RecyclerView.Adapter<StatusAdapter.ViewHolder> {
    List<Stat> Statuslist;
    Context context;



    public StatusAdapter(List<Stat> Statuslist, Context context) {
        this.Statuslist = Statuslist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.status_information,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {


        holder.Stv1.setText(Statuslist.get(position).getSName());
        holder.Stv2.setText(Statuslist.get(position).getSTime());
        holder.Siv1.setImageResource(Statuslist.get(position).getSImage());

    }

    @Override
    public int getItemCount() {
        return Statuslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder   {
        TextView Stv1;
        TextView Stv2;
        ImageView Siv1;


        public ViewHolder(View itemView)
        {

            super(itemView);
            Stv1=itemView.findViewById(R.id.Status_Name);
            Stv2=itemView.findViewById(R.id.Status_Time);
            Siv1=itemView.findViewById(R.id.profile_Status);




        }



    }}


