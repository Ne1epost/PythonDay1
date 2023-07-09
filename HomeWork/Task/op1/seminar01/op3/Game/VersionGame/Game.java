package org.example.gb.op3.Game.VersionGame;

import org.example.gb.op3.Game.Answer;
import org.example.gb.op3.Game.GameStatus;

// Интерфейс взаимодействий Game (должны быть описаны сигнатуры методов start, inputValue, getGameStatus)
public interface Game {
    void start(int lengthWord, int countTry);
    Answer inputValue(String value);
    GameStatus getGameStatus();
}