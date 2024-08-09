public class Book {
    String name = "Random Book";
    String Author = "Me";
    Double Price = 20.00;
    boolean sold = false;
    public void Sell(){
        sold = true;
    }
    public void Rename(String NewName){
        name = NewName;
    }
}

