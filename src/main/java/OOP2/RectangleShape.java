package OOP2;

import java.awt.Graphics;

/**
 * Die Klasse {@code RectangleShape} implementiert das {@link ShapeDrawer}-Interface und stellt eine rechteckige geometrische Form dar.
 * Sie definiert die Position des linken oberen Eckpunkts des Rechtecks sowie seine Breite und Höhe.
 */
public class RectangleShape implements ShapeDrawer {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Konstruktor für die {@code RectangleShape}-Klasse. Erzeugt ein Rechteck mit den angegebenen Koordinaten und Größen.
     *
     * @param x      Die x-Koordinate des linken oberen Eckpunkts des Rechtecks.
     * @param y      Die y-Koordinate des linken oberen Eckpunkts des Rechtecks.
     * @param width  Die Breite des Rechtecks.
     * @param height Die Höhe des Rechtecks.
     */
    public RectangleShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Zeichnet das Rechteck mit den festgelegten Koordinaten und Größen auf dem gegebenen Graphics-Objekt.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen des Rechtecks.
     */
    @Override
    public void draw(Graphics g) {
        // Zeichnen Sie das Rechteck mit den festgelegten Koordinaten und Größen
        g.drawRect(x, y, width, height);
    }
}
