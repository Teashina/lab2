import book.*;

public class Main {

    public static void main(String[] args) {
        Book[] books=new Book[4];
        books[0]=new Book("Колобок",15,true);
        books[1]=new Book("Физика",17,true);
        books[2]=new Book("Психология влияния",30,false);
        books[3]=new Book("Любовь и любовь",23,false);
        for(int i=0;i<4;i++){
           books[i].print();
        }
        Book.podschet(books);
    }
}
