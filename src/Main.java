public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Machine1 mach1 = new Machine1();
        Machine2 mach2 = new Machine2();
        LateMachine lm = new LateMachine();

        CoffeeMaker man = new CoffeeMaker();

        man.makeCoffee(mach1);
        System.out.println("---------------------------------------------");
        man.makeCoffee(mach2);
        System.out.println("---------------------------------------------");
        man.makeLatteCoffee(lm);
    }
}
