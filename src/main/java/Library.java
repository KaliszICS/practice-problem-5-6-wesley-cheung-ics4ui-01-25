import java.util.ArrayList;
class Library {
    private ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(String ISBN) {
        for (int i = 0;i<books.size();i++) {
            if (this.books.get(i).getISBN() == ISBN) {
                this.books.remove(i);
                break;
            }
        }
    }

    private ArrayList<Book> foundBooks = new ArrayList<Book>();

    public Book[] searchBook(String title) {
        this.foundBooks.clear();
        for (int i = 0;i<books.size();i++) {
            if (this.books.get(i).getTitle() == title) {
                this.foundBooks.add(this.books.get(i));
            }
        }
        return this.foundBooks.toArray(new Book[this.foundBooks.size()]);
    }

    public Book[] displayBooks() {
        return this.books.toArray(new Book[this.books.size()]);
    }
}