package com.example.jokeapp.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OfficialJokeServiceProviderImpl implements JokeServiceProvider{
    @Override
    public List<String> getJoke(int jokesNumber) {
        String url = "https://official-joke-api.appspot.com/random_joke";
        String json = "[]";

        List<String> jokeList = new ArrayList<>();
        jokeList.add("my first joke");
        return jokeList;
    }
}
