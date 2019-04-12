package ThirdArtWork3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ArtWorkLandScape extends JPanel {

    public ArtWorkLandScape() {
        this.setPreferredSize(new Dimension(500, 500));
    }

    private void draw(Graphics gc) {

        for (int i = 0; i < 100; i++) {
            int r = (int) (Math.random() * (200));
            int d = (int) (Math.random() * (150));
            int b = (int) (Math.random() * (255));
            int t = (int) (Math.random() * (100));
            gc.setColor(new Color(r, d, b, t));
            gc.setColor(new Color(r, d, b, t));
            gc.setColor(Color.yellow);
            gc.setColor(Color.BLUE);
        }

        //óvalo
        gc.fillOval(100, 200, 70, 70);
        //óvalo
        gc.fillOval(100, 257, 30, 30);
        //óvalo
        gc.fillOval(140, 258, 30, 30);
        //rectangulo
        gc.fillRect(110, 154, 50, 50);
    }

    protected void paintComponent(Graphics gc) {
        super.paintComponent(gc);
        draw(gc);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphing Function");
        window.setContentPane(new ArtWorkLandScape());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        window.setBackground(Color.yellow);
        window.pack();
        window.setResizable(false);
        window.setLocation(150, 100);
        window.setVisible(true);
    }
}
