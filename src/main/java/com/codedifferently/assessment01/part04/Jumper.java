package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    public int jumps(int k, int j) {
        int numberOfJumpsWithoutOverShooting = k/j;
        int remainingJumps = k%j;
        return numberOfJumpsWithoutOverShooting + remainingJumps;
    }
}
