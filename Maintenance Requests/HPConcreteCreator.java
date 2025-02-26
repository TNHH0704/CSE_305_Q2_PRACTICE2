public class HPConcreteCreator extends RequestCreator {
    
    @Override
    public RequestProduct createRequest() {
        HPConcrete request = new HPConcrete();
        request.setPriority("Emergency");
        request.setStatus("Accept");
        request.setExpiryDate("20/2/2025");
        return request;
    }
}
