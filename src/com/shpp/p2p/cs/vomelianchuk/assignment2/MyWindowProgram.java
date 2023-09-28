package com.shpp.p2p.cs.vomelianchuk.assignment2;

import acm.graphics.GFillable;
import acm.graphics.GObject;
import com.shpp.cs.a.graphics.WindowProgram;

import java.awt.*;

/**
 * MyWindowProgram.java
 * Extends the class WindowProgram to add methods for drawing shapes
 */

public class MyWindowProgram extends WindowProgram {
    /**
     * Sets the shape's border color and interior color
     *
     * @param object The object is figure to be painted
     * @param color The color indicates which color to draw
     */
    public void paintFigure(GObject object, Color color) {
        object.setColor(color);
        fillFigure((GFillable) object, color);
    }

    /**
     * Fills the given shape with color
     *
     * @param object The object is a shape that needs to be filled with color
     * @param color The color indicates which color to fill the middle with
     */
    public void fillFigure(GFillable object, Color color) {
        object.setFilled(true);
        object.setFillColor(color);
    }
}
