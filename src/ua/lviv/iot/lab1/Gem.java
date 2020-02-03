package ua.lviv.iot.lab1;

public class Gem {

    private int caratNumber;

    private String name;

    private int price;

    private double weight;

    private String colour;

    protected boolean impurities;

    protected String form;

    private static int exAmount ;


    public Gem (int caratNumber, String name, int price, double weight, String colour, boolean impurities, String form){
        //  this.caratNumber = caratNumber;
        //this.name = name;
        //this.price = price;
        //this.weight = weight;
        //this.colour = colour;
        //this.impurities = impurities;
        //this.form = form;
        exAmount++;
        this.resetValues(caratNumber, name, price, weight, colour, impurities, form);
    };

    public Gem (int caratNumber, String name, int price, double weight){
        this(caratNumber, name, price, weight, "none", false, "none");
    };

    public Gem() {
        this(0,"none" ,0 ,0 ,"none" ,false ,"none" );
    }

    public int getCaratNumber() {
        return caratNumber;
    }

    public int getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public boolean isImpurities() {
        return impurities;
    }

    public String getForm() {
        return form;
    }

    public static int getExAmount() {
        return exAmount;
    }

    public void setCaratNumber(int caratNumber) {
        this.caratNumber = caratNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setImpurities(boolean impurities) {
        this.impurities = impurities;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public static void setExAmount(int exAmount) {
        Gem.exAmount = exAmount;
    }

    @Override
    public String toString() {
        return
                "caratNumber=" + caratNumber +
                        ", name='" + name + '\'' +
                        ", price=" + price +
                        ", weight=" + weight +
                        ", colour='" + colour + '\'' +
                        ", impurities=" + impurities +
                        ", form='" + form + '\'' ;


    }

    public static void printStaticExempAmount(){
        System.out.println("Exam amount = " + exAmount);
    }

    public void printExempAmount(){
        System.out.println("Exam amount = " + exAmount);
    }

    public void resetValues(int caratNumber, String name, int price, double weight, String colour, boolean impurities, String form){
        this.caratNumber = caratNumber;
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.colour = colour;
        this.impurities = impurities;
        this.form = form;
    }
}