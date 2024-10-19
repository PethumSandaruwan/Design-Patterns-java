
abstract class Beverage {

    public final void prepareBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }


    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }


    abstract void brew();
    abstract void addCondiments();
}


class Coffee extends Beverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }
}

class Tea extends Beverage {
    @Override
    void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}


public class TemplateMethodPattern {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        Beverage tea = new Tea();

        System.out.println("Making Coffee...");
        coffee.prepareBeverage();

        System.out.println("\nMaking Tea...");
        tea.prepareBeverage();
    }
}
