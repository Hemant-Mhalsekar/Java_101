public class Dog1 extends Animal{
    String breed;
    Dog1(int age,String name,String breed)
    {
        super(age,name);
        this.breed = breed;
    }
    void bark()
    {
        System.out.println("bark bark");
    }

    public static void main(String[] args) {
        Animal animal = new Dog1(5,"tomy","lab");
        animal.doSomething();
    }
};
