import person.Person;

import java.util.Arrays;

public class ArraysExercises {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        Person[] people = new Person[3];

        people[0] = new Person("Ken");
        people[1] = new Person ("Steve");
        people[2] = new Person ("Travis");

      for (Person person : people) {
                System.out.println(person.getName());
            }

        people = addPerson(people, new Person("Joy"));
            System.out.println("With added Person");

            
    }

        public static Person[] addPerson(Person[] person, Person personToAdd) {
            Person[] newPeopleArray = Arrays.copyOf(person, person.length + 1);
            newPeopleArray[newPeopleArray.length -1] = personToAdd;
                return newPeopleArray;
        }
}


