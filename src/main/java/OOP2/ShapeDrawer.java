package OOP2;

import java.awt.*;

/**
 * Das Interface {@code ShapeDrawer} definiert Methoden zum Zeichnen verschiedener geometrischer Formen.
 * Klassen, die dieses Interface implementieren, können verwendet werden, um spezifische Formen zu zeichnen.
 */
public interface ShapeDrawer {
    /**
     * Zeichnet die geometrische Form mit den angegebenen Parametern.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen.
     */
    void draw(Graphics g);

    /**
     * Überprüft, ob der angegebene Punkt innerhalb der geometrischen Form liegt.
     *
     * @param point Der zu überprüfende Punkt.
     * @return {@code true}, wenn der Punkt innerhalb der Form liegt, sonst {@code false}.
     */
    boolean contains(Point point);

    /**
     * Bewegt die geometrische Form um die angegebenen Verschiebungswerte.
     *
     * @param dx Die Verschiebung entlang der x-Achse.
     * @param dy Die Verschiebung entlang der y-Achse.
     */
    void move(int dx, int dy);
}
