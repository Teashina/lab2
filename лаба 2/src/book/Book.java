package book;

public class Book {
    String name;
    int price;
    boolean picture;
    static int sum=0;//для подсчета общей суммы
    static int pict=0;//для подсчета книг с иллюстрациями
    Book(){
    }//конструктор без параметров


    public Book(String name, int price, boolean picture) {
        this.name = name;
        this.price = price;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPicture() {
        return picture;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setPicture(boolean picture) {
        this.picture = picture;
    }

    public static void podschet(Book []books){
        for (int i=0;i<4;i++){
            sum+=books[i].price;
            if(books[i].picture){
                pict++;
            }
        }
        System.out.println("Общая сумма за книги: "+sum+"\n"+"Количество книг с иллюстрациями: "+pict);
    }
    public void print(){
        System.out.println("Название книги: "+this.getName());
        System.out.println("Цена: "+this.getPrice());
        System.out.println("Наличие иллюстраций: "+this.isPicture());
    }
}

