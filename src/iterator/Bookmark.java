package iterator;

public class Bookmark {
    private String title;
    private int page;
    private String content;

    public Bookmark(String title, int page, String content) {
        this.title = title;
        this.page = page;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Bookmark{" +
                "title='" + title + '\'' +
                ", page=" + page +
                ", content='" + content + '\'' +
                '}';
    }
}
