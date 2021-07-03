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

class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    List<User> userlist;
    Context context;


    public UserAdapter(List<User> userlist, Context context) {
        this.userlist = userlist;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater= LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.chat_information,parent,false);
        ViewHolder viewHolder= new ViewHolder (view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull UserAdapter.ViewHolder holder, int position) {


        holder.tv1.setText(userlist.get(position).getName());
        holder.tv2.setText(userlist.get(position).getLastM());
        holder.tv3.setText(userlist.get(position).getTime());
        holder.iv.setImageResource(userlist.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder   {
        TextView tv1;
        TextView tv2;
        TextView tv3;
        ImageView iv;
        public ViewHolder(View itemView)
        {

            super(itemView);
            tv1=itemView.findViewById(R.id.Chat_Name);
            tv2=itemView.findViewById(R.id.Chat_Message);
            tv3=itemView.findViewById(R.id.Message_Time);
            iv=itemView.findViewById(R.id.profile);



        }



    }}

