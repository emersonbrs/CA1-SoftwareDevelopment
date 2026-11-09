public class RepairQuotation {

    // Declaring fixed variables
    private static final double studentDiscountRate = 0.10;
    private static final double expressCharge = 20.0;
    private static final String generalMenuOption = "Application Menu for the Repair Shop\n"
                        + "1. Create a quotation\n"
                        + "2. View quotation totals and summary\n"
                        + "3. Exit\n"
                        + "Choose one option of the menu: ";
    private static final String quotationMenuOption = "1. Diagnostic check         €30\n"
                            + "2. Software installation    €45\n"
                            + "3. Virus removal            €60\n"
                            + "4. Screen replacement       €120\n"
                            + "Choose one of our services: ";

    // Declaring variables
    private String customerName;
    private int serviceNumber;
    private boolean student;
    private boolean express;
    private double individualTotal;
    private double finalTotal;

    // Constructor
    public RepairQuotation() {
        customerName = "";
        serviceNumber = 0;
        student = false;
        express = false;
        individualTotal = 0.0;
        finalTotal = 0.0;
    }

    // Getters
    public Double getStudentDiscountRate() { 
        return studentDiscountRate;
    }

    public Double getExpressCharge() { 
        return expressCharge;
    }

    public String getCustomerName() { 
        return customerName;
    }

    public String getGeneralMenuOption() {
        return generalMenuOption;
    }

    public String getQuotationMenuOption() {
        return quotationMenuOption;
    }

    public int getServiceNumber() { 
        return serviceNumber;
    }

    public boolean getStudent() {
        return student;
    }
 
    public boolean getExpress() {
        return express;
    }

    public double getBasePrice() {
        switch (serviceNumber) {
            case 1:
                return 30.0;
            case 2:
                return 45.0;
            case 3:
                return 60.0;
            case 4:
                return 120.0;
            default:
                return 0.0;
        }
    }

    public String getServiceName() {
        switch (serviceNumber) {
            case 1:
                return "Diagnostic check";
            case 2:
                return "Software installation";
            case 3:
                return "Virus removal";
            case 4:
                return "Screen replacement";
            default:
                return "";
        }
    }

    public double getDiscount() {
        return 0.0;
    }

    public double getIndividualTotal() {
        return individualTotal;
    }

    public double getFinalTotal() {
        return finalTotal;
    }

    // Setters
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }
 
    public void setStudent(boolean student) {
        this.student = student;
    }
 
    public void setExpress(boolean express) {
        this.express = express;
    }

    public void setIndividualTotal(double individualTotal) {
        this.individualTotal = individualTotal;
    }

    // Functions for calculations
    public double calculateFinalQuotation() {
        System.out.println("********************************************");
        System.out.println("           Repair Service Details           ");
        System.out.println("********************************************");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Student: " + (student ? "Yes" : "No"));
        System.out.println("Repair Service: " + getServiceName());
        System.out.println("Base price: €" + getBasePrice());
        System.out.println("Discount: €" + (student ? (studentDiscountRate * 100) : 0.0));
        System.out.println("Express charge: €" + (express ? expressCharge : 0.0));
        System.out.printf("Final total: €%.2f%n", individualTotal);

        return individualTotal;
    }
}
