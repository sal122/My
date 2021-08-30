package com.m_saleem.my;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class rvADAPTER extends RecyclerView.Adapter<rvADAPTER.catViewHolder> {
    public rvADAPTER(ArrayList<cat> cats) {

        this.cats = cats;
    }

    ArrayList <cat> cats;




    @NonNull
    @Override
    public catViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v =LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_custom_item,null,false);
        catViewHolder vv=new catViewHolder(v);
        return vv;
    }

    @Override
    public void onBindViewHolder(@NonNull catViewHolder holder, int position) {
        cat c =cats.get(position);

        holder.tv_name.setText((CharSequence) c.getName());



    }

    @Override
    public int getItemCount() {
        return cats.size();
    }

    //holder class for recycle view
    class catViewHolder extends RecyclerView.ViewHolder{
        TextView tv_name;

        public catViewHolder(@NonNull View itemView) {

            super(itemView);
            tv_name=itemView.findViewById(R.id.textView3);



        }
    }

}
