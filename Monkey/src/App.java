import java.util.Scanner;

public class App {
    public static void main(String[] args){
        MonkeyList circle=new MonkeyList(10,4);
        circle.eliminate();
        circle.display();
    }
}