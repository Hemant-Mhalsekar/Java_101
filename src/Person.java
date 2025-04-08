public class Person
{
    Person()
    {
        System.out.println("Hello");
    }
    Person(String name)
    {
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        Person p1 = new Person();
        Person p2 = new Person("Varun");
    }
}