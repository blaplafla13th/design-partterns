package iterator;

public class Test {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addBookmark(new Bookmark("Book1", 13, "hmm"));
        menu.addBookmark(new Bookmark("Book3", 15, "hmm"));

        BookmarkIterator<Bookmark> iterator = menu.iterator();
        while (iterator.hasNext()) {
            Bookmark Bookmark = iterator.next();
            System.out.println(Bookmark);
        }
    }
}
