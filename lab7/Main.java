package lab7;

public class Main {
    public static void main(String[] args) {
        Journal j = new Journal("2020-12-12",200);
        Magazine m = new Magazine("2018-1-1", 50);
        System.out.println("Journal is old=" + j.isOLD());
        System.out.println("Journal is popular=" + j.isPopular());
        System.out.println("Magazine is old=" + m.isOLD());
        System.out.println("Magazine is popular=" + m.isPopular());
    }
}
