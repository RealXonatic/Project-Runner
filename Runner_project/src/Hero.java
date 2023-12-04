import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.animation.AnimationTimer;
import javafx.geometry.Rectangle2D;


public class Hero extends AnimatedThing {

    private long lastTime = 0;
    private final int frameDuration = 200_000_000; // Durée de chaque frame en nanosecondes


    public Hero(double x, double y, String fileName, int running, int jumping) {
        super(x, y, fileName, running, jumping);
    }

    @Override
    public void update(long time) {
        if (running == 1) {
            updateRunningFrames(time);
        } else if (jumping == 1) {
            updateJumpingFrames(time);}
    }

    private void updateRunningFrames(long time) {

        if (time - lastTime >= frameDuration) {
            index = (index + 1) % 6;
            spriteSheet.setViewport(new Rectangle2D(index*84+5, 0, 75, 100));
            lastTime = time;
        }
    }

    private void updateJumpingFrames(long time) {

        if (time - lastTime >= frameDuration) {
            index = (index + 1) % 2;
            spriteSheet.setViewport(new Rectangle2D(index*84+5,163, 75, 100));
            lastTime = time;
        }
    }

    public double getX() {
        return super.getX();
    }

    public double getY() {
        return super.getY();
    }
}
