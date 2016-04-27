package JSON.domain;

import java.util.List;

/**
 * Created by quanghuy on 4/27/2016.
 */
public class Employee {

    private String name;
    private int age;
    private List<Book> lsBook;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Book> getLsBook() {
        return lsBook;
    }

    public void setLsBook(List<Book> lsBook) {
        this.lsBook = lsBook;
    }
}
