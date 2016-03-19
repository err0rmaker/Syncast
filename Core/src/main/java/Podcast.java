import java.net.URL;

/**
 * Created by karel on 19.03.2016.
 */
public class Podcast {


    private URL url;
    private String name;

    public Podcast() {

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }
}
