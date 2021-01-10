import creational.Singleton;

public class MainApp {
    public static void main(String[] args){
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);

        Singleton another = Singleton.getInstance();
        System.out.println(another);
    }
}
