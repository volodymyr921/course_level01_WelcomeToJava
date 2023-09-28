package com.shpp.p2p.cs.vomelianchuk.assignment2;

import acm.graphics.GOval;

import java.awt.*;

/**
 * Assignment2Part6.java
 * Draws a caterpillar.
 */
public class Assignment2Part6 extends MyWindowProgram {

    // The default width and height of the window.
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_HEIGHT = 400;

    // Determines the number of segments in the caterpillar
    public static final int NUMBER_SEGMENTS = 6;

    // Specifies the diameter and radius of the segment
    public static final double DIAMETER = 100;
    public static final double RADIUS = DIAMETER / 2;

    // Determines the distance between segments
    public static final double DISTANCE_BETWEEN_SEGMENTS_X = 1.2 * RADIUS;
    public static final double DISTANCE_BETWEEN_SEGMENTS_Y = 0.6 * RADIUS;

    // Specifies the new colors
    public static final Color DARK_GREEN = new Color(0, 187, 0);
    public static final Color DARK_RED = new Color(173, 0, 0);

    public void run() {
        drawCaterpillar();
    }

    /**
     * Draws the green caterpillar with red border
     */
    private void drawCaterpillar() {
        for (int i = 0; i < NUMBER_SEGMENTS; i++) {
            if (i % 2 == 0) {
                drawSegment(
                        i * DISTANCE_BETWEEN_SEGMENTS_X,
                        getHeight() / 2
                );
            } else {
                drawSegment(
                        i * DISTANCE_BETWEEN_SEGMENTS_X,
                        (getHeight() / 2) - DISTANCE_BETWEEN_SEGMENTS_Y
                );
            }
        }
    }

    /**
     * Draws green with red border segment caterpillar
     *
     * @param x The x coordinate of the upper-left corner of the segment
     * @param y The y coordinate of the upper-left corner of the segment
     */
    private void drawSegment(double x, double y) {
        GOval segment = new GOval(x, y, DIAMETER, DIAMETER);
        segment.setColor(DARK_RED);
        fillFigure(segment, DARK_GREEN);
        add(segment);
    }
}
