
public class LateMachine implements ILateMachine {
    public int coffeeVolume = 250;
    public int milkVolume = 50;
    public static int maxWaterVolume = 1500;
    protected int currentVolume;

    @Override
    public void steamMilk() {
        System.out.println("steam milk");
    }

    @Override
    public void fillWater() {
        System.out.println("fill water");
        currentVolume = maxWaterVolume;
    }

    @Override
    public void fillCoffeeBeans() {
        System.out.println("fill coffee");
    }

    @Override
    public int getModelNumber() {
        return 234;
    }

    @Override
    public String getName() {
        return "LatheMachine";
    }

    @Override
    public Coffee makeCoffee() {
        boilingWater();
        millBeans();
        mixingComponents();
        steamMilk();

        if (currentVolume - coffeeVolume < 0) {
            System.out.println("Error: no water!");
            return null;
        }

        Coffee c = new Coffee(coffeeVolume);

        c.fillMilk(milkVolume);

        return c;
    }

    private void mixingComponents() {
        System.out.println("mixing components");
    }

    private void millBeans() {
        System.out.println("milling beans");
    }

    protected void boilingWater() {
        System.out.println("boiling water");
    }
}
