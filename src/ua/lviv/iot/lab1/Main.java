package ua.lviv.iot.lab1;

public class Main {
    private static final int countExemp = 4;

    public static void main(String[] args) {
        Gem g1 = new Gem();
        System.out.println("Information of object 1 : " + g1);
        Gem g2 = new Gem(3, "Diamond", 1000, 5.05, "blue", false, "elipse");
        System.out.println("Information of object 2 : " + g2);
        Gem g3 = new Gem(5, "Emerald", 2000, 7.55, "green", true, "oval");
        System.out.println("Information of object 3 : " + g3);

        Gem[] array = new Gem[countExemp];
        int i = 0;
        do {
            array[i] = new Gem();
            i++;
        }
        while (i < countExemp);

        System.out.println("Elements of collection : ");
        for (Gem gem : array) {
            System.out.println(gem);
        }

        Gem.printStaticExempAmount();
    }

}
