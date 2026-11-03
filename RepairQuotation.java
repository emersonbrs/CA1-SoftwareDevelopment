public class RepairQuotation {

    private static final double studentDiscountRate = 0.10;
    private static final double expressCharge = 20.0;

    private String customerName;
    private String generalMenuOption;
    private String quotationMenuOption;
    private int serviceNumber;
    private boolean student;
    private boolean express;

    public RepairQuotation() {
        customerName = "";
        generalMenuOption = "Application Menu for the Repair Shop\n"
                            + "1. Create a quotation\n"
                            + "2. View quotation totals and summary\n"
                            + "3. Exit\n"
                            + "Choose one option of the menu: ";
        quotationMenuOption = "1. Diagnostic check         €30\n"
                            + "2. Software installation    €45\n"
                            + "3. Virus removal            €60\n"
                            + "4. Screen replacement       €120\n"
                            + "Choose one of our services: ";
        serviceNumber = 0;
        student = false;
        express = false;
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

    public void calculateFinalQuotation() {
        System.out.println("********************************************");
        System.out.println("           Repair Service Details           ");
        System.out.println("********************************************");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Student: " + (student ? "Yes" : "No"));
        System.out.println("Repair Service: " + getServiceName());
        System.out.println("Base price: " + getBasePrice());
        System.out.println("Discount: " + (student ? studentDiscountRate : 0.0));
        System.out.println("Express charge: " + (express ? expressCharge : 0.0));

        double discount = getBasePrice() * (student ? studentDiscountRate : 0.0);
        double finalTotal = (getBasePrice() - discount) + (express ? expressCharge : 0.0);

        System.out.println("Final total: €" + finalTotal);

    }
}