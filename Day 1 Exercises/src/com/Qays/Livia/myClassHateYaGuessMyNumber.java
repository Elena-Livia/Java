package com.Qays.Livia;

public class myClassHateYaGuessMyNumber {
    int Noor ;

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
