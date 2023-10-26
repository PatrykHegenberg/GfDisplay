package OOP2;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.*;

/**
 * Die Klasse {@code GfDisplay} stellt eine grafische Darstellung für verschiedene geometrische Formen bereit.
 * Sie erbt von {@link JPanel} und implementiert das {@link GfDisplayInterface} Interface.
 * Diese Klasse ermöglicht es, eine Liste von {@link ShapeDrawer}-Objekten zu zeichnen und sie mit der Maus zu bewegen.
 *
 * Beispiel zur Verwendung:
 * <pre>
 *     // Erstellen Sie eine Liste von ShapeDrawers
 *     List<ShapeDrawer> shapes = new ArrayList<>();
 *     shapes.add(new RectangleShape(50, 50, 100, 50)); // Rechteck mit Position (50, 50), Breite 100 und Höhe 50
 *     shapes.add(new CircleShape(150, 50, 60, 60)); // Kreis mit Mittelpunkt (150, 50) und Radius 30
 *
 *     // Initialisieren Sie das GfDisplay mit der Liste von ShapeDrawers
 *     GfDisplay.initDisplay(shapes);
 * </pre>
 *
 * @see JPanel
 * @see GfDisplayInterface
 * @see ShapeDrawer
 * @see RectangleShape
 * @see CircleShape
 * @see TriangleShape
 */
public class GfDisplay extends JPanel implements GfDisplayInterface {
    private List<ShapeDrawer> shapeDrawers;
    private ShapeDrawer selectedShape; // Das ausgewählte Shape für die Bewegung

    /**
     * Konstruktor für die GfDisplay-Klasse.
     *
     * @param shapeDrawers Die Liste von {@link ShapeDrawer}-Objekten, die gezeichnet werden sollen.
     */
    public GfDisplay(List<ShapeDrawer> shapeDrawers) {
        this.shapeDrawers = shapeDrawers;
        this.addMouseListener(new ShapeMouseListener());
    }

    /**
     * Zeichnet die Formen aus der übergebenen Liste von {@link ShapeDrawer}-Objekten.
     *
     * @param g Das {@link Graphics}-Objekt zum Zeichnen der Formen.
     */
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawShapes(shapeDrawers, g);
    }

    /**
     * Zeichnet die Formen aus der übergebenen Liste von {@link ShapeDrawer}-Objekten auf dem gegebenen Graphics-Objekt.
     *
     * @param shapes Die Liste von {@link ShapeDrawer}-Objekten, die gezeichnet werden sollen.
     * @param g      Das {@link Graphics}-Objekt zum Zeichnen der Formen.
     */
    @Override
    public void drawShapes(List<ShapeDrawer> shapes, Graphics g) {
        for (ShapeDrawer shapeDrawer : shapes) {
            shapeDrawer.draw(g);
        }
    }

    /**
     * Initialisiert ein JFrame-Fenster und zeigt die gezeichneten Formen an.
     *
     * @param shapeDrawers Die Liste von {@link ShapeDrawer}-Objekten, die gezeichnet werden sollen.
     */
    public static void initDisplay(List<ShapeDrawer> shapeDrawers) {
        JFrame frame = new JFrame("GfDisplay Test");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        GfDisplay gfDisplay = new GfDisplay(shapeDrawers);
        frame.add(gfDisplay);
        frame.setVisible(true);
    }

    /**
     * Die innere private Klasse, die als MouseListener für die GfDisplay-Komponente dient.
     * Sie ermöglicht es, Shapes mit der Maus zu bewegen, indem sie das ausgewählte Shape aktualisiert und es entsprechend verschiebt.
     */
    private class ShapeMouseListener extends MouseAdapter {
        private Point initialPoint; // Der Startpunkt des Drag-and-Drop-Vorgangs

        @Override
        public void mousePressed(MouseEvent e) {
            initialPoint = e.getPoint();
            // Überprüfen, ob ein Shape ausgewählt wurde
            for (ShapeDrawer shapeDrawer : shapeDrawers) {
                if (shapeDrawer.contains(initialPoint)) {
                    selectedShape = shapeDrawer;
                    break;
                }
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            selectedShape = null;
        }

        @Override
        public void mouseDragged(MouseEvent e) {
            if (selectedShape != null) {
                int dx = e.getX() - initialPoint.x;
                int dy = e.getY() - initialPoint.y;
                selectedShape.move(dx, dy);
                initialPoint = e.getPoint();
                repaint(); // Neu zeichnen, um das verschobene Shape anzuzeigen
            }
        }
    }
}

