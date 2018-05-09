package com.Qays.Livia;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println("Hello love ya ");

        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number Please");
        for (int i = 0; i < 3; i++) {
            int n = reader.nextInt(); // Scans the next token of the input as an int.
            myClassHateYaGuessMyNumber Game = new myClassHateYaGuessMyNumber();

            if(Game.guessMyNumber(n) == 0){
                System.out.println("Out Of Bounders");
            }else if (Game.guessMyNumber(n) == 1){
                System.out.println("Congratulation!! You win!!");
            }else if(Game.guessMyNumber(n)== 2){
                System.out.println("Congratulation!! You lost !!");
            }else {
                System.out.println("Game Over");

            }

        }
        //once finished
        reader.close();

    }
}
