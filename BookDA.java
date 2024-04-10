import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class BookDA {
    private HashMap<String, Book> bookMap;
    public BookDA() throws FileNotFoundException {
        bookMap = new HashMap<>();
        Scanner file = new Scanner(new FileReader("C:\\Users\\lyyri\\GitHub\\LABSW5\\Book.csv"));

        while(file.hasNextLine()) {
            String rawLine = file.nextLine();
            String[] layFileArray = rawLine.split(",");

            Book book = new Book();
            book.setIsbn(layFileArray[0].trim());
            book.setTitle(layFileArray[1].trim());
        
            AuthorDA author = new AuthorDA();
            book.setAuthor(author.getAuthorMap().get(rawFileArray[2].trim()));
            bookMap.put(book.getIsbn(), book);
        }
    }
    
    public HashMap<String, Book> getBookMap(){
        return bookMap;
    }
}
