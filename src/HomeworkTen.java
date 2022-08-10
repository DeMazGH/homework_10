public class HomeworkTen {

    public static void main(String[] args) {

        Person sarah = new Person("Sarah", 30);
        PersonService personService = new PersonService();

        if (personService.isAdult(sarah)) {
            System.out.println("Иди в бар");
        } else {
            System.out.println("Иди в школу");
        }

        sarah.increaseAge(10);
        System.out.println(sarah);

    }
}
