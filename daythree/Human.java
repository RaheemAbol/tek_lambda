package weekfour.daythree;

@FunctionalInterface
public interface Human {
    void say();


    default void sleep()
    {
        System.out.println("This is Default Method");
    }
    static void communication()
    {
        System.out.println("this is static method");
    }
}