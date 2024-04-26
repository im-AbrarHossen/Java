import java.util.Scanner;
class Icecream {
    private String name;
    private String company;
    private double price;

    public Icecream(String name, String company, double price) {
        this.name = name;
        this.company = company;
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public String toString() {
        return "Name: " + name + ", Company: " + company + ", Price: $" + price;
    }
}

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numIceCreams = 5;
        Icecream[] iceCreams = new Icecream[numIceCreams];

        for (int i = 0; i < numIceCreams; i++) {
            System.out.println("Enter ice cream details for ice cream " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Company: ");
            String company = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            iceCreams[i] = new Icecream(name, company, price);
        }

        System.out.print("Enter the company name to search for: ");
        String searchCompany = scanner.nextLine();

        searchByCompany(iceCreams, searchCompany);
    }

    public static void searchByCompany(Icecream[] iceCreams, String company) {
        System.out.println("Ice creams manufactured by " + company + ":");
        for (Icecream icecream : iceCreams) {
            if (icecream.getCompany().equalsIgnoreCase(company)) {
                System.out.println(icecream);
            }
        }
    }
}