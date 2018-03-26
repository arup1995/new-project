package com.example.pc43.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by PC43 on 26/03/2018.
 */

public class Dashboardadapter extends RecyclerView.Adapter<Dashboardadapter.MyViewHolder> {
    private List<Name> nameList;
    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView dname,dname1;
        public ImageView dimage,dimage2;
        public MyViewHolder(View itemView) {
            super(itemView);
            dname=(TextView)itemView.findViewById(R.id.name);
            dimage=(ImageView)itemView.findViewById(R.id.image);
            dname1=(TextView)itemView.findViewById(R.id.name1);
            dimage2=(ImageView)itemView.findViewById(R.id.image1);

        }
    }
    public Dashboardadapter(List<Name> nameList){
        this.nameList=nameList;
    }
    @Override
    public Dashboardadapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView= LayoutInflater.from(parent.getContext()).inflate(R.layout.row,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(Dashboardadapter.MyViewHolder holder, int position) {
        Name name=nameList.get(position);
        holder.dname.setText(name.getName());
        holder.dname1.setText(name.getName());

    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }
}
