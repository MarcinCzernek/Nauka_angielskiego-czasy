package com.example;

import java.util.Scanner;

public class Source {

    public static void main(String args[]) {

        String[] word_pl = new String[]{"perspektywy", "emerytura", "wynagrodzenie(np.miesięczne)", "zapłata", "elastyczność", "siła", "przedstawienie / występ",
                "ścieżka kariery", "umiejętny / zręczny", "odważny / dzielny", "uczciwy / prawdomówny", "pewny siebie", "przekonywujący", "cierpliwy",
                "denerwujący", "trudny / uciążliwy", "rządzicielski / apodyktyczny", "ostrożny", "niedbały", "rozważny", "zarozumiały / nadęty", "ciekawski",
                "śmiały / mążny", "śmiałek / brawurowo odważny", "uparty w dążeniu do celu", "wymagający", "hojny", "chciwy / dusigrosz", "skromny", "zazdrosny",
                "pełen życia /ożywiony", "dojrzały", "poukładany / porządny", "otwarty / towarzyski", "kontaktowy / towarzyski", "zadufany w sobie / dumny",
                "godny zaufania", "odpowiedzialny", "samolubny", "głupiutki / niepoważny", "mądry / główkujący", "stały(w uczuciach / psychicznie)",
                "delikatny / czuły", "bojaźliwy / lękliwy", "próżny", "rozsądny / mądry", "społeczny", "szycie", "szyć / przeszłe formy",
                "zakład wyzyskujący pracowników", "żelazko", "prasowanie", "handel", "mieć na własność / być właścicielem", "bawełna", "wełna",
                "jedwab", "wolna posada", "pismo przewodnie", "zarabiać na życie",
        };

        String[] word_ang = new String[]{"prospects", "pension", "salary", "wage", "flexibility", "strength", "performance", "career path", "skilful",
                "brave", "honest", "self", "persuasive", "patient", "annoying", "awkward", "bossy", "careful", "careless", "cautious", "conceited",
                "curious", "courageous", "daring", "determined", "demanding", "generous", "mean", "humble", "jealous", "lively", "mature", "neat",
                "outgoing", "sociable", "proud", "reliable", "responsible", "selfish", "silly", "smart", "stable", "tender", "timid", "vain", "wise",
                "social", "sewing", "sew", "sweatshop", "iron", "ironing", "trade", "owe", "cotton", "wool", "silk", "vacancy",
                "covering letter", "do for a living"
        };
        //inicjlizowanie 20 randomowch liczb
        int[] rand = new int[20];
        for (int i = 0; i <= 19; i++) {
            rand [i]= (int) (Math.random() * 60);
            System.out.println(rand[i]);
        }


        int i=0;
        //petla które wykona sie 20 razy
        for(int j=0;j<=19;)
        {
            System.out.println(word_pl[rand[i]]);
            Scanner scanner=new Scanner(System.in);
            String user = scanner.nextLine();
            //jesli user wpisał poprawne słowo
            if(word_ang[rand[i]].equals(user))
            {
                System.out.println("*Gratulacje");
                word_ang[i]=null;
                i++;
                j++;
            }
            //jesli user wpisał zle słowo
            else
            {
                System.out.println("#Niestety nie");
                System.out.println(word_ang[rand[i]]);

            }
//wszystkie złe słowa wyświetlone po raz drugi tu :
        }
    }


}
