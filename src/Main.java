import java.util.Arrays;

 public class Main{
    public static void main(String[] args) {

        Person person = new Person();
        Person person1 =  new Singer();
        Person person2 =  new Dancer();
        Person person3 = new Programmer();
        Person[] arau =  new Person[]{person,person2,person3,person1};
        for (Person person4: arau) {
            person4.walk();

        }
    }

}

