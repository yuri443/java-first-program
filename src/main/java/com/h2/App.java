package com.h2;

/**
 * lembre-se que você começou esse programa para ajudar os alunos a entender lógica de programação de computadores!!
 *
 */

public class App
{
    public static void main(String[] args){System.out.println("Hallo World");}

    public static int doubleTheNumber(int number){return 2 * number;}

    private static int add(int[] numbers){
        var sum = 0;
        for(int number : numbers){
            sum += number;
        }
        return sum;
    }
}