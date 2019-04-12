package SecondArtWork;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ArtWorkFractal extends Application {

    private final int WIDTH = 400;
    private final int HEIGHT = 400;
    private Pane pane;
    private Scene scene;
    private Canvas canva;

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Graphics");
        initComponents(primaryStage);
        primaryStage.show();
    }

    //inicializo componentes
    private void initComponents(Stage primaryStage) {
        //creo el pane y el scene para el primary stage
        this.pane = new Pane();
        this.scene = new Scene(this.pane, WIDTH, HEIGHT);
        //lienzo para pintar
        this.canva = new Canvas(WIDTH, HEIGHT);
        this.pane.getChildren().add(this.canva);
        GraphicsContext gc = this.canva.getGraphicsContext2D();
        draw(gc);
        primaryStage.setScene(this.scene);
    }

    private void draw(GraphicsContext gc) {
        //Por si se quiere mostrar mas cargado con Rectangulos 

//        for (double x = -500; x <= 300; x += 5) {
//            for (double i = x - 650; i <= 300; i += 5) {
//                //óvalo sin relleno
//                gc.strokeRect(x, i, 400, 10000);
//            }
//            
//            gc.rotate(45);
//        }

        for (double x = 50; x <= 500; x+=5) {
            for (double i = x -50; i <= 500; i+=5) {
                //óvalo sin relleno
                gc.strokeOval(x, i, 200, 300);
            }
            gc.rotate(45);
        }
    }
}
