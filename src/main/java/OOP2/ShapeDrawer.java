package OOP2;

import java.awt.Graphics;

/**
 * Das Interface {@code ShapeDrawer} definiert die Methode zum Zeichnen verschiedener geometrischer Formen.
 * Klassen, die dieses Interface implementieren, können verwendet werden, um spezifische Formen zu zeichnen.
 */
public interface ShapeDrawer {
    
    /**
     * Zeichnet die geometrische Form mit den festgelegten Koordinaten und Größen auf dem gegebenen Graphics-Objekt.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen der Form.
     */
    void draw(Graphics g);
}
