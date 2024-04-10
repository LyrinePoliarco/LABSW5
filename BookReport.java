import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

public class BookReport {
    public static void main(String[] args) throws FileNotFoundException {
        BookDA bookDA = new BookDA();
        AuthorDA authorDA = new AuthorDA();

        HashMap<String, Book> bookMap = bookDA.getBookMap();
        HashMap<String, Author> authorMap = authorDA.getAuthorMap();

        for(HashMap.Entry<String, Book> entryMap : bookDA.getBookMap().entrySet()){
            System.out.println(entryMap.getValue().getIsbn()+" " + entryMap.getValue().getTitle() );
            System.out.println("\t" + entryMap.getValue().getAuthor().getName()+ " - " + entryMap.getValue().getAuthor().getBio() + "\n");
        }
    }
}

