    import javafx.application.Application;
    import javafx.scene.Group;
    import javafx.scene.Scene;
    import javafx.scene.layout.Pane;
    import javafx.stage.Stage;
    
    public class Main extends Application {
    
        public void start(Stage primaryStage) throws Exception{
            Group root = new Group();
            Pane pane = new Pane(root);
            Camera camera = new Camera(600, 0);
    
            GameScene theScene = new GameScene(pane, 800, 400, camera);

            theScene.render();
    
            primaryStage.setScene(theScene);
            primaryStage.show();
    
        }
            public static void main (String[]args){
                launch(args);
            }
    }
