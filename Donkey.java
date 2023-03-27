public class Donkey extends Mammal {

    private static int count = 0;

    public Donkey(String name, int age) {
        super(name, age);
        setLegNumber(4);
        setNumberOfOffsprings(1);
        setPregnancyPerYear(1);
        count++;
    }

    public void sayGreetings() {
        System.out.println("Life will go on as it has always gone –that is, badly!");
    }

    public static int getCount() {
        return count;
    }

    public static void decrementCount() {
        count--;
    }

}
