package JavaTraining.OOPSConcepts;

class Book {
    private int page_no;

    public int getPage_no() {
        return page_no;
    }

    public void setPage_no(int x) {
        page_no = x;
    }

}

public class Encapsulation {

    public static void main(String[] args) {
        Book b = new Book();
        b.setPage_no(100);
        System.out.println(b.getPage_no());

    }

}
