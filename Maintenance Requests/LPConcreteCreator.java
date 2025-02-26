public class LPConcreteCreator extends RequestCreator {

    @Override
    public RequestProduct createRequest() {
        LPConcrete request = new LPConcrete();
        request.setPriority("Ignore");
        request.setStatus("Done");
        request.setExpiryDate("20/2/2025");
        return request;
    }
}
