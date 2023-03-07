public class CommissionEmployee extends Employee {
    
    int commissionRate;
    int grossSales;

    public void setCommissionRate(int newCommission) {
        this.commissionRate = newCommission;
    }

    public void setGrossSales (int newGrossSales) {
        this.grossSales = newGrossSales;
    }

    public int getCommissionRate() {
        return commissionRate;
    }

    public int getGrossSales() {
        return grossSales;
    }
}
