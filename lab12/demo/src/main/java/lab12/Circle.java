package lab12;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle {
    public void drawPicture(GraphicsContext gc, int width, int height) {

        gc.setFill(Color.WHITE);
        gc.fillRect(0, 0, width, height);

        for(int count = 0; count < 150; count++) {

            int centerWidth = (int)(width*Math.random());
            int centerHeight = (int)(height*Math.random());
            int randomChoice = (int)(4*Math.random());

            switch (randomChoice) {
                case 0:
                    gc.setFill(Color.RED);
                    break;
                case 1:
                    gc.setFill(Color.GREEN);
                    break;
                case 2:
                    gc.setFill(Color.BLUE);
                    break;
                case 3:
                    gc.setFill(Color.YELLOW);
                    break;
            }

            gc.fillOval(centerWidth - 30, centerHeight - 30, 60, 60);
            gc.setStroke(Color.BLACK);
            gc.strokeOval(centerWidth - 30, centerHeight - 30, 60, 60);
        }

    }
}
