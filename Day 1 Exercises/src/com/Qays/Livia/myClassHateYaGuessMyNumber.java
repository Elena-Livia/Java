package com.Qays.Livia;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class myClassHateYaGuessMyNumber {
    Scanner reader = new Scanner(System.in);

    public void acceptAndReverse (){
        int[] userInput = new int[5];
        for (int i = 0 ; i < 5 ; i++) {
             userInput[i] = reader.nextInt();

        }
        reader.close();
        for(int j = userInput.length-1 ; j >= 0 ; j--){
            System.out.print(userInput[j]);

        }
        System.out.println(Arrays.toString(userInput));
    }

 public int guessMyNumber(int x){
     if(x >= 0 && x <=10) {
        double rand =  Math.random();
        rand = Math.floor(rand);

        if (x == 5) {
            return 1;
        }else{
            return  2;
        }
     }
     return 0;
 }
}
