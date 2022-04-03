import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class Parse {

        public static void main(String[] args) throws IOException {
            Document doc = Jsoup.connect("https://www.instagram.com/yurin_ok/").get();
            // Elements extends ArrayList<Element>.

                Element masthead = doc.select("srcset=").first();

                System.out.println("\t" + masthead);

        }

}
