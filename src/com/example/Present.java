package com.example;

import java.util.Scanner;

//Kodowanie trwa 24 godziny na dobę
/*
Author: Marcin Czernek
 */

public class Present {

    Scanner scan = new Scanner(System.in);

    public static void presentSimple(){
        System.out.println(ConsoleColor.BLUE_BOLD +  "Present Simple- czas terażniejszy prosty" + ConsoleColor.RESET);
        String info = "Czas Present simple to czas stosowany do  opisu  faktów, powtarzajacych się czynności w czasie terażniejszym. Stosujemy go w : czynności powtarzajace się, RUTYNY, NAWYKI, stany, fakty, ogólne prawdy o świecie, rozkłady jazdy i grafiki, preferencje i gusta, opisywanie wydarzeń z filmu, nawyki, instrukcje i wskazówki, nagłówki w gazetach.Przysłówki częstotliwości: always,never,sometimes,often,rarely.";
        String construction = "I am a doctor. Am I a doctor? You are a doctor. Are You a doctor? She is a doctor. Is she a doctor. --- I,You,They,We - study at university. She, He, It studies at WSB university. # Przy czasowniku dodajemy końcówkę -s. ZAPRZECZENIE: I/You/They/We do not/don't work. She/He/It does not/doesn't work. PYTANIE: Do I/You/We/They study? Does she/he/it ";
        System.out.println(info + "\n" + construction);

        String[] angSentence = {"He always wakes up at 7 a.m.", "We visit our grandparents every Sunday.", "They always eat during lesson.","We sometimes go for a run in the evening.","They never listen to music, when They study.","I like them because they are helpful.","She rarely eats breakfest at home.", "The train leaves in 5 minuts!","We see each other every day.","My parents always complain about everything.","He works out three times a day!", "We never wake up early on weekends."};
        String[] polSentence = {"On zawsze budzi się o 7 rano.", "Odwiedzamy naszych dziadków co niedzielę.", "Oni zawsze jedzą w trakcie lekcji.", "Czasami chodzimy pobiegać wieczorem.", "Oni nigdy nie słuchają muzyki, kiedy się uczą.", "Lubię ich, bo są pomocni.", "Ona rzadko je śniadanie w domu.", "Pociąg odjeżdża za 5 minut!", "Widzimy się codziennie.","Moi rodzice zawsze na wszystko narzekają.","On ćwiczy trzy razy dziennie!","Nigdy nie wstajemy wcześnie w weekendy."};

        //TODO ciągłe wstawianie 'are' przed czasownikiem
        //TODO at, in, on

        System.out.println("Ilośc pytań w puli " +angSentence.length);
        System.out.println("Uwaga, pisz znaki interpunkcyjne...\n");

        int[] rando_numbers = new int[12];

        for (int i = 0; i <= 11; i++) {
            rando_numbers[i] = (int) (Math.random() * 9);
        }

        int i = 0;
        for(int j=0;j<=19;){
            System.out.println(polSentence[rando_numbers[i]]);
            Scanner scanner = new Scanner(System.in);
            String user =scanner.nextLine();
            //Jeśli użytkownik wprowadzi poprawne słowo
            if (angSentence[rando_numbers[i]].equals(user)){
                System.out.println(ConsoleColor.GREEN_BOLD + "+Zdanie jest napisane poprawnie" + ConsoleColor.RESET);
                angSentence[i] = null;
                i++;
                j++;
            }else{
                System.out.println(ConsoleColor.RED +  "-Zdanie jest błędne" + ConsoleColor.RESET);
                System.out.println(angSentence[rando_numbers[i]]);
            }
        }
    }


    public static void presentContinous(){
        System.out.println( ConsoleColor.BLUE_BOLD +  "Present Continous - czas terażniejszy kontynuacyjny" + ConsoleColor.RESET);
        String info ="Czas present continous jest stosowany do opisu czynności, które odbywają się w tej chwili, przejściowe stany, opisywanie zmieniających się zjawisk, narzekanie na czyjeś zachowanie, zaplanowane czynośći w przyszłośći. Określenie czasu : now, right now, at the moment";
        String construction = "I am | You are | She,he,it is | We,they are\n" + "Zd. twierdzące : Osoba + am,is,are + czasownik z końcówką -ing" + "Przeczenie : am not, are not, is not (I’m not, aren’t, isn’t)\n" + "?Pytanie : am/is/are + osoba + czasownik-ing + reszta zdania\n" + "Pytanie przeczące: Aren’t/isn’t + osoba + czasownik-ing + reszta zdania\n";
        System.out.println(info + "\n" + construction);

        String [] polSentence = {"Ona się uśmiecha bo jedzie na festyn.","Dlaczego nie pijesz swojej kawy? Nie smakuje Ci?","Moja mama planuje wycieczkę do Grecji w tym roku. Odwiedzi tam znajomych","Nie ma mowy, żebym się na to zgodził!","Thomas ma teraz spotkanie z zarządem. Nie przeszkadzaj mu!","Czy masz problemy z oddychaniem?","Adam śpi. Czy moge coś przekazać?","Zawsze mylą mi się dawki leków","Czy zastanawiasz się nad przeprowadzką do innych krajów?","Nie przyjmę tej oferty pracy. Nie chcę jeszcze zmieniać miejsca pracy", "Kupuję nowy samochód","Nigdy więcej nie będę z nią rozmawiać","Adam zawsze się popisuje!"};
        String [] angSentence = {"She smilling because she is going to the fair","Why aren't you drinking your coffee? Don't you like it?","My mom is planning a trip to Grecce this year. She is visiting some friends there","There is no way that I'am agreeing to this","Thomas is having a meeting with board right now. Don't disturb him!","Are you having trouble breathing?","Adam is sleeping. Can I take a message?","I'am always mixing up the dosages of my meds","Are you thinking about moving to another countries?","I'am not taking the job offer. I don't want to change jobs just yet","I am buying a new car","I'm never talking to her again","Adam is always showing off!"};

        int [] randoNumber = new int[13];

        for(int i = 0; i<= 12;i++){
            randoNumber[i] = (int)(Math.random() * 9);

        }

        int i = 0;
        for(int j = 0;j<=19;j++){
            System.out.println(polSentence[randoNumber[i]]);
            Scanner scan = new Scanner(System.in);
            String user = scan.nextLine();
            //Jezeli użytkownik wprowadzi poprawne słowo
            if(angSentence[randoNumber[i]].equals(user)){
                System.out.println(ConsoleColor.GREEN_BOLD + "+Zdanie jest napisane poprawnie" + ConsoleColor.RESET);
                angSentence[i] = null;
                j++;
                i++;
            }else{
                System.out.println(ConsoleColor.RED +  "-Zdanie jest błędne" + ConsoleColor.RESET);
                System.out.println(angSentence[randoNumber[i]]);
            }
        }
    }



    public static void presentPerfectSimple(){
        System.out.println(ConsoleColor.BLUE_BOLD +  "Present Perfect Simple - czas terażniejszy perfekcyjny" + ConsoleColor.RESET);
        String info = "Czas present perfect jest stosowany do opisu czynności dopiero zakończonych. Czynności która ma skutki w terażniejszości. Czynności która rozpoczeła się w przeszłosci i trwa do dzisiaj.";
        String conctruction = "ZDANIE TWIERDZĄCE: I/You/They/We have - She/He/It has + czasownik w III formie (-ed).\nPRZECZENIE: have not, has not/haven't, hasn't.\nPYTANIE : Have/has + osoba + czasownik.\nOKRESLENIA CZASU : since, for, yet, already, just.";
        System.out.println(info + "\n" + conctruction);

        String [] polSentence = {"Właśnie skończyłem robić pracę domową.","Nie byłem w Paryżu.","Mieszkam w Nowym Jorku od dziesiećiu lat.","Czy byłeś tu wcześniej?","Mary czuje się żle odkąd zjadła za dużo","Mieszkam w Bukareszcie od trzech lat","Nigdy nie byliśmy w Wielkiej Brytanii.","Mój tata odczuwa ból w plecach. Miał wypadek.","Odkąd wybuch wulkan, nie widzieliśmy słońca.","To najpiekniejsza rzeżba jaką widziałem w życiu!","Bradley wspiął się na Mount Blanc trzy razy.","Nasz rząd zmienił prawo i będziemy płacić więcej pieniędzy w podatkach.","Czy powtórzyłeś już wiadomości do testu?","Jeszcze nie znalazłem mojej pracy marzeń.","Czy Gus był kiedykolwiek przyjacielem Walta?","W tamtym budynku był pożar.",};
        String [] engSentence = {"I've just finished my homework.","I haven't been to Paris.","I've lived in New York for ten years","Have you been here before?","Mary has been sick since she ate too much.","I have lived in Bucharest for three years.","We have never been in UK.","My dad feels pain in the back. He had an accident.","Since the vulcano erupted, we haven't seen sun.","This is the most beautiful sculpture I have ever seen in my live.","Bradley has climbed Mount Blanc three times.","Our government has just changed the law and we are going to pay more money in taxes.","Have you already revised for the test.","I haven't found my dream job yet","Has Gus ever been a friend of Walt's?","There's been a fire in that building."};

      int [] randoNumber = new int[16];

      for (int i = 0; i <=15;i++){
          randoNumber[i] = (int)(Math.random() * 9);
      }

        int i = 0;
        for(int j = 0;j<=19;j++){
            System.out.println(polSentence[randoNumber[i]]);
            Scanner scan = new Scanner(System.in);
            String user = scan.nextLine();
            //Jezeli użytkownik wprowadzi poprawne słowo
            if(engSentence[randoNumber[i]].equals(user)){
                System.out.println(ConsoleColor.GREEN_BOLD + "+Zdanie jest napisane poprawnie" + ConsoleColor.RESET);
                engSentence[i] = null;
                j++;
                i++;
            }else{
                System.out.println(ConsoleColor.RED +  "-Zdanie jest błędne" + ConsoleColor.RESET);
                System.out.println(engSentence[randoNumber[i]]);
                engSentence[i] = null;


            }
        }




    }

    public static void presentPerfectContinous(){
        System.out.println(ConsoleColor.BLUE_BOLD +  "Present Perfect Continous - czas terażniejszy perfekcyjny" + ConsoleColor.RESET);
        String info = " ";
        String construction = "Osoba He/She/It (I/You/We/They + have) + been + czasownik-ig + reszta zdania.\nPRZECZENIE:\nPYTANIE\nOKRESL. CZASU: for(2 days, weeks)-przez jakiś czas, how long-jak długo,for a long time-jak długo?,since-od,just-własnie ";
        System.out.println(info + "\n" + construction);

        String angSentence [] = {"I haven't been studying lately","I'am sorry I haven't been in touch lately but I've been working really long hours.","I am exhausted. I've been running arounds all day.","I've been trying to reach you since last night.","Tom has been having these migraines recently.","She has been practicing the piano a lot lately.","We,ve been eating out a lot recently.","I've been trying to figure this out for hours.","How much time has this been going on.","You haven't done the laundry or cooked dinner. What have you been doing all day? ","I haven't been drinking","I have been waiting for 10 minutes.","Have you been running?"};
        String polSentence [] = {"Ostatnio wcale się nie uczyłem.","Przepraszam że ostatnio długo nie utrzymywałem kontaktu, ale siedziałem długo w pracy.","Jestem wykończony. Załatwiałem różne sprawy cały dzień.","Starałem się skontaktować z tobą od zeszłej nocy.","Ostatnio Tom ma migreny","Ostatnio dużo ćwiczyła grę na pianinie","Ostatnio często jemy poza domem","Starałem się to rozgryźć godzinami.","Jak długo to trwało?","Nie zrobiłeś prania ani nie ugotowałeś kolacji. Co robiłeś cały dzień?","Czy wiedziałeś że mieszkali w piwnicy","Nie piłem.","Czekam od 10 minut.","Biegałeś?"};

        int randomNum [] = new int[14];

        //inicjlizowanie 20 randomowch liczb
        for(int i = 0;i <= 13;i++){
            randomNum[i] = (int)(Math.random() * 14);
        }

        int i =0;
        for (int j = 0;j <= 19;j++){
            System.out.println(polSentence[randomNum[i]]);
            Scanner scan = new Scanner(System.in);
            String user = scan.nextLine();
            if(angSentence[randomNum[i]].equals(user)){
                System.out.println(ConsoleColor.GREEN_BOLD + "+Zdanie jest napisane poprawnie" + ConsoleColor.RESET);
                angSentence[i] = null;
                i++;
                j++;
            }else{
                System.out.println(ConsoleColor.RED +  "-Zdanie jest błędne" + ConsoleColor.RESET);
                System.out.println(angSentence[randomNum[i]]);
                angSentence[i] = null;
            }

        }

    }
}

