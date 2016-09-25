package cn.rayest.model;

/**
 * Created by Rayest on 2016/9/26 0026.
 */
public class Picture {
    private String name;
    private String author;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Picture{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
