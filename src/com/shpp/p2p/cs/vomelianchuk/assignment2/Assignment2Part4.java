package com.shpp.p2p.cs.vomelianchuk.assignment2;

import acm.graphics.GLabel;
import acm.graphics.GRect;

import java.awt.*;

/**
 * File: Assignment2Part4.java
 * Draws the flag of Germany
 */
public class Assignment2Part4 extends MyWindowProgram {

    // The default width and height of the window.
    public static final int APPLICATION_WIDTH = 900;
    public static final int APPLICATION_HEIGHT = 600;

    // Constants set the width and height of the flag
    private static final double FLAG_WIDTH = 500;
    private static final double FLAG_HEIGHT = 300;

    // The constant specifies the width of the flag part
    private static final double PART_HEIGHT = FLAG_HEIGHT / 3;

    public void run() {
        // calculates the initial points of the flag (upper left corner)
        double startPointX = (getWidth() / 2) - (FLAG_WIDTH / 2);
        double startPointY = (getHeight() / 2) - (FLAG_HEIGHT / 2);

        drawFlag(startPointX, startPointY);
        makeLabel();
    }

    /**
     * Draws the flag of Germany
     *
     * @param x The x coordinate of the upper-left corner of the flag
     * @param y The y coordinate of the upper-left corner of the flag
     */
    private void drawFlag(double x, double y) {
        drawPart(x, y, Color.BLACK);
        drawPart(x, y + PART_HEIGHT, Color.RED);
        drawPart(x, y + 2 * PART_HEIGHT, Color.YELLOW);
    }

    /**
     * Draws the flag of Germany
     *
     * @param x The x coordinate of the upper-left corner of the flag part
     * @param y The y coordinate of the upper-left corner of the flag part
     * @param color The color of part of the flag
     */
    private void drawPart(double x, double y, Color color) {
        GRect rect = new GRect(x, y, FLAG_WIDTH, PART_HEIGHT);
        paintFigure(rect, color);
        add(rect);
    }

    /**
     * Makes an inscription, from the bottom right corner of the program window
     */
    private void makeLabel() {
        GLabel label = new GLabel("Flag of Germany");
        label.setFont("Arial Black-20");

        // sets the initial coordinates of the label
        double textPositionX = getWidth() - label.getWidth();
        double textPositionY = getHeight() - label.getDescent();

        label.setColor(Color.BLACK);
        add(label, textPositionX,  textPositionY);
    }
}
