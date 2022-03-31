import java.util.Scanner;

abstract public class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    abstract double calculateAmount();

    public Event(String name, String detail, String type, String organiser) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    public String getName() {
        return name;
    }

    public String getDetail() {
        return detail;
    }

    public String getType() {
        return type;
    }

    public String getOrganiser() {
        return organiser;
    }
}

class Exhibition extends Event {
    protected int noOfStalls;
    protected int rentPerStall;

    public Exhibition(String name, String detail, String type, String organiser, int noOfStalls, int rentPerStall) {
        super(name, detail, type, organiser);
        this.noOfStalls = noOfStalls;
        this.rentPerStall = rentPerStall;
    }

    double calculateAmount() {
        return noOfStalls * rentPerStall;
    }

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public int getRentPerStall() {
        return rentPerStall;
    }
}

class StageEvent extends Event {
    protected int noOfShows;
    protected double costPerShow;

    public StageEvent(String name, String detail, String type, String organiser, int noOfShows, double costPerShow) {
        super(name, detail, type, organiser);
        this.noOfShows = noOfShows;
        this.costPerShow = costPerShow;
    }

    public int getNoOfShows() {
        return noOfShows;
    }

    public double getCostPerShow() {
        return costPerShow;
    }

    double calculateAmount() {
        return noOfShows * costPerShow;
    }
}

class Driver {
    public static void main(String[] args) {
        System.out.println("Enter your choice\n1.Exhibition\n2.StageEvent");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Enter the Exhibition event name ");
                scanner.nextLine();
                String name = scanner.nextLine();
                //scanner.nextLine();
                System.out.println("Enter the detail");
                String detail = scanner.nextLine();

                System.out.println("Enter the type");
                String type = scanner.nextLine();

                // scanner.nextLine();
                System.out.println("Enter the organiser name");
                String organiserName = scanner.nextLine();
                System.out.println("Enter the number of the stalls ");
                int numberOfstalls = scanner.nextInt();
                System.out.println("Enter the rent for the stall");
                int rentPerStall = scanner.nextInt();
                Exhibition exhibition = new Exhibition(name, detail, type, organiserName, numberOfstalls, rentPerStall);
                System.out.println("Exhibition details");
                System.out.println("Event Name : " + exhibition.name);
                System.out.println("Detail: " + exhibition.getDetail());
                System.out.println("Type: " + exhibition.getType());
                System.out.println("Organiser Name: " + exhibition.getOrganiser());
                System.out.println("Total cost :" + exhibition.calculateAmount());
                break;
            case 2:
                scanner.nextLine();
                System.out.println("Enter the name of the stage event");

                String name1 = scanner.nextLine();
                System.out.println("Enter the detail");
                String detail1 = scanner.nextLine();
                System.out.println("Enter the type");
                String type1 = scanner.nextLine();
                System.out.println("Enter the organiser name");
                String organiserName1 = scanner.nextLine();
                System.out.println("Enter the number of shows");
                int numberOfShows = scanner.nextInt();
                System.out.println("Enter the cost for the show ");
                double costPerShow = scanner.nextInt();
                StageEvent stageEvent = new StageEvent(name1, detail1, type1, organiserName1, numberOfShows, costPerShow);
                System.out.println("Stage Event details");
                System.out.println("Event Name:" + stageEvent.getName());
                System.out.println("Details:" + stageEvent.getDetail());
                System.out.println("Type :" + stageEvent.getType());
                System.out.println("Organiser Name: " + stageEvent.getOrganiser());
                System.out.println("Total cost :" + stageEvent.calculateAmount());
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }

    }
}
