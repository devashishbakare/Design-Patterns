public class Client {
    public static void main(String[] args) {
        //Given xml data
        XmlData xmlData = new XmlData("xyz data");
        //Data analytics tool expecting json, even though we are having xml data things should work
        DataAnalyticsTool dataAnalyticsTool = new xmlToJsonAdapter(xmlData);
        dataAnalyticsTool.analysedData();
    }
}