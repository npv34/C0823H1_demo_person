import src.Person;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Son", "1999-12-01");
        System.out.println(person.getName() + " " + person.getAge() + " years old");
        System.out.println("Birth date: " + person.celebrateBirthday());
    }
}
