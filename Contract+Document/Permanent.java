public class Permanent {
    private String contractId;
    private String propertyId;
    private String tenantId;
    private long rentAmount;


    public Permanent(String contractId, String propertyId, String tenantId, long rentAmount){
        this.contractId = contractId;
        this.propertyId = propertyId;
        this.tenantId = tenantId;
        this.rentAmount = rentAmount;
    }
    @Override
    public String toString() {
        return contractId+" "+propertyId+" "+tenantId+" "+rentAmount;
    }
    
}
