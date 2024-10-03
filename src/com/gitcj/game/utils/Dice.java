package com.gitcj.game.utils;

import java.util.*;

public class Dice {
    public static void generateNumbers(){
        Random rand = new Random();
        int[] dices;
        dices = new int[16];
        for (int i = 0; i < 8; i++) {
            dices[i] = rand.nextInt(7);
        }
        Arrays.sort(dices);
    }


}
