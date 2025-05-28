class BookSales {
    String sellerName;
    int numberOfSales;
    int sellerId;

    // Constructor
    BookSales(String sellerName, int numberOfSales, int sellerId) {
        this.sellerName = sellerName;
        this.numberOfSales = numberOfSales;
        this.sellerId = sellerId;
    }

    // Display method
    void display() {
        System.out.println("Seller Name: " + sellerName);
        System.out.println("Number of Sales: " + numberOfSales);
        System.out.println("Seller ID: " + sellerId);
    }

    // ✅ Main method to run the program
    public static void main(String[] args) {
        Book book = new Book("Java for Beginners", "John Doe", "TechBooks", 499.99, 2022);
        book.display();

        BookSales seller = new BookSales("Alice", 120, 101);
        seller.display();
    }
}
