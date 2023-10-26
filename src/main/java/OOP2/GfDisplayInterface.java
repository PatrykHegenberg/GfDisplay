package OOP2;

import java.awt.*;
import java.util.List;

/**
 * Das Interface {@code GfDisplayInterface} definiert Methoden zum Zeichnen verschiedener geometrischer Formen
 * auf einer grafischen Oberfläche.
 */
public interface GfDisplayInterface {
    /**
     * Zeichnet eine Liste von geometrischen Formen mit den angegebenen Parametern.
     *
     * @param shapes Die Liste von Objekten, die das {@link ShapeDrawer}-Interface implementieren und für das Zeichnen der Formen verwendet werden.
     * @param g      Das {@link Graphics}-Objekt zum Zeichnen.
     */
    void drawShapes(List<ShapeDrawer> shapes, Graphics g);
}
