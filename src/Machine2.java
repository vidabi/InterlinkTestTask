
public class Machine2 extends BaseMachine {
    public int coffeeVolume = 200;
    public static int maxWaterVolume = 1200;

    @Override
    public void fillWater()
    {
        System.out.println("filling water");
        currentVolume = maxWaterVolume;
    }

    @Override
    public void fillCoffeeBeans() {
        System.out.println("filling coffee beans");
    }

    @Override
    public int getModelNumber() {
        return 999;
    }

    @Override
    public String getName() {
        return "Machine2";
    }

    @Override
    public Coffee makeCoffee() {
        System.out.println("making coffee");

        boilingWater();
        millBeans();
        mixingComponents();

        if (currentVolume - coffeeVolume < 0) {
            System.out.println("Error: no water!");
            return null;
        }

        Coffee coffee = new Coffee(coffeeVolume);

        return coffee;
    }

    private void mixingComponents() {
        System.out.println("mixing components");
    }

    private void millBeans() {
        System.out.println("milling beans");
    }
}
