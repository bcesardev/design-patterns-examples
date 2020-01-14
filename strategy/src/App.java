public class App {

    public static void main(String[] args) {

        Person p1 =  new Person("José");
        p1.move(new WalkMovement(), 50);

        Person p2 =  new Person("Maria");
        p2.move(new RunMovement(), 50);
    }
}
