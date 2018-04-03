package com.example.sidra.gdgkolaachi_1;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Sidra on 10/15/2017.
 */

public class MyRecyclerAdapter extends RecyclerView.Adapter<ViewHolder> {

    ArrayList<ModelClass> array_List; 

    public MyRecyclerAdapter(ArrayList<ModelClass> array_List) {
        this.array_List = array_List;
    }



    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.customlayout,parent,false);
        ViewHolder view_holder=new ViewHolder(view);
        return view_holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        ModelClass modelClass=array_List.get(position);

        holder.songNumber.setText(modelClass.getSong_number());
        holder.albumName.setText(modelClass.getAlbum_name());
        holder.imgView.setImageResource(modelClass.getAlbum_image());
    }

    @Override
    public int getItemCount() {
        return array_List.size();
    }
}
