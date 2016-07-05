import java.util.Random;
import java.util.Scanner;


public class Main {


    static String miejsce = "miasto";
    public static void main(String[] args) {


        //int cena;
        Random generator = new Random();
        int losowa = generator.nextInt(50);
        System.out.println(losowa);
        losowa = generator.nextInt(50);
        System.out.println(losowa);

        String[] docelowe = {
                "Blizniaki..Zajazd u Freya..",          ///supertanie  / odpoczynek     0
                "Temeria..Pokoje u Wiedzmina..",        //supertanie  / odpoczynek      1
                "Pcim..Ostatni obiad u teściowej..",    //tanie  / odpoczynek           2
                "Zywiec..Ż jak Żywiec ",                //tanie  / odpoczynek           3
                "Las Samobojcow..",                     //srednie / odpoczynek          4
                "Meereen..Goscina u Matki Smokow..",    //srednie / odpoczynek          5
                "Sin City..Valkiria..",                 //drogie / odpoczynek           6
                "Zakopane..Harnaś..",                   //bardzo drogie / odpoczynek    7

                "Philadelphia..Dom w głębi lasu..",     //supertanie  / wycieczka       8
                "Dolina Krzemowa..Pod zlotym nerdem..", //supertanie  / wycieczka      9
                "Slask..U Bartka w goscinie..",         //tanie  / wycieczka           10
                "Atlantyda(Rejs)..Rybka lubi plywac..", //tanie  / wycieczka           11
                "New York..Wilk z Wall Street Style..", //srednie / wycieczka          12
                "Malediwy..U Midasa..",                 //drogie / wycieczka           13
                "Kraina czarów..U Alicji.."            //bardzo drogie / wycieczka    14
        };

        int[] cenyDocelowych = {100,125,250,270,360,450,800,1700,110,125,255,290,460,453,810,2700};


        int i = 0;
        boolean exit = true;
        boolean goodOption = true;
        int oferta = 0;
        int dni = 0;
        int fundusz =0;
        String wylot ="";
        String standard ="";
        Scanner scan = new Scanner(System.in);
        int dolnyZakres = 0;
        int gornyZakres = 0;

        do {
            goodOption = true;
            System.out.println("Witaj! Co mogę Ci zaproponować?");
            System.out.println("1-Wycieczke turystyczna");
            System.out.println("2-Jestem nastawiony na zwiedzaniea");
            System.out.println("3-Zaskocz mnie");
            System.out.println("4-Wyjscie");
            i = scan.nextInt();

/*
            if (i == 3) {
                i = generator.nextInt(2);
            }*/

            switch (i) {
                case 1: {

                    System.out.println("Na ile dni?");
                    dni = scan.nextInt();


                    System.out.println("Skąd wyjazd?");
                    System.out.println("1. Westeros");
                    System.out.println("2. Bialy dunajec");
                    System.out.println("3. Mordor");
                    System.out.println("4. Islandia");
                    i = scan.nextInt();
                    switch (i) {
                        case 1: {
                            oferta += 30;
                            wylot = "Westeros";
                            break;
                        }
                        case 2: {
                            oferta += 20;
                            wylot = "Bialy Dunajec";
                            break;
                        }
                        case 3: {
                            oferta += 10;
                            wylot = "Mordor";
                            break;
                        }
                        case 4: {
                            //oferta += 0;
                            wylot = "Islandia";
                            break;
                        }
                        default: {
                            oferta = 0;
                            System.out.println("Taka opcja nie istnieje");
                            goodOption = false;
                        }
                    }
                    if (goodOption) {
                        System.out.println("Jaki standard?");
                        System.out.println("1. Jak u mamy");
                        System.out.println("2. Jak u teściowej");
                        System.out.println("3. Pierwsza klasa");
                        System.out.println("4. Jak lord");


                        i = scan.nextInt();
                        switch (i) {
                            case 1: {
                                oferta += 10;
                                standard = "Jak u mamy";
                                break;
                            }
                            case 2: {
                                //oferta += 0;
                                standard = "Jak u teściowej";
                                break;
                            }
                            case 3: {
                                oferta += 20;
                                standard = "Pierwsza klasa";
                                break;
                            }
                            case 4: {
                                oferta += 30;
                                standard = "Jak lord";
                                break;
                            }
                            default: {
                                oferta = 0;
                                goodOption = false;
                                System.out.println("Taka opcja nie istnieje");
                            }
                        }
                    }

                    if(goodOption) {
                        System.out.println("Jakim funduszem dysponujesz?");
                        System.out.println("1. Jestem jak Richie Rich nie obchodzą mnie fundusze");
                        System.out.println("2. Jestem jak Student");
                        System.out.println("3. Jestem Bartek, place weglem");
                        System.out.println("4. Nie mam nic, wysępiłem piątke od żula");
                        System.out.println("5. Płaci teściowa");
                        i = scan.nextInt();
                        switch (i) {
                            case 1: {
                                dolnyZakres = 8;
                                gornyZakres = 14;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                        oferta = 0;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                dolnyZakres = 8;
                                gornyZakres = 9;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                        oferta = 0;
                                    }
                                }
                                break;
                            }
                            case 3: {
                                dolnyZakres = 8;
                                gornyZakres = 13;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                        oferta = 0;
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                oferta = 0;

                                break;
                            }
                            case 5: {
                                dolnyZakres = 8;
                                gornyZakres = 11;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                    }
                                }
                            }
                            default: {
                                oferta = 0;
                                goodOption = false;
                                System.out.println("Taka opcja nie istnieje");
                            }
                        }
                    }

                    break;
                }
                case 2: {
                    System.out.println("Na ile dni?");
                    dni = scan.nextInt();


                    System.out.println("Skąd wyjazd?");
                    System.out.println("1. Westeros");
                    System.out.println("2. Bialy dunajec");
                    System.out.println("3. Mordor");
                    System.out.println("4. Islandia");
                    i = scan.nextInt();
                    switch (i) {
                        case 1: {
                            oferta += 30;
                            wylot = "Westeros";
                            break;
                        }
                        case 2: {
                            oferta += 20;
                            wylot = "Bialy Dunajec";
                            break;
                        }
                        case 3: {
                            oferta += 10;
                            wylot = "Mordor";
                            break;
                        }
                        case 4: {
                            //oferta += 0;
                            wylot = "Islandia";
                            break;
                        }
                        default: {
                            oferta = 0;
                            goodOption = false;
                            System.out.println("Taka opcja nie istnieje");
                        }
                    }
                    if(goodOption) {


                        System.out.println("Jaki standard?");
                        System.out.println("1. Jak u mamy");
                        System.out.println("2. Jak u teściowej");
                        System.out.println("3. Pierwsza klasa");
                        System.out.println("4. Jak lord");


                        i = scan.nextInt();
                        switch (i) {
                            case 1: {
                                oferta += 10;
                                standard = "Jak u mamy";
                                break;
                            }
                            case 2: {
                                //oferta += 0;
                                standard = "Jak u teściowej";
                                break;
                            }
                            case 3: {
                                oferta += 20;
                                standard = "Pierwsza klasa";
                                break;
                            }
                            case 4: {
                                oferta += 30;
                                standard = "Jak lord";
                                break;
                            }
                            default: {
                                oferta = 0;
                                goodOption = false;
                                System.out.println("Taka opcja nie istnieje");
                            }
                        }
                    }

                    if(goodOption) {
                        System.out.println("Jakim funduszem dysponujesz?");
                        System.out.println("1. Jestem jak Richie Rich nie obchodzą mnie fundusze");
                        System.out.println("2. Jestem jak Student");
                        System.out.println("3. Jestem Bartek, place weglem");
                        System.out.println("4. Nie mam nic, wysępiłem piątke od żula");
                        System.out.println("5. Płaci teściowa");
                        i = scan.nextInt();
                        switch (i) {
                            case 1: {
                                dolnyZakres = 0;
                                gornyZakres = 7;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                        oferta = 0;
                                    }
                                }
                                break;
                            }
                            case 2: {
                                dolnyZakres = 0;
                                gornyZakres = 1;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                        oferta = 0;
                                    }
                                }
                                break;
                            }
                            case 3: {
                                dolnyZakres = 0;
                                gornyZakres = 6;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                        oferta = 0;
                                    }
                                }
                                break;
                            }
                            case 4: {
                                System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                oferta = 0;

                                break;
                            }
                            case 5: {
                                dolnyZakres = 1;
                                gornyZakres = 5;
                                for (int x = dolnyZakres; x <= gornyZakres; x++) {
                                    System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " + ((dni * oferta) + cenyDocelowych[x]) + "zl");
                                    System.out.println("1. Tak");
                                    System.out.println("2. Nie");
                                    i = scan.nextInt();
                                    if (i == 1) {
                                        System.out.println("Dziekuemy za dokonanie wyboru");
                                        break;
                                    } else if (x == gornyZakres) {
                                        System.out.println("Nie mamy wiecej ofert dla takich wymagan");
                                    }
                                }
                            }
                            default: {
                                oferta = 0;
                                goodOption = false;
                                System.out.println("Taka opcja nie istnieje");
                            }
                        }
                    }



                    break;
                }
                case 3: {

                    do
                    {

                        losowa  = generator.nextInt(14);
                        i = generator.nextInt(50);
                        System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[losowa] + "za " + ((dni * i)+cenyDocelowych[losowa]) + "zl");
                        System.out.println("1. Tak");
                        System.out.println("2. Nie");
                        System.out.println("3. Wyjdz");
                        i = scan.nextInt();
                        if (i == 1) {
                            System.out.println("Dziekuemy za dokonanie wyboru");
                            break;
                        }

                        ;
                    }while(i != 3);
                    break;
                }
                case 4: {
                    System.out.println("Zegnam i zapraszam ponownie");
                    exit = false;
                    break;
                }
                default: {
                    System.out.println("Taka opcja nie istnieje");
                }
            }
        }while(exit);
    }
}


/*
Pytanie: Skąd wyjazd?
        1: Westeros											/drogo
        2: Bialy dunajec								/srednio
        3: Mordor  (trzeba bedzie warunek w razie czego zeby nie pokazywalo Mordoru w punkcie docelowym jezeli sie jest z Mordoru)
        4: Islandia											/niedostepna :)

        System.out.println("Skąd wyjazd?");
                    System.out.println("1. Westeros");
                    System.out.println("2. Bialy dunajec");
                    System.out.println("3. Mordor");
                    System.out.println("4. Islandia");



        int dolnyZakres = 1;
        int gornyZakres = 5;
        for(int x = dolnyZakres; x < gornyZakres; x++)
        {
            System.out.println("Czy jestes zainteresowany wycieczka do " + docelowe[x] + "za " dni*oferta + "zl");
            System.out.println("1. Tak");
            System.out.println("2. Nie");
            i = scan.nextInt();
            if(i == 1) {break;}
            else if (x == gornyZakres--) {System.out.println("Nie mamy wiecej ofert dla takich wymagan");

        }




        System.out.println("Skąd wyjazd?");
        i = scan.nextInt();
        switch (i) {
                case 1: {
                    oferta += 30;
                    wylot = "Westeros";
                    break;
                }
                case 2: {
                    oferta += 20;
                    wylot = "Bialy Dunajec";
                    break;
                }
                case 3: {
                    oferta += 10;
                    wylot = "Mordor";
                    break;
                }
                case 4: {
                    //oferta += 0;
                    wylot = "Islandia";
                    break;
                }
                default: {
                    System.out.println("Taka opcja nie istnieje");
                }
            }




        Pytanie: Jaki standard?
        1: Jak u mamy									/tanio
        2: Jak u teściowej						/jeszcze taniej /uwaga mozna nie wrocic
        3: Pierwsza klasa							/drogo
        4: Jak lord										/najdrozej
        5: Razem z przewozem bydła na skrzynce.

        System.out.println("Jaki standard?");
        i = scan.nextInt();
        switch (i) {
                case 1: {
                    oferta += 10;
                    standard = "Jak u mamy";
                    break;
                }
                case 2: {
                    //oferta += 0;
                    wylot = "Jak u teściowej";
                    break;
                }
                case 3: {
                    oferta += 20;
                    wylot = "Pierwsza klasa";
                    break;
                }
                case 4: {
                    oferta += 30;
                    wylot = "Jak lord";
                    break;
                }
                default: {
                    System.out.println("Taka opcja nie istnieje");
                }
            }






        Pytanie: Fundusz?
        1: Jestem jak Richie Rich nie obchodzą mnie fundusze.   /wsztstkie opcje
        2: Jestem jak Student (biedny).                         / najnizsza oferta cenowa
        3: Jestem Bartek, place weglem.                          / srednia oferta cenowa wegiel dalej w cenie
        4: Nie mam nic, wysępiłem piątke od żula								/brak ofert
        5: Płaci teściowa.


        System.out.println("Jakim funduszem dysponujesz?");
                    System.out.println("1. Jestem jak Richie Rich nie obchodzą mnie fundusze");
                    System.out.println("2. Jestem jak Student");
                    System.out.println("3. Jestem Bartek, place weglem");
                    System.out.println("4. Nie mam nic, wysępiłem piątke od żula");
                    System.out.println("5. Płaci teściowa");



        System.out.println("Jakim funduszem dysponujesz?");
        i = scan.nextInt();
        switch (i) {
                case 1: {
                    oferta = 0;
                    break;
                }
                case 2: {
                    oferta += 50;
                    break;
                }
                case 3: {
                    oferta += 20;
                    break;
                }
                case 4: {
                    oferta = 1000;
                    break;
                }
                case 4: {
                    oferta += 10;
                    break;
                }
                default: {
                    System.out.println("Taka opcja nie istnieje");
                }
            }



*/