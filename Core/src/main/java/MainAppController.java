import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainAppController implements Initializable {

    Main main = Main.getInstance();

    Player player = main.getPlayer();
    @FXML
    private Button btnPlay;
    @FXML
    private Button btnStop;
    @FXML
    private Button btnAdd;


    @Override
    public void initialize(URL location, ResourceBundle resources) {


        btnPlay.setOnAction((event) -> {
            player.play();
        });
        btnAdd.setOnAction((event) -> {
            player.play();
        });


        btnStop.setOnAction((event) -> {
            player.stop();
        });


        }

    }


