

public interface contractBuilder {
    contractBuilder buildContractId(String contractId);
    contractBuilder buildPropertyId(String propertyId);
    contractBuilder buildTenantId(String tenantId);
    contractBuilder buildRentAmount(long rentAmount);
    
    Permanent signPermanent();
    LongTerm signLongTerm();
    ShortTerm signShortTerm();

    
}
