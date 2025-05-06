package com.ia.springaimcp.service;

import com.ia.springaimcp.client.ChuckNorrisJokeClient;
import com.ia.springaimcp.model.Joke;
import org.springframework.ai.tool.annotation.Tool;
import org.springframework.stereotype.Service;

@Service
public class JokeService {

    private final ChuckNorrisJokeClient chuckNorrisJokeClient;

    public JokeService(ChuckNorrisJokeClient chuckNorrisJokeClient) {
        this.chuckNorrisJokeClient = chuckNorrisJokeClient;
    }

    @Tool(name = "cn_get_random_joke", description = "Get a random joke about Chuck Norris")
    public Joke getRandomJoke() {
        return chuckNorrisJokeClient.getRandomJoke();
    }
}
