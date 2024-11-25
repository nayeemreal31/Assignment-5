package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecycleViewAdapter extends RecyclerView.Adapter<RecycleViewAdapter.MyViewHolder> {

    Context context;
    String[] title, description;
    int[] image;

    // Constructor to initialize context, title, description, and images
    public RecycleViewAdapter(Context context, String[] title, String[] description, int[] image) {
        this.context = context;
        this.title = title;
        this.description = description;
        this.image = image;
    }

    // Inflating the layout for each list item
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.sample_layout, parent, false);
        return new MyViewHolder(view);
    }

    // Binding data to the views in each list item
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.titleTextView.setText(title[position]);
        holder.descriptionTextView.setText(description[position]);
        holder.clubImageView.setImageResource(image[position]);
    }

    // Returning the size of the data set
    @Override
    public int getItemCount() {
        return title.length;
    }

    // ViewHolder class to hold the views for each list item
    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;
        ImageView clubImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.tv_title);
            descriptionTextView = itemView.findViewById(R.id.tv_description);
            clubImageView = itemView.findViewById(R.id.iv_imageid);
        }
    }
}
