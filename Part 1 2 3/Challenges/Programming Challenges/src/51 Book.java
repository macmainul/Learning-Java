class Book {
    static int totalBook;
    String title;
    String author;
    String isbn;
    boolean isBorrwed;

    static {  //only one time run, in the starting of programme
        totalBook = 0;
    }
    {  //object initial
        totalBook++;
    }

    Book(String isbn, String title, String author)  {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }
    Book(String isbn)    {
        this(isbn, "Unkown" , "Unknown");
    }

    static void getTotalBooks()  {
        System.out.println("Total Books is : "+totalBook);
    }
    void borrowBook()   {
        if(isBorrwed)
        {
            System.out.println("The Book is Borrowed ");
        }else {
            this.isBorrwed = true;
            System.out.println("Enjoy the "+this.title+" book");
        }
    }
    void returnBook()   {
        if(isBorrwed)  {
            this.isBorrwed = false;
            System.out.println("Hope you enjoyed it , Please leave a review ");
        }else {
            System.out.println("This is already in the library");
        }
    }

    public static void main(String[] args) {
        Book designBook = new Book("1","Design","Author");
        Book mybook = new Book("2");

        Book.getTotalBooks();

        designBook.borrowBook();
        mybook.borrowBook();

        designBook.borrowBook();
        designBook.returnBook();
        designBook.returnBook();
    }

}
