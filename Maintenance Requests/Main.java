public class Main {
    public static void main(String[] args) {
        RequestCreator lpCreator = new LPConcreteCreator();
        lpCreator.processRequest();
        RequestCreator mpCreator = new MPConcreteCreator();
        mpCreator.processRequest();
        RequestCreator hpCreator = new HPConcreteCreator();
        hpCreator.processRequest();
    }
}
