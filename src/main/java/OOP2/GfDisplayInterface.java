package OOP2;

import java.awt.Graphics;
import java.util.List;

/**
 * Das Interface {@code GfDisplayInterface} definiert Methoden zum Zeichnen verschiedener geometrischer Formen
 * auf einer grafischen Oberfläche.
 */
public interface GfDisplayInterface {
    /**
     * Zeichnet eine Liste von geometrischen Formen mit den angegebenen ShapeDrawer-Objekten auf dem gegebenen Graphics-Objekt.
     *
     * @param shapes Die Liste von Objekten, die das {@link ShapeDrawer}-Interface implementieren und für das Zeichnen der Formen verwendet werden.
     * @param g      Das {@link Graphics}-Objekt zum Zeichnen der Formen.
     */
    void drawShapes(List<ShapeDrawer> shapes, Graphics g);
}
