
package FirstArtWork;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ArtWorkOriginal extends JPanel {
    
    public ArtWorkOriginal() {
        this.setPreferredSize(new Dimension(500, 500));
    } // constructor

    private void draw(Graphics g) {
        // dibujar los ejes del plano cartesiano
        for (int i = 0; i < 1000; i++) {

            int r = (int) (Math.random()*(255));
            int d = (int) (Math.random()*(255));
            int b = (int) (Math.random()*(255));
            int t = (int) (Math.random()*(255));

            double x0 = (Math.random() * (0 - 600 + 1) + 600);
            double y0 = (Math.random() * (0 - 600 + 1) + 600);
            double x1 = (Math.random() * (0 - 600 + 1) + 600);
            double y1 = (Math.random() * (0 - 600 + 1) + 600);

            g.setColor(new Color(r, d, b, t));

            linearFunction(g, x0, y0, x1, y1);

        }
    }

    // funcion lineal f(x) = m x + b
    private void linearFunction(Graphics g, double x0, double y0, double x1, double y1) {

        double y =(Math.random() * (0 - 500 + 1) + 1000);
        //cálculo de pendiente y del término b (intersección con eje y
        //for(double x = x0; x <= x1; x += 1){
        for (double x = x0; x <= x1; x += 1) {
        }
        g.drawLine((int) x0, (int) y0, (int) x1, (int) y1);
    }//method

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);

    }

    public static void main(String[] args) {
        JFrame window = new JFrame("Graphing Function");
        window.setContentPane(new ArtWorkOriginal());
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        window.pack();
        window.setResizable(false);
        window.setLocation(150, 100);
        window.setVisible(true);
    }
}
