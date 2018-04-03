package com.example.sidra.gdgkolaachi_1;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sidra on 10/15/2017.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    ImageView imgView;
    TextView albumName;
    TextView songNumber;
    public ViewHolder(View itemView) {
        super(itemView);
        imgView=(ImageView) itemView.findViewById(R.id.albumimage);
        albumName=(TextView) itemView.findViewById(R.id.albumname);
        songNumber=(TextView)itemView.findViewById(R.id.numberofsongs);

    }
}
