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

    public double getBasePrice()   {
        return 0;
    }

    public double getDiscount()    {
        return 0;
    }

    public double getExpressCharge() {
        return 0;
    }

    public double calculateQuotation() {
        return 0;
    }
}