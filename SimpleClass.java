public class SimpleClass {

    private String name = "Donald Duck";

    public static void main(String[] args) {
        System.out.println("Hello Even though I'm simple, it doesn't mean I should be ignored and this is updated now");

        SimpleClass me = new SimpleClass();
        me.printName();
    }

    private void printName() {
        System.out.printf("My name is: %s:", name);
    }
}
