//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import org.jsoup.Jsoup;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.parser.Parser;
import org.jsoup.select.Elements;


import java.io.*;

import java.net.URL;




public class RSSRead {
    private URL url;
    private Podcast podcast = new Podcast();
    private String xmlTemp;
    private File RSSFeedTXT;
    RSSRead(){
    //String html = "<?xml version=\"1.0\" encoding=\"UTF-8\"><tests><test><id>xxx</id><status>xxx</status></test><test><id>xxx</id><status>xxx</status></test></tests></xml>";
    String xml = getRSSFromTXT("C:/Users/karel/Syncast/user_01/RSS/podtoid.txt");
    Document docXML = Jsoup.parse(xml, "");
    Elements title = docXML.select("title");
        for(Element e: title){
            System.out.println(e.toString());
        }
    }


    //for(title:Element e{


    //}

    //docXML.


   // for (Element e : doc.select("item")) {
     //   System.out.println(e);
    //}

    public Podcast getPodcast(){
        return podcast;
    }

    public String getRSSFromTXT(String path){
        RSSFeedTXT = new File(path);
        String txt;
        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            while((txt = br.readLine()) != null){
                xmlTemp = xmlTemp + txt;

            }
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (IOException e2){
            e2.printStackTrace();
        }
return xmlTemp;

    }
}
