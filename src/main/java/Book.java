public class Book implements Borrowable {
    private String title;
    private String author;
    private String isbn;
    private int copiesAvailable;


public Book(String title, String author, String isbn, int copiesAvailable){
    this.title = title;
    this.author = author;
    this.isbn = isbn;
    this.copiesAvailable = copiesAvailable;
}
@Override
public String getDisplayName() {
    return title;
}

    public String getTitle (){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public int getCopiesAvailable(){
        return copiesAvailable;
    }
    public void setCopiesAvailable(int copiesAvailable){
        if (copiesAvailable >= 0){
            this.copiesAvailable = copiesAvailable;
        }
    }
    public boolean borrowItem(){
        if (copiesAvailable <= 0){
            return false;
        }
        copiesAvailable--;
        return true;
    }
    public boolean returnItem(){
        copiesAvailable++;
        return true;
    }
}