package OOP2;

import java.awt.Graphics;

/**
 * Die Klasse {@code TriangleShape} stellt ein Dreieck dar und implementiert das {@link ShapeDrawer}-Interface.
 * Sie definiert die Methode zum Zeichnen eines Dreiecks auf einer grafischen Oberfläche.
 */
public class TriangleShape implements ShapeDrawer {
    private int[] xPoints;
    private int[] yPoints;

    /**
     * Konstruktor für die TriangleShape-Klasse. Erzeugt ein Dreieck mit den gegebenen x- und y-Koordinaten.
     *
     * @param xPoints Die x-Koordinaten der Ecken des Dreiecks.
     * @param yPoints Die y-Koordinaten der Ecken des Dreiecks.
     * @throws IllegalArgumentException Wenn die Anzahl der x- oder y-Koordinaten nicht genau 3 ist.
     */
    public TriangleShape(int[] xPoints, int[] yPoints) {
        // Prüfen Sie, ob die Anzahl der x- und y-Koordinaten übereinstimmt
        if (xPoints.length != 3 || yPoints.length != 3) {
            throw new IllegalArgumentException("Ein Dreieck benötigt genau drei Punkte.");
        }
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    /**
     * Zeichnet das Dreieck auf dem gegebenen Graphics-Objekt.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen des Dreiecks.
     */
    @Override
    public void draw(Graphics g) {
        // Zeichnen Sie das Dreieck mit den festgelegten Koordinaten
        g.drawPolygon(xPoints, yPoints, 3);
    }
}
