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

class CallAdapter extends RecyclerView.Adapter<CallAdapter.ViewHolder> {
    List<Caller> Callslist;
    Context context;


    public CallAdapter(List<Caller> Callslist, Context context) {
        this.Callslist = Callslist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.call_information,parent,false);
        ViewHolder viewHolder= new ViewHolder(view);
        return viewHolder;
    }


    @Override
    public void onBindViewHolder(@NonNull CallAdapter.ViewHolder holder, int position) {


        holder.Ctv1.setText(Callslist.get(position).getCName());
        holder.Ctv2.setText(Callslist.get(position).getCTime());
        holder.Civ1.setImageResource(Callslist.get(position).getCImage());
        holder.Civ2.setImageResource(Callslist.get(position).getCIcon());
    }

    @Override
    public int getItemCount() {
        return Callslist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder   {
        TextView Ctv1;
        TextView Ctv2;
        ImageView Civ1;
        ImageView Civ2;

        public ViewHolder(View itemView)
        {

            super(itemView);
            Ctv1=itemView.findViewById(R.id.Call_Name);
            Ctv2=itemView.findViewById(R.id.Call_Time);
            Civ1=itemView.findViewById(R.id.profile_Call);
            Civ2=itemView.findViewById(R.id.Call_icon);



        }



    }}


