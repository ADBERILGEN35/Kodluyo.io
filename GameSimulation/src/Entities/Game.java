package Entities;

public class Game {
    private int id;
    private String gameName;
    private double price;
    private double discountedPrice;
    private double discountRate;

    public Game() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public Game(int id, String gameName, double price, double discountedPrice, double discountRate) {
        this.id = id;
        this.gameName = gameName;
        this.price = price;
        this.discountedPrice = discountedPrice;
        this.discountRate = discountRate;


    }
}
