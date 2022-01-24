package iterator;

import java.util.ArrayList;

public class Menu {
    private ArrayList<Bookmark> menuBookmarks = new ArrayList<>();

    public void addBookmark(Bookmark Bookmark) {
        menuBookmarks.add(Bookmark);
    }

    public BookmarkIterator<Bookmark> iterator() {
        return new MenuBookmarkIterator();
    }

    class MenuBookmarkIterator implements BookmarkIterator<Bookmark> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < menuBookmarks.size();
        }

        @Override
        public Bookmark next() {
            return menuBookmarks.get(currentIndex++);
        }
    }
}

