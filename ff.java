import java.awt.Desktop;
import java.net.URI;

public class ff
 {

    public static void main(String[] args) throws Exception 
{
        String url = "http://stackoverflow.com";
  
        Desktop.getDesktop().browse(new URI(url));
} 
 
}
