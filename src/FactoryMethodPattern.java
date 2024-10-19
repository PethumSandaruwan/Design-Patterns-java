
abstract class Cafe {
    abstract void ShowSpec();
}

class Breakfast extends Cafe {
    @Override
    public void ShowSpec() {
        System.out.println("This is Breakfast menu");
    }
}

class Lunch extends Cafe {
    @Override
    public void ShowSpec() {
        System.out.println("This is Lunch menu");
    }
}

class Dinner extends Cafe {
    @Override
    public void ShowSpec() {
        System.out.println("This is Dinner menu");
    }
}

class CafeMenu {
    public Cafe getCafe(String TypeOfCafe) {
        if (TypeOfCafe.equalsIgnoreCase("Morning")) {
            return new Breakfast();
        }
        if (TypeOfCafe.equalsIgnoreCase("Afternoon")) {
            return new Lunch();
        }
        if (TypeOfCafe.equalsIgnoreCase("Night")) {
            return new Dinner();
        }
        return null;
    }
}

public class FactoryMethodPattern {
    public static void main(String[] args) {
        CafeMenu cafeMenu = new CafeMenu();

        Cafe mySelection = cafeMenu.getCafe("Night");
        mySelection.ShowSpec();
    }
}
