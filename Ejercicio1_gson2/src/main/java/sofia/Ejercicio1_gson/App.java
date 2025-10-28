package sofia.Ejercicio1_gson;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import sofia.Ejercicio1_gson.book.Book;

public class App {
    public static void main(String[] args) {
    	Gson gson = new Gson();
    	
    	 InputStream is = App.class.getResourceAsStream("/sofia/Ejercicio1_gson/data/books.json");
         if (is == null) {
             System.err.println("No se encontró el archivo en recursos");
             return;
         }

         try (InputStreamReader reader = new InputStreamReader(is)) {
            Type bookListType = new TypeToken<List<Book>>(){}.getType();
            List<Book> books = gson.fromJson(reader, bookListType);

            for (Book book : books) {
                System.out.println("Título: " + book.getTitle());
                System.out.println("Autor: " + book.getAuthor());
                System.out.println("--------------------");
            }
        } 
    	catch (IOException warn) {
            System.err.println("Error leyendo el archivo: " + warn.getMessage());
        }
    }
}
