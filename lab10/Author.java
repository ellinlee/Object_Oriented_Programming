package LAB11;

public class Author implements Comparable<Author>{
    String firstName;
    String bookName;
    int auAge;

    public Author(String firstName, String bookName, int auAge){
        this.firstName = firstName;
        this.bookName = bookName;
        this.auAge = auAge;
    }

    public int compareTo(Author author) {
        return this.firstName.compareTo(author.firstName);
    }
    public String getname(){
        return firstName;
    }
    public void setname(String firstname) {
        this.firstName = firstname;
    }
    public String getbook(){
        return bookName;
    }
    public void setBookName(String bookName){
        this.bookName=bookName;
    }
    public int getAge(){
        return auAge;
    }
    public void setAge(int auAge){
        this.auAge=auAge;
    }
}
