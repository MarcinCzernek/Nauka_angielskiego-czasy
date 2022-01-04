package com.example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Past {

    public static void pastSimple(){

        System.out.println(ConsoleColor.BLUE_BOLD + "Past Simple - czas przeszły zwykły." + ConsoleColor.RESET);
        String info = "Czas Past Simple jest stosowany do opisu czynnośći która zakończyła się w przeszłości. Mamy podane dokładne określenie czasu. Czynności jedna po drugiej w przeszłośći. Czynności które trwały przez jakiś czas w przeszłości, ale już się zakończyły. Zwyczaj, przyzwyczajenia z przeszłośći. Drugi okres warunkowy - używamy do mówienia o mało realnych wydarzeniach.\nOkreślenia czasu : yesterday, last week, five years ago\n";
        String construction = ConsoleColor.CYAN_BOLD + "Czasownik 'to be' "+ConsoleColor.RESET+ ": Być   - was/were  I/she/he/it was very busy. You/we/they were worked in IT. I/she/he/it wasn't ready for this project." + ConsoleColor.CYAN_BOLD +"Pytanie (inwersja): " + ConsoleColor.RESET + " Was I a programmer? Were They learned a new skill?\n" + ConsoleColor.CYAN_BOLD + "Czasowniki regularne -ed " + ConsoleColor.RESET + "- I washed a dishes " +  ConsoleColor.CYAN_BOLD +  " Nieregularne II forma " + ConsoleColor.RESET+ " - He broke a glass\n" + ConsoleColor.CYAN_BOLD + "Czasownik z did : " + ConsoleColor.RESET +"Did you visit her? When did you visit her? What did he buy? I didn't see anything.\nWho bought these flowers? ";
        System.out.println(info + construction);

        String [] polSentence = {"Wczoraj pojechaliśmy do domu.","Pomogli nam przewozić meble w zeszłym tygodniu.","Przestaliśmy rozmawiać wiele lat temu","Na szczęście John zgodził się na moją propozycję","Moi przyjaciele skończyli szkołę zeszłego lata.","Nie pojechaliśmy na plażę w zeszłym tygodniu bo padało.","Czy słyszałeś? Jenny i Dan wczoraj zerwali.","Biegacz nie ukończył wyścigu bo skręcił kostkę.","Pracowałem bardzo ciężko, ale nie udało mi się dostać wymarzonej pracy.","Julia się nie uczyła, ale zdała test.","Nauczyłem się mówić po angielsku w zeszłym roku. ","Nie wiedziałem że tutaj jesteś.","Zobaczyliśmy psa w twoim domu.","Wczoraj poszedłem do szkoły.","Czy spodobał ci się film?"};
        String [] angEntence = {"We drove home yesterday.","They helped us move furniture last week.","We stopped talking many years ago.","Fortunatly, John agreed to my sugestion.","My friends graduated last summer.","We didn't go to the beach last week because of the rain. ","Have you heard? Jenny and Dan broke up yesterday.","The runner didn’t finish the race because he sprained his ankle.","I worked really hard, but I didn’t manage to get my dream job.","Julia didn't study but she passed the test.","Did you know that he moved to our neighborhood?","I learned how to speak English last year.","I didn't know you were there.","We saw a dog in your house.","I went to school yesterday.","Did you like the movie?"};

        System.out.println("Ilośc pytań w puli " +angEntence.length);
        System.out.println("Uwaga, pisz znaki interpunkcyjne...\n");

        Integer[] randomNum = new Integer[(int)(Math.random() * (6 - 20) + 20)];
        for (int i = 0; i < randomNum.length; i++){
            randomNum[i] = i;
        }
        Collections.shuffle(Arrays.asList(randomNum));



        int i =1;
        for(int j = 0; j <= 19; j++){
            System.out.println(polSentence[randomNum[i]]);
            Scanner scanner = new Scanner(System.in);
            String user = scanner.nextLine();
            if(angEntence[randomNum[i]].equals(user)){
                System.out.println(ConsoleColor.GREEN_BOLD + "+Zdanie jest napisane poprawnie" + ConsoleColor.RESET);
                angEntence[i] = null;
                i++;
                j++;
            }else{
                System.out.println(ConsoleColor.RED +  "-Zdanie jest błędne" + ConsoleColor.RESET);
                System.out.println(angEntence[randomNum[i]]);
                angEntence[i] = null;
            }
        }

    }

    public static void pastContinous(){
        System.out.println(ConsoleColor.BLUE_BOLD + "Czas Past Continous - czas przeszły ciągły" + ConsoleColor.RESET);
        String info = "Czas Past Continous jest stosowany do opisu czynności które wydarzyły się w przeszłosci w określonym czasie. Dłuższe czynności w przeszłości (przerwane czynnością krótką), opis sytuacji w tle, czynność, która była w trakcie trwania w konkretnym czasie w przeszłości. Zrealizowanych w przeszłości planach. OKRESlENIA CZASU: while, when";
        String construction = "";
        System.out.println(info + construction);
    }


}
