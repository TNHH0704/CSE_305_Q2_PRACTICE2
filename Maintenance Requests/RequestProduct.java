public interface RequestProduct {
    void setPriority(String priority);
    String getPriority();

    void setExpiryDate(String expiryDate);
    String getExpiryDate();

    void setStatus(String status);
    String getStatus();

    void processRequest();
}
