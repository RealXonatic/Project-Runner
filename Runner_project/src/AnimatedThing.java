import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
public abstract class AnimatedThing {
    private double x;
    private double y;
    protected ImageView spriteSheet;
    protected int running, jumping;
    protected int index, frameDuration, maxIndex, sizeOfWindow, offsetFrames;

    public AnimatedThing(double x, double y, String fileName, int running, int jumping) {
        this.x = x;
        this.y = y;
        this.running = running;
        this.jumping = jumping;


        // Initialize the ImageView with the sprite sheet
        Image sprite = new Image(fileName);
        spriteSheet = new ImageView(sprite);



    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public ImageView getSpriteSheet() {
        return spriteSheet;
    }

    public void update(long time){

    }
}