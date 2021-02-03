package Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book implements Comparable<Book> {

    private String title;
    private int year;
    private List<String> authors;

    public Book(String title,int year,String... authors){
        this.setTitle(title);
        this.setYear(year);
        this.setAuthors(authors);
    }

    private void setAuthors(String... authors) {
        if(authors.length == 0){
            this.authors=new ArrayList<String>();
        }else {
            this.authors = Arrays.asList(authors);
        }
    }

    private void setYear(int year) {
        this.year=year;
    }

    private void setTitle(String title) {
        this.title=title;
    }

    public int getYear() {
        return year;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int compareTo(Book other){
      int compareResult =  this.getTitle().compareTo(other.getTitle());
      if(compareResult==0){
          compareResult=Integer.compare(this.year,other.year);
      }
      return compareResult;
    }

}
