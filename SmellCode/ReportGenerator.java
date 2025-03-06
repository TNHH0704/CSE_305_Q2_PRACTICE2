import java.util.List;

class PropertyDetails {
    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;

    public PropertyDetails(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    // Getters
    public String getName() { return name; }
    public double getRentAmount() { return rentAmount; }
    public String getOwnerName() { return ownerName; }
    public String getLocation() { return location; }
}

class Property {
    private PropertyDetails details;

    public Property(PropertyDetails details) {
        this.details = details;
    }

    public PropertyDetails getDetails() {
        return details;
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + details.getName());
        System.out.println("Rent Amount: $" + details.getRentAmount());
        System.out.println("Owner: " + details.getOwnerName());
        System.out.println("Location: " + details.getLocation());
    }
}


class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        totalRent = 0; 
        System.out.println("Financial Report: " + reportTitle);
        System.out.println("----------------------------");
        for (Property property : properties) {
            property.printPropertyDetails();
            totalRent += property.getDetails().getRentAmount();

            
            if (property.getDetails().getRentAmount() > 2000) {
                System.out.println("This is a premium property.");
            } else {
                System.out.println("This is a standard property.");
            }
            double yearlyRent = property.getDetails().getRentAmount() * 12; 
            System.out.println("Yearly Rent: $" + yearlyRent);
            System.out.println("--------------------");
        }

        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

public class ReportGenerator {
    public static void main(String[] args) {
        PropertyDetails property1Details = new PropertyDetails("Apartment A", 1500.0, "John Doe", "City Center");
        PropertyDetails property2Details = new PropertyDetails("House B", 2000.0, "Jane Smith", "Suburb");
        PropertyDetails property3Details = new PropertyDetails("Condo C", 1800.0, "Bob Johnson", "Downtown");

        Property property1 = new Property(property1Details);
        Property property2 = new Property(property2Details);
        Property property3 = new Property(property3Details);
        
        FinancialReport financialReport = new FinancialReport("Monthly Rent Summary", List.of(property1, property2, property3));
        financialReport.generateReport();

    }
}
