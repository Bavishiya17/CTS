class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }
}

public class RecordsExample {
    public static void main(String[] args) {
        Person p1 = new Person("Bavi", 20);
        Person p2 = new Person("Anandhi", 17);

        System.out.println(p1);
        System.out.println(p2);
    }
}