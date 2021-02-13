package com.example.assignment;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {

    ArrayList<String> personNames;
    ArrayList<Integer> personImages;
    Context context;

    public CustomAdapter(Context context, ArrayList<String> personNames, ArrayList<Integer> personImages) {
        this.context = context;
        this.personNames = personNames;
        this.personImages = personImages;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // infalte the item Layout
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rowlayout, parent, false);
        // set the view's size, margins, paddings and layout parameters
        MyViewHolder vh = new MyViewHolder(v); // pass the view to View Holder
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        // set the data in items
        holder.name.setText(personNames.get(position));
        holder.image.setImageResource(personImages.get(position));
        // implement setOnClickListener event on item view.
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // display a toast with person name on item click
                if(personNames.get(position).equals("North Indian")){
                    final Context context=view.getContext();
                    Intent intent=new Intent(context,NorthIndian.class);
                    context.startActivity(intent);
                }
                else if(personNames.get(position).equals("Chinese")){
                    final Context context=view.getContext();
                    Intent intent=new Intent(context,Chinese.class);
                    context.startActivity(intent);
                }
                else if(personNames.get(position).equals("South Indian")){
                    final Context context=view.getContext();
                    Intent intent=new Intent(context,SouthIndian.class);
                    context.startActivity(intent);
                }
                else if(personNames.get(position).equals("Maxican")){
                    final Context context=view.getContext();
                    Intent intent=new Intent(context,Maxican.class);
                    context.startActivity(intent);
                }
                else if(personNames.get(position).equals("Italian")){
                    final Context context=view.getContext();
                    Intent intent=new Intent(context,Maxican.class);
                    context.startActivity(intent);
                }
            }
        });

    }

    @Override
    public int getItemCount() {
        return personNames.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        // init the item view's
        TextView name;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);

            // get the reference of item view's
            name = (TextView) itemView.findViewById(R.id.name);
            image = (ImageView) itemView.findViewById(R.id.image);

        }
    }
}
