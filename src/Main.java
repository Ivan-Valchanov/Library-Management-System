//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {


    Library library = new Library();

    library.addBook(new Book("Don Quixote" , "Miguel de Cervantes"));
    library.addBook(new Book("Alice's Adventures in Wonderland" , "Lewis Carroll"));
    library.addBook(new Book("The Adventures of Huckleberry Finn" , "Mark Twain"));
    Scanner scanner = new Scanner(System.in);
    System.out.println("--- Welcome to Java Library ---");
    System.out.println("1. View all books | 2.borrowBook   | 3. Exit ");

    int choice = scanner.nextInt();
    // Use a switch statement to call your LibraryManager methods
    switch (choice) {
        case 1:
            library.showBooks();
            break;
        case 2:
            System.out.print("Enter Book title: ");
            String borrowBook = scanner.next();
            library.borrowBook(borrowBook);
            break;

        case 3:
            System.out.println("Exiting library. Goodbye!");
            System.exit(0);
    }



}
