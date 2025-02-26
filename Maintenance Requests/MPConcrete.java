public class MPConcrete implements RequestProduct {
    private String priority;
    private String expiryDate;
    private String status;

    @Override
    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public String getPriority() {
        return this.priority;
    }

    @Override
    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String getExpiryDate() {
        return this.expiryDate;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getStatus() {
        return this.status;
    }

    @Override
    public void processRequest() {
        System.out.println("Request accept, estimated completion date is " + getExpiryDate());
    }
}
