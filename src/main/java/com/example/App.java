package com.example;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class App {

    public static void main(String[] args) {

        int size = 500;

        BufferedImage image =
                new BufferedImage(size, size, BufferedImage.TYPE_INT_RGB);

        Graphics2D graphics = image.createGraphics();

        // White background
        graphics.setColor(Color.WHITE);
        graphics.fillRect(0, 0, size, size);

        // Black square
        graphics.setColor(Color.BLACK);
        graphics.fillRect(100, 100, 300, 300);

        graphics.dispose();

        try {
            ImageIO.write(image, "png", new File("square.png"));
            System.out.println("Square image created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}