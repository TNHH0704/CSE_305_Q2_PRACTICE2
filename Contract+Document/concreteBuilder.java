public class concreteBuilder implements contractBuilder {

    private String contractId;
    private String propertyId;
    private String tenantId;
    private long rentAmount;

    @Override
    public contractBuilder buildContractId(String contractId) {
       this.contractId = contractId;
       return this;
    }

    @Override
    public contractBuilder buildPropertyId(String propertyId) {
        this.propertyId = propertyId;
        return this;
    }

    @Override
    public contractBuilder buildTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @Override
    public contractBuilder buildRentAmount(long rentAmount) {
       this.rentAmount = rentAmount;
       return this;
    }

    @Override
    public Permanent signPermanent() {
        return new Permanent(contractId, propertyId, tenantId, rentAmount);
    }

    @Override
    public LongTerm signLongTerm() {
        return new LongTerm(contractId, propertyId, tenantId, rentAmount);
    }

    @Override
    public ShortTerm signShortTerm() {
        return new ShortTerm(contractId, propertyId, tenantId, rentAmount);
    }
    
}
