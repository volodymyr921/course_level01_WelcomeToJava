package com.shpp.p2p.cs.vomelianchuk.assignment2;

import acm.graphics.GRect;

import java.awt.*;

/**
 * Assignment2Part5.java
 * Draws a matrix of black boxes separated by "streets".
 */
public class Assignment2Part5 extends MyWindowProgram {

    // The default width and height of the window.
    public static final int APPLICATION_WIDTH = 400;
    public static final int APPLICATION_HEIGHT = 400;

    /* The number of rows and columns in the grid, respectively. */
    private static final int NUM_ROWS = 5;
    private static final int NUM_COLS = 6;

    /* The width and height of each box. */
    private static final double BOX_SIZE = 40;

    /* The horizontal and vertical spacing between the boxes. */
    private static final double BOX_SPACING = 10;

    public void run() {
        /*
        Centers the overall illusion in the middle, for this,
        it finds the coordinates of the upper left corner of the entire image using the formula
        */
        double startPosX = (getWidth() / 2) -
                (((double)NUM_COLS / 2) * BOX_SIZE) -
                (((double)NUM_COLS / 2 - 0.5) *  BOX_SPACING);
        double startPosY = (getHeight() / 2) -
                (((double)NUM_ROWS / 2) * BOX_SIZE) -
                (((double)NUM_ROWS / 2 - 0.5) * BOX_SPACING);

        drawBoxes(startPosX, startPosY);
    }

    /**
     * Draws black boxes separated by "streets"
     *
     * @param x The x coordinate of the upper-left corner of the illusion
     * @param y The y coordinate of the upper-left corner of the illusion
     */
    private void drawBoxes(double x, double y) {
        for (int i = 0; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS; j++) {
                drawBox(
                        x + (i * (BOX_SIZE + BOX_SPACING)),
                        y + (j * (BOX_SIZE + BOX_SPACING))
                );
            }
        }
    }
    /**
     * Draws black box
     *
     * @param x The x coordinate of the upper-left corner of the box
     * @param y The y coordinate of the upper-left corner of the box
     */
    private void drawBox(double x, double y) {
        GRect rect = new GRect(x, y, BOX_SIZE, BOX_SIZE);
        paintFigure(rect, Color.BLACK);
        add(rect);
    }
}
