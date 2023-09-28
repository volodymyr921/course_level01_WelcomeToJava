package com.shpp.p2p.cs.vomelianchuk.assignment2;

import acm.graphics.GOval;

import java.awt.*;

/**
 * File: Assignment2Part3.java
 * Allows you to draw two black quotes
 */
public class Assignment2Part3 extends MyWindowProgram {
    /* Constants controlling the relative positions of the
     * three toes to the upper-left corner of the pawprint. */
    private static final double FIRST_TOE_OFFSET_X = 0;
    private static final double FIRST_TOE_OFFSET_Y = 20;
    private static final double SECOND_TOE_OFFSET_X = 30;
    private static final double SECOND_TOE_OFFSET_Y = 0;
    private static final double THIRD_TOE_OFFSET_X = 60;
    private static final double THIRD_TOE_OFFSET_Y = 20;

    /* The position of the heel relative to the upper-left
     * corner of the pawprint. */
    private static final double HEEL_OFFSET_X = 20;
    private static final double HEEL_OFFSET_Y = 40;

    // Each toe is an oval with this width and height.
    private static final double TOE_WIDTH = 20;
    private static final double TOE_HEIGHT = 30;

    // The heel is an oval with this width and height.
    private static final double HEEL_WIDTH = 40;
    private static final double HEEL_HEIGHT = 60;

    // The default width and height of the window.
    public static final int APPLICATION_WIDTH = 300;
    public static final int APPLICATION_HEIGHT = 250;

    public void run() {
        drawPawprint(20, 20);
        drawPawprint(180, 70);
    }

    /**
     * Draws a pawprint. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
     */
    private void drawPawprint(double x, double y) {
        drawHeel(x, y);
        drawToes(x, y);
    }

    /**
     * Draws a heel. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint.
     *
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint.
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint.
     */
    private void drawHeel(double x, double y) {
        GOval heel = new GOval(
                x + HEEL_OFFSET_X,
                y + HEEL_OFFSET_Y,
                HEEL_WIDTH,
                HEEL_HEIGHT
        );
        paintFigure(heel, Color.BLACK);
        add(heel);
    }

    /**
     * Draws toes. The parameters should specify the upper-left corner of the
     * bounding box containing that pawprint
     *
     * @param x The x coordinate of the upper-left corner of the bounding box for the pawprint
     * @param y The y coordinate of the upper-left corner of the bounding box for the pawprint
     */
    private void drawToes(double x, double y) {
        drawToe(x + FIRST_TOE_OFFSET_X, y + FIRST_TOE_OFFSET_Y);
        drawToe(x + SECOND_TOE_OFFSET_X, y + SECOND_TOE_OFFSET_Y);
        drawToe(x + THIRD_TOE_OFFSET_X, y + THIRD_TOE_OFFSET_Y);
    }

    /**
     * Draws a toe. The parameters should specify the upper-left corner of the toe
     *
     * @param x The x coordinate of the upper-left corner of the toe
     * @param y The y coordinate of the upper-left corner of the toe
     */
    private void drawToe(double x, double y) {
        GOval toe = new GOval(x, y, TOE_WIDTH, TOE_HEIGHT);
        paintFigure(toe, Color.BLACK);
        add(toe);
    }
}
