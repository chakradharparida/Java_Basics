class Library{
    String[] Books;
    int  NoOfBooks;
    Library(){
        this.Books = new String[100];
        this.NoOfBooks = 0;
    }
    void AddBook(String Book){
        this.Books[NoOfBooks] = Book;
        NoOfBooks++;
        System.out.println(Book+" has been added.");

    }
    void ShowAvailableBooks(){
        System.out.println("Available Books are : ");
        for ( String Book : this.Books) {
            if (Book == null){
                continue;
            }
            System.out.println("* "+Book);
        }
    }
    void IssueBoook(String Book){
        System.out.println("Available Books are : ");
        for ( String b : this.Books) {
            if (b == Book){
                for (int i=0;i<this.Books.length;i++){
                if(this.Books[i].equals(Book)){
                    System.out.println("The book has been issued!");
                    b=null;
                    return;
                }
                
            }
        System.out.println("This book does not exit.");
      }
    //   void ReturnBook(String Book){
    //     AddBook(Book);
      }
    }
}
public class cwh_61_ex4sol {
    public static void main(String[] args) {
        Library CentralLibrary = new Library();
        CentralLibrary.AddBook("Think and grow rich");
        CentralLibrary.AddBook("OOPS Java");
        CentralLibrary.AddBook("Python");
        CentralLibrary.AddBook("C++");
        CentralLibrary.AddBook("Algorithims");
        CentralLibrary.ShowAvailableBooks();
        CentralLibrary.IssueBoook("C++");
        CentralLibrary.AddBook("Data astructure");
    }
  
}

