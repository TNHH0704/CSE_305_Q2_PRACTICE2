public class MPConcreteCreator extends RequestCreator {

    @Override
    public RequestProduct createRequest() {
        MPConcrete request = new MPConcrete();
        request.setPriority("Medium");
        request.setStatus("Accepted");
        request.setExpiryDate("20/3/2025");
        return request;
    }
}
