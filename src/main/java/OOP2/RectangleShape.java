package OOP2;

import java.awt.*;

/**
 * Die Klasse {@code RectangleShape} repräsentiert ein Rechteck und implementiert das {@link ShapeDrawer}-Interface.
 */
public class RectangleShape implements ShapeDrawer {
    private int x;
    private int y;
    private int width;
    private int height;

    /**
     * Konstruktor für die RectangleShape-Klasse.
     *
     * @param x      Die x-Koordinate des Ursprungspunkts des Rechtecks.
     * @param y      Die y-Koordinate des Ursprungspunkts des Rechtecks.
     * @param width  Die Breite des Rechtecks.
     * @param height Die Höhe des Rechtecks.
     */
    public RectangleShape(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    public boolean contains(Point point) {
        return (point.x >= x && point.x <= x + width && point.y >= y && point.y <= y + height);
    }

    @Override
    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
