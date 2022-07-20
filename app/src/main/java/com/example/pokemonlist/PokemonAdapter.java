package com.example.pokemonlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PokemonAdapter  extends RecyclerView.Adapter<PokemonAdapter.PokemonViewHolder>{

    ArrayList<String> list;

    public PokemonAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public PokemonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_pokemon, parent, false);
        return new PokemonViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PokemonViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class PokemonViewHolder extends RecyclerView.ViewHolder {
        ImageView pokTv;

        public PokemonViewHolder(@NonNull View itemView) {
            super(itemView);
            pokTv = itemView.findViewById(R.id.pokTv);
        }

        public void onBind(String image){
            Glide.with(pokTv).load(image).into(pokTv);

        }
    }
}
