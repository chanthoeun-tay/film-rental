package com.example.filmrental.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.filmrental.R;
import com.example.filmrental.model.Movie;

import java.util.List;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.ViewHolder> {

    public MovieAdapter(List<Movie> movieList, Context context) {
        this.movieList = movieList;
        this.context = context;
    }

    private List<Movie> movieList;
    private Context context;

    // Overwrite 3 methods
    @Override
    public int getItemCount() {
        return this.movieList.size();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Attach layout to Adapter here
        View view = LayoutInflater.from(context)
                .inflate(R.layout.layout_movie, viewGroup, false);
        return new MovieAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Movie movie = movieList.get(position);
        viewHolder.date.setText(movie.getDate());
        viewHolder.title.setText(movie.getTitle());
        viewHolder.thumbnail.setImageResource(movie.getThumbnail());
    }


    static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView thumbnail;
        private TextView date, title;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            thumbnail = itemView.findViewById(R.id.imvFilm);
            date = itemView.findViewById(R.id.tvShowDate);
            title = itemView.findViewById(R.id.tvFilmTitle);
        }
    }
}
