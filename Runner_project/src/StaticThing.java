import javafx.scene.image.ImageView;
import javafx.scene.image.Image;

public class StaticThing {
    private double sizeX;
    private double sizeY;
    private ImageView imageView;

    public StaticThing(double sizeX, double sizeY, String fileName) {
        this.sizeX = sizeX;
        this.sizeY = sizeY;
        Image image = new Image(fileName);
        imageView = new ImageView(image);
        imageView.setFitWidth(sizeX);
        imageView.setFitHeight(sizeY);
    }

    public ImageView getImageView() {
        return imageView;
    }
}
