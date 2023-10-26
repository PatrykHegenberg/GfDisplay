package OOP2;

import java.awt.Graphics;

/**
 * Die Klasse {@code CircleShape} stellt einen Kreis dar und implementiert das {@link ShapeDrawer}-Interface.
 * Sie definiert die Methode zum Zeichnen eines Kreises auf einer grafischen Oberfläche.
 */
public class CircleShape implements ShapeDrawer {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Konstruktor für die CircleShape-Klasse. Erzeugt einen Kreis mit den gegebenen Koordinaten und Größen.
     *
     * @param x      Die x-Koordinate des Mittelpunkts des Kreises.
     * @param y      Die y-Koordinate des Mittelpunkts des Kreises.
     * @param width  Die Breite des Kreises.
     * @param height Die Höhe des Kreises.
     */
    public CircleShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    /**
     * Zeichnet den Kreis auf dem gegebenen Graphics-Objekt.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen des Kreises.
     */
    @Override
    public void draw(Graphics g) {
        // Zeichnen Sie den Kreis mit den festgelegten Koordinaten und Größen
        g.drawOval(x, y, width, height);
    }
}
