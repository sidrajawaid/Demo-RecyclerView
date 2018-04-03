package com.example.sidra.gdgkolaachi_1;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {
  RecyclerView recycler_View;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recycler_View=(RecyclerView)findViewById(R.id.recycler);
        ArrayList<ModelClass> array_List=new ArrayList<>();
        array_List.add(new ModelClass(R.drawable.color_brown,"BROWN","brown"));
        array_List.add(new ModelClass(R.drawable.color_gray,"GRAY","gray"));
        array_List.add(new ModelClass(R.drawable.color_green,"GREEN","green"));
        array_List.add(new ModelClass(R.drawable.color_mustard_yellow,"MUSTARD YELLOW","mustardyellow"));
        array_List.add(new ModelClass(R.drawable.color_red,"RED","red"));
        array_List.add(new ModelClass(R.drawable.color_brown,"BROWN","brown"));
        array_List.add(new ModelClass(R.drawable.color_gray,"GRAY","gray"));
        array_List.add(new ModelClass(R.drawable.color_green,"GREEN","green"));
        array_List.add(new ModelClass(R.drawable.color_mustard_yellow,"MUSTARD YELLOW","mustardyellow"));
        array_List.add(new ModelClass(R.drawable.color_red,"RED","red"));
        array_List.add(new ModelClass(R.drawable.color_brown,"BROWN","brown"));
        array_List.add(new ModelClass(R.drawable.color_gray,"GRAY","gray"));
        array_List.add(new ModelClass(R.drawable.color_green,"GREEN","green"));
        array_List.add(new ModelClass(R.drawable.color_mustard_yellow,"MUSTARD YELLOW","mustardyellow"));
        MyRecyclerAdapter my_Recycler_Adapter=new MyRecyclerAdapter(array_List);
        RecyclerView.LayoutManager layoutManager=new GridLayoutManager(this,2);
        recycler_View.setLayoutManager(layoutManager);
        recycler_View.setAdapter(my_Recycler_Adapter);

        /*RecyclerView.ItemDecoration itemDecoration=new DividerItemDecoration(this,DividerItemDecoration.VERTICAL);
    recycler_View.addItemDecoration(itemDecoration);
*/

    }
}
