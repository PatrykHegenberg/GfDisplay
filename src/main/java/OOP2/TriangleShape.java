package OOP2;

import java.awt.*;

/**
 * Die Klasse {@code TriangleShape} repräsentiert ein Dreieck und implementiert das {@link ShapeDrawer}-Interface.
 */
public class TriangleShape implements ShapeDrawer {
    private int[] xPoints;
    private int[] yPoints;

    /**
     * Konstruktor für die TriangleShape-Klasse.
     *
     * @param xPoints Die x-Koordinaten der Ecken des Dreiecks.
     * @param yPoints Die y-Koordinaten der Ecken des Dreiecks.
     */
    public TriangleShape(int[] xPoints, int[] yPoints) {
        if (xPoints.length != 3 || yPoints.length != 3) {
            throw new IllegalArgumentException("Ein Dreieck benötigt genau drei Punkte.");
        }
        this.xPoints = xPoints;
        this.yPoints = yPoints;
    }

    @Override
    public void draw(Graphics g) {
        g.drawPolygon(xPoints, yPoints, 3);
    }

    @Override
    public boolean contains(Point point) {
        Polygon polygon = new Polygon(xPoints, yPoints, 3);
        return polygon.contains(point);
    }

    @Override
    public void move(int dx, int dy) {
        for (int i = 0; i < xPoints.length; i++) {
            xPoints[i] += dx;
            yPoints[i] += dy;
        }
    }
}
