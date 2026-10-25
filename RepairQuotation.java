public class RepairQuotation {

    private static final double studentDiscountRate = 0.10;
    private static final double expressCharge = 20.0;

    private String customerName;
    private int serviceNumber;
    private boolean student;
    private boolean express;

    public RepairQuotation(String customerName, int serviceNumber,
                           boolean student, boolean express) {
        this.customerName = customerName;
        this.serviceNumber = serviceNumber;
        this.student = student;
        this.express = express;
    }

    public int getCustomerName() { 
        return serviceNumber;
    }

    public int getServiceNumber() { 
        return serviceNumber;
    }

    public boolean isStudent() {
        return student;
    }
 
    public boolean isExpress() {
        return express;
    }

    public double getBasePrice()   {
        return 0;
    }

    public double getDiscount()    {
        return 0;
    }

    public double getExpressCharge() {
        return 0;
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

    public double calculateQuotation() {
        return 0;
    }
}