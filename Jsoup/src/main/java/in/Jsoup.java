package in;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements; 
import org.jsoup.Connection;

public class Jsoup {
    public static void main(String[] args) {
        String url = "https://books.toscrape.com/";
        try {	
            Document doc = Jsoup.connect(url).get();
            Elements books = doc.select(".product_pod");

            for (Element book : books) { 
                String title = book.select("h3 > a").text();
                String price = book.select(".price_color").text();
                String pr = price.substring(1);

                if (Double.parseDouble(pr) < 25) {
                    System.out.println(title + " - " + price);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

	private static Connection connect(String url) {
		// TODO Auto-generated method stub
		return null;
	}
}
