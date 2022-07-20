package com.example.pokemonlist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.pokemonlist.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    PokemonAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);

        ArrayList<String> list = new ArrayList<>();
        list.add("https://avatars.mds.yandex.net/i?id=67bdb33fad6285afc58edc2c6ade667b-4120677-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=e6ac64e753f000b0e19a079c795d2909-5453487-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=4606f48eebc235284d9770807a712f84-4266310-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=2a0000017a049432db9b23b2b3852a5c92d8-4568174-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=2e19cd0d340af412e1e128a834e67a50-4719550-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=e7943a97b253efd722993bde0c966198-3096790-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=32e57ec3937a7b818acf6c44a81a13aa-4233836-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=277aaea147cefb816e2909c0fdab3135-5232996-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=f123518b61a9db1f2f357fea9bf54f88-5446078-images-thumbs&n=13");
        list.add("https://avatars.mds.yandex.net/i?id=9dfd490e96c595cc3ade05f2717048f3-4081108-images-thumbs&n=13");
        adapter = new PokemonAdapter(list);
        binding.recyclerView.setAdapter(adapter);
    }
}
