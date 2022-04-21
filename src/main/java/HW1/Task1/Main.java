package HW1.Task1;

public class Main {
    public static void main(String[] args) {
        Person person = Person.createBuilder()
                .withLastName("Ivanov")
                .withFirstName("Ivan")
                .withAge(32)
                .withAddress("Red, 1")
                .withGender("M")
                .build();
        System.out.println(person);
    }
}