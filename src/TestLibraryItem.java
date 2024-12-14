public class TestLibraryItem {
    public static void main(String[] args) {
        Book book = new Book("1984", "Aidosio", 2012 , 249);
        System.out.println(book.toString());
        System.out.println("Item Tyle: " + book.getItemType());
    }
}
