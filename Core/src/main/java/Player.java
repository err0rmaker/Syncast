import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;

/**
 * Created by KAREL on 26.01.2016.
 */
public class Player {

    private final MediaPlayer mediaPlayer;
    private final Media media;



    public Player() {

        media = new Media(new File(System.getProperty("user.home")+"/Syncast/user_01/sound/HelloInternet/episode_01.mp3").toURI().toString());

        mediaPlayer = new MediaPlayer(media);

    }

    public void play() {

        mediaPlayer.play();

    }
    public void stop() {
        mediaPlayer.stop();
    }

}
