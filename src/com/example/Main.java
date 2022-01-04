package com.example;

import java.util.Scanner;

import static com.example.Future.futureSimple;
import static com.example.Present.*;
import static com.example.Past.*;

public class Main {


    public static void main(String[] args) {
        start();

    }

    public static void start(){
        System.out.println( ConsoleColor.YELLOW_BOLD + "Witaj w programie do nauki czasów jezyka angielskiego!" + ConsoleColor.RESET);
        System.out.println("Wybierz czas do nauki: ");
        System.out.println("---PRESENT TENSE---\n" + "1 Present Simple\n" + "2 Present Continous\n" + "3 Present Perfect Simple\n" + "4 Present Perfect Continous\n"
        + "---PAST TENSE---\n" +"5 Past Simple\n"  + "6 Past Continous\n" + "7 Past Perfect Simple\n" + "8 Past Perfect Continous\n" + "---FUTURE TENSE---\n" + "9 Future Simple\n" + "10 Future Continous\n" + "11 Future Perfect Simple\n" + "12 Future Perfect Continous\n");
        int choose = getInt();
        if(choose == 1){
            presentSimple();
        }else if(choose == 2){
            presentContinous();
        } else if (choose == 3){
            presentPerfectSimple();
        } else if(choose == 4){
            presentPerfectContinous();
        }else if(choose == 5) {
            pastSimple();
        }else if(choose == 6){
            pastContinous();
        }else if(choose == 9){
            futureSimple();
        }

    }


    private static int getInt() {
        return new Scanner(System.in).nextInt();
    }



}
