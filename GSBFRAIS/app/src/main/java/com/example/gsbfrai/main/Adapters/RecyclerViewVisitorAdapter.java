package com.example.gsbfrai.main.Adapters;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.gsbfrai.R;
import com.example.gsbfrai.main.Models.Praticien;
import com.example.gsbfrai.main.Models.Praticiens;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewVisitorAdapter  extends RecyclerView.Adapter<RecyclerViewVisitorAdapter.RecyclerViewHolder>  {
    private List<Praticien> dataModelPraticiens;
    //private List<Monuments> dataModelMonuments;
    public RecyclerViewVisitorAdapter(List<Praticien> dataModelPatients) {this.dataModelPraticiens = dataModelPatients; }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerViewHolder viewHolder;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclerview_list_item, parent, false);
        viewHolder = new RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewVisitorAdapter.RecyclerViewHolder holder, int position) {
        holder.tvNom.setText(String.valueOf(dataModelPraticiens.get(position).toString()));
    }

    @Override
    public int getItemCount() {
        return dataModelPraticiens.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView tvNom;

        public RecyclerViewHolder(@NonNull View itemView){
            super(itemView);
            tvNom = itemView.findViewById(R.id.tvText);
        }
    }
}