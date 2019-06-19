package com.example.filmrental;

import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.filmrental.adapter.MovieAdapter;
import com.example.filmrental.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvMovies;
    private List<Movie> movieList = new ArrayList<>();
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        rvMovies = findViewById(R.id.rvMovies);
     /*   rvMovies.setLayoutManager(new GridLayoutManager(
                this,
                getResources().getInteger(R.integer.colSpan),
                GridLayoutManager.VERTICAL,
                false
        ));*/


        // initUI() is manually created
        initUI();

        // Create custom method
        getMovies();
    }

    private void initUI() {
        rvMovies = findViewById(R.id.rvMovies);
        movieAdapter = new MovieAdapter(movieList, this);
        rvMovies.setLayoutManager(new GridLayoutManager(this, 2));
        rvMovies.setAdapter(movieAdapter);
    }

    private void getMovies() {
        for (int i = 0; i < 20; i++) {
            movieList.add(new Movie(R.drawable.spider_man, "22/6/2019", "SPIDER MAN"));
            movieList.add(new Movie(R.drawable.annabelle, "06/07/2019", "ANNABELLE"));
            movieList.add(new Movie(R.drawable.the_secret_life_of_pets_2, "30/06/2019", "The Secret Life of Pets 2"));
        }
        movieAdapter.notifyDataSetChanged();
    }
}
