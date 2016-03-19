import com.guigarage.flatterfx.FlatterFX;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sun.security.jca.GetInstance;

public class Main extends Application {



   Player player = new Player();
   RSSRead rssRead;

    public static Main instance;


    public Main(){
        instance = this;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("Core/mainApp.fxml"));


        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 1280, 780));
        primaryStage.show();

        rssRead = new RSSRead();

       // FlatterFX.style();

    }


    public static void main(String[] args) {
        launch(args);
    }

    public static  Main getInstance(){
        return instance;
    }
    public Player getPlayer() {
       return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }
}
