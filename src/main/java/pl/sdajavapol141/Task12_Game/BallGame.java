package pl.sdajavapol141.Task12_Game;

import javafx.scene.Group;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;

public class BallGame extends Circle {

    private double radius;
    private final Text text;
    private double speedX;
    private double speedY;
    private boolean caught = false;
    public BallGame(double radius, String content, Color color, Group group) {
        super(radius, color);
        this.radius = radius;
        this.speedX = 0;
        this.speedY = 0;
        this.text = new Text(content);
        this.text.setFont(Font.font("Arial", 18));
        this.text.setFill(Color.WHITE);
        this.text.setX(-this.text.getBoundsInLocal().getWidth() / 2);
        this.text.setY(this.text.getBoundsInLocal().getHeight() / 4);
        group.getChildren().add(this.text);
    }
    public double getBallRadius() {
        return this.radius;
    }

    public double getSpeedX() {
        return speedX;
    }

    public void setSpeedX(double speedX) {
        this.speedX = speedX;
    }

    public double getSpeedY() {
        return speedY;
    }

    public void setSpeedY(double speedY) {
        this.speedY = speedY;
    }

    public boolean isCaught() {
        return caught;
    }

    public void setCaught(boolean caught) {
        this.caught = caught;
    }

}