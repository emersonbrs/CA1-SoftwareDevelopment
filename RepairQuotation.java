public class RepairQuotation {

    private static final double studentDiscountRate = 0.10;
    private static final double expressCharge = 20.0;

    private String customerName;
    private String generalMenuOption;
    private String quotationMenuOption;
    private int serviceNumber;
    private boolean student;
    private boolean express;

    private double basePrice;

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
        basePrice = 0.0;
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

    }
}