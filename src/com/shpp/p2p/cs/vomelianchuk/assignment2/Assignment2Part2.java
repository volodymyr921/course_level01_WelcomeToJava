package com.shpp.p2p.cs.vomelianchuk.assignment2;

import acm.graphics.GOval;
import acm.graphics.GRect;

import java.awt.*;

/**
 * File: Assignment2Part2.java
 * Create a white rectangle that overlaps the four black circles.
 */
public class Assignment2Part2 extends MyWindowProgram {

    // Constants that control the size of the application window
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;

    // The diameter of each circle
    public static final int DIAMETER = 100;

    // The radius of each circle
    public static final int RADIUS = DIAMETER / 2;

    public void run() {
        drawCircles();
        drawRectangle();
    }

    /**
     * Draws four black circles located in the corners of the program
     */
    private void drawCircles() {
        add(drawCircle(0, 0));
        add(drawCircle(getWidth() - DIAMETER, 0));
        add(drawCircle(0, getHeight() - DIAMETER));
        add(drawCircle(getWidth() - DIAMETER, getHeight() - DIAMETER));
    }

    /**
     * Draws circle with the origin in the given coordinates
     *
     * @param x The x coordinate where the circle starts
     * @param y The y coordinate where the circle starts
     *
     * @return The black circle object
     */
    private GOval drawCircle(double x, double y) {
        GOval circle = new GOval(x, y, DIAMETER, DIAMETER);
        paintFigure(circle, Color.BLACK);
        return circle;
    }

    /**
     * Draws a rectangle where its corners lie at the center of 4 circles
     */
    private void drawRectangle() {
        GRect rectangle = new GRect(
                RADIUS,
                RADIUS,
                getWidth() - DIAMETER,
                getHeight() - DIAMETER
        );
        paintFigure(rectangle, Color.WHITE);
        add(rectangle);
    }
}
