package edu.utpl.pizarra.tools;

import edu.utpl.pizarra.fx.components.Canvas;
import edu.utpl.pizarra.properties.Properties;


/**
 * An Eraser to erase your mistakes on a Canvas.
 */
public class Eraser extends Pen {

    /**
     * Create an eraser object.
     */
    public Eraser(Canvas canvas) {
	super(canvas);
    }

    @Override
    protected void startLine(double x, double y) {
	// Let the Pen class deal with most of this.
	super.startLine(x, y);
	line.setStroke(Properties.getBackColor());
    }

    @Override
    protected void endLine(double x, double y) {
	line.setEndX(x);
	line.setEndY(y);
	getCanvas().addErase(line);
    }

}
