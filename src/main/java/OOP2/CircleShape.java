package OOP2;

import java.awt.*;

/**
 * Die Klasse {@code CircleShape} repräsentiert einen Kreis und implementiert das {@link ShapeDrawer}-Interface.
 */
public class CircleShape implements ShapeDrawer {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Konstruktor für die CircleShape-Klasse.
     *
     * @param x      Die x-Koordinate des Mittelpunkts des Kreises.
     * @param y      Die y-Koordinate des Mittelpunkts des Kreises.
     * @param width  Die Breite des Kreises (Durchmesser).
     * @param height Die Höhe des Kreises (Durchmesser).
     */
    public CircleShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.drawOval(x, y, width, height);
    }

    @Override
    public boolean contains(Point point) {
        int radius = width / 2;
        int centerX = x + radius;
        int centerY = y + radius;
        int dx = point.x - centerX;
        int dy = point.y - centerY;
        return dx * dx + dy * dy <= radius * radius;
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
