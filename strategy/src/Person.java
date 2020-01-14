public class Person {

    private final String name;

    public Person(String name){
        this.name = name;
    }

    public void move(Movement movement, int distance){
        System.out.println(String.format("%s iniciou o movimento", name));
        movement.move(distance);
        System.out.println(String.format("%s terminou o trajeto", name));
    }
}
