package com.example.jokeapp.service;

import java.util.List;

public interface JokeServiceProvider {
    List<String> getJoke(int jokesNumber);
}
