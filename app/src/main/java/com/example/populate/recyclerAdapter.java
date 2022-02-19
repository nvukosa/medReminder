package com.example.populate;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class recyclerAdapter extends RecyclerView.Adapter<recyclerAdapter.MyViewHolder>{
    private ArrayList<Medication> medsList;
    public recyclerAdapter(ArrayList<Medication> usersList){
        this.medsList = usersList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView nameTxt;
        private TextView numTxt;
        private TextView hourTxt;

        public MyViewHolder(final View view){
            super(view);
            nameTxt = view.findViewById(R.id.textView2);
            numTxt = view.findViewById(R.id.amount);
            hourTxt = view.findViewById(R.id.hour);


        }
    }

    @NonNull
    @Override
    public recyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_items, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerAdapter.MyViewHolder holder, int position) {
        String name = medsList.get(position).getname();
        String amount = medsList.get(position).getAmount();
        int hour = medsList.get(position).getHour();
        holder.nameTxt.setText(name);
        holder.numTxt.setText(amount);
        holder.hourTxt.setText(String.valueOf(hour));

    }

    @Override
    public int getItemCount() {
        return medsList.size();
    }
}