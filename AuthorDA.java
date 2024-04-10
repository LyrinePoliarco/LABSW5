
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
public class AuthorDA {
    private HashMap<String, Author> authorMap;
    public AuthorDA() throws FileNotFoundException {
        authorMap = new HashMap<>();
        Scanner file = new Scanner(new FileReader("C:\\Users\\lyyri\\GitHub\\LABSW5\\Author.csv"));

        while(file.hasNextLine()) {
            String rawLine = file.nextLine();
            String[] layFileArray = rawLine.split(",");

            Author author = new Author();
            author.setName(layFileArray[0].trim());
            author.setBio(layFileArray[1].trim());

            authorMap.put(author.getName(), author);
        }
    }
    public HashMap<String, Author> getAuthorMap(){
        return authorMap;
    }
}

