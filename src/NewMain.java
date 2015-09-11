import hsa.*;
public class NewMain {

    
    public static void main(String[] args) {
        Console c = new Console();
        c.print("Hello.");
        int age;
        c.print("\nHow old are you? ");
        age = c.readInt();
        age++;
        c.print("\nNext year you will be " + age);
    }
    
}
