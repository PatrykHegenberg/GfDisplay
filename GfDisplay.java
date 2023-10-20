import java.awt.*;
import javax.swing.*;

// ShapeDrawer Interface für verschiedene geometrische Formen
interface ShapeDrawer {
    void draw(Graphics g, int x, int y, int width, int height);
}

// GfDisplay Klasse für die Darstellung von geometrischen Formen
public class GfDisplay extends JPanel {

    // Methode zum Zeichnen einer geometrischen Figur
    public void drawShape(ShapeDrawer shapeDrawer, int x, int y, int width, int height) {
        // Die paintComponent Methode wird aufgerufen, um die Figur zu zeichnen
        // this.shapeDrawer = shapeDrawer;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        repaint(); // Repaint aufrufen, um die Figur zu zeichnen
    }

    // Die paintComponent Methode wird überschrieben, um die Figur zu zeichnen
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (shapeDrawer != null) {
            shapeDrawer.draw(g, x, y, width, height);
        }
        // Hier wird die Figur gezeichnet
    }

    // Hauptmethode zum Testen der GfDisplay Klasse
    public static void main(String[] args) {
        // Erstellung eines JFrame-Fensters
        JFrame frame = new JFrame("GfDisplay Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        // Erstellung einer Instanz von GfDisplay
        GfDisplay gfDisplay = new GfDisplay();

        // Beispiel: Zeichnen eines Rechtecks mit GfDisplay
        gfDisplay.drawShape(new ShapeDrawer() {
            @Override
            public void draw(Graphics g, int x, int y, int width, int height) {
                g.drawRect(x, y, width, height);
            }
        }, 50, 50, 100, 50);

        // Fügen Sie GfDisplay zum JFrame-Fenster hinzu
        frame.add(gfDisplay);

        // Das JFrame-Fenster sichtbar machen
        frame.setVisible(true);
    }
}
