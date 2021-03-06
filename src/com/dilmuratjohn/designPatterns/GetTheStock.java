package com.dilmuratjohn.designPatterns;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable {

    private String stock;
    private double price;

    private Subject stockGrabber;

    GetTheStock(Subject stockGrabber, String stock, double price) {
        this.stockGrabber = stockGrabber;
        this.stock = stock;
        this.price = price;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("Error: " + e);
            }

            double randNum = (Math.random() * (.06)) - 0.3;

            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format((price + randNum)));

            if (stock.equals("IBM")) ((StockGrabber) stockGrabber).setIBMPrice(price);
            if (stock.equals("AAPL")) ((StockGrabber) stockGrabber).setAAPLPrice(price);
            if (stock.equals("GOOG")) ((StockGrabber) stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) + " " + df.format(randNum));
            System.out.println();
        }
    }
}
