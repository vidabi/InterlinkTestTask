
public class Machine1 extends BaseMachine {

    public static int coffeeVolume = 150;
    public static int milkVolume = 20;
    public static int maxWaterVolume = 1000;

    @Override
    public void fillWater() {
        System.out.println("filling water");
        currentVolume = maxWaterVolume;
    }

    @Override
    public void fillCoffeeBeans() {
        System.out.println("filling coffee beans");
    }

    @Override
    public int getModelNumber() {
        return 123;
    }

    @Override
    public String getName() {
        return "Machine1";
    }

    @Override
    public Coffee makeCoffee() {
        millBeans();
        boilingWater();
        mixingComponents();

        if (currentVolume - coffeeVolume < 0) {
            System.out.println("Error: no water!");
            return null;
        }

        currentVolume -= coffeeVolume;

        Coffee coffee = new Coffee(coffeeVolume);
        addMilk(coffee);

        return coffee;
    }

    private void addMilk(Coffee coffee) {
        coffee.fillMilk(20);
    }

    private void mixingComponents() {
        System.out.println("mixing components");
    }

    @Override
    protected void boilingWater() {
        System.out.println("boiling water with special way");
    }

    private void millBeans() {
        System.out.println("milling beans");
    }
}
