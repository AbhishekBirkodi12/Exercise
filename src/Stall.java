import java.util.Scanner;

public interface Stall {
    void display();

}

class GoldStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;

    public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.tvSet = tvSet;
    }

    public String getStallName() {
        return stallName;
    }

    public int getCost() {
        return cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getTvSet() {
        return tvSet;
    }

    public void display() {
        System.out.println("Stall Name : " + this.stallName);
        System.out.println("Cost : " + this.cost);
        System.out.println("Owner Name : " + this.ownerName);
        System.out.println("Number of Tv sets : " + this.tvSet);
    }
}

class PremiumStalls implements Stall {
    private String stallName;
    private int cost;
    private String OwnerName;
    private int projector;

    public PremiumStalls(String stallName, int cost, String ownerName, int projector) {
        this.stallName = stallName;
        this.cost = cost;
        OwnerName = ownerName;
        this.projector = projector;
    }

    public String getStallName() {
        return stallName;
    }

    public int getCost() {
        return cost;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public int getProjector() {
        return projector;
    }


    public void display() {
        System.out.println("Stall Name : " + this.stallName);
        System.out.println("Cost : " + this.cost);
        System.out.println("Owner Name : " + this.OwnerName);
        System.out.println("Number of projectors : " + this.projector);
    }
}

class ExecutiveStall implements Stall {
    private String stallName;
    private int cost;
    private String OwnerName;
    private int screen;

    public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
        this.stallName = stallName;
        this.cost = cost;
        OwnerName = ownerName;
        this.screen = screen;
    }

    public String getStallName() {
        return stallName;
    }

    public int getCost() {
        return cost;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public int getScreen() {
        return screen;
    }


    public void display() {
        System.out.println("Stall Name : " + this.stallName);
        System.out.println("Cost : " + this.cost);
        System.out.println("Owner Name : " + this.OwnerName);
        System.out.println("Number of screens " + this.screen);
    }
}

class DriverInt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose stall type\n1.Gold Stall\n2.Premier Stall \n3.Executive Stall");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the stall Name ");
                String stallName = scanner.next();
                System.out.println("Enter the cost");
                int cost = scanner.nextInt();
                System.out.println("Enter the owner Name");
                String owner = scanner.next();
                System.out.println("Enter the number of Tv sets");
                int tv = scanner.nextInt();
                GoldStall goldStall = new GoldStall(stallName, cost, owner, tv);
                goldStall.display();
                break;
            case 2:
                System.out.println("Enter the stall Name ");
                String stallName1 = scanner.next();
                System.out.println("Enter the cost");
                int cost1 = scanner.nextInt();
                System.out.println("Enter the owner Name");
                String owner1 = scanner.next();
                System.out.println("Enter the number of projectors");
                int projectors = scanner.nextInt();
                PremiumStalls premiumStalls = new PremiumStalls(stallName1, cost1, owner1, projectors);
                premiumStalls.display();
                break;
            case 3:
                System.out.println("Enter the stall Name ");
                String stallName2 = scanner.next();
                System.out.println("Enter the cost");
                int cost2 = scanner.nextInt();
                System.out.println("Enter the owner Name");
                String owner3 = scanner.next();
                System.out.println("Enter the number of screens");
                int screens = scanner.nextInt();
                ExecutiveStall executiveStall = new ExecutiveStall(stallName2, cost2, owner3, screens);
                executiveStall.display();
                break;

            default:
                System.out.println("Invalid  input");

        }

    }
}