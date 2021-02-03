package Book;

import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Book bookOne = new Book("Animal Farm", 2003, "George Orwell");
        Book bookThree = new Book("The Documents in the Case", 2002);
        Book bookTwo = new Book("The Documents in the Case", 1930,"Dorothy Sayers", "Robert Eustace");

        //Library library = new Library(bookOne,bookThree,bookTwo);
        List<Book> books = new ArrayList<Book>();
        books.add(bookOne);
        books.add(bookTwo);
        books.add(bookThree);

        Collections.sort(books);

        books.stream().sorted(new BookComparator());

       // for (Book book : library) {
       //     System.out.println(book.getTitle());
       // }

        //Iterator<Book> iterator = library.iterator();
       // while(iterator.hasNext()){
       //     System.out.println(iterator.next().getTitle());
       // }
    }
}
