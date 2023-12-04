import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.geometry.Rectangle2D;
import javafx.animation.AnimationTimer;


public class GameScene extends Scene {
    protected Camera camera;
    private StaticThing leftBackground;
    private StaticThing rightBackground;
    private int NumberOfLives;
    private AnimationTimer timer;
    private Hero hero;
    public GameScene(Pane pane, double width, double height, Camera camera) {
        super(pane, width, height); // Creation d'un groupe
        this.camera = camera;
        NumberOfLives = 3;

        // Création des objets StaticThing pour l'arrière-plan gauche et droit
        this.leftBackground = new StaticThing(800, 400, "file:///C:/Users/gouja/Downloads/Ressources audio et image pour le runner-20231121/img/desert.png");
        this.rightBackground = new StaticThing(800, 400, "file:///C:/Users/gouja/Downloads/Ressources audio et image pour le runner-20231121/img/desert.png");

        // Positionnement des ImageView des arrière-plans
        leftBackground = new StaticThing(800, 400, "file:///C:/Users/gouja/Downloads/Ressources audio et image pour le runner-20231121/img/desert.png");
        leftBackground.getImageView().setViewport(new Rectangle2D(0, 0, 800, 400));
        leftBackground.getImageView().setX(0);
        leftBackground.getImageView().setY(0);
        pane.getChildren().add(leftBackground.getImageView());

        rightBackground = new StaticThing(800, 400, "file:///C:/Users/gouja/Downloads/Ressources audio et image pour le runner-20231121/img/desert.png");
        rightBackground.getImageView().setViewport(new Rectangle2D(0, 0, 800, 400));
        rightBackground.getImageView().setX(800);
        rightBackground.getImageView().setY(0);
        pane.getChildren().add(rightBackground.getImageView());

        //creation de l'objet hero
        hero = new Hero(0,0,"file:///C:/Users/gouja/Downloads/Ressources audio et image pour le runner-20231121/img/heros.png",1, 0);

        // Ajout de l'ImageView du Hero à la GameScene
        hero.getSpriteSheet().setViewport(new Rectangle2D(0,0, 75,100));
        hero.getSpriteSheet().setX(30);
        hero.getSpriteSheet().setY(250);
        pane.getChildren().add(hero.getSpriteSheet());

        AnimationTimer timer = new AnimationTimer() {
            public void handle(long time) {
                hero.update(time);
                camera.update(time);
                camera.setX(camera.getX());
                update(time);
            }
        };

        timer.start();
    }

    public void update(long time){


    }

    // Méthode pour modifier les positions sur la scène en fonction de la caméra
    public void render() {
        // Modifier la position des éléments en fonction de la position de la caméra
        leftBackground.getImageView().setLayoutX(leftBackground.getImageView().getX()-camera.getX());
        rightBackground.getImageView().setLayoutX(leftBackground.getImageView().getX()-camera.getX());
        leftBackground.getImageView().setLayoutY(leftBackground.getImageView().getY()-camera.getY());
        rightBackground.getImageView().setLayoutY(rightBackground.getImageView().getY()-camera.getY());


    }
}
