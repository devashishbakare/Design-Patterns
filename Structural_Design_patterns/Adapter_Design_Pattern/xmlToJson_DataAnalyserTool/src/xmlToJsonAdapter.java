public class xmlToJsonAdapter implements DataAnalyticsTool{

    public XmlData xmldata;
    public xmlToJsonAdapter(XmlData xmldata){
        this.xmldata = xmldata;
    }
    @Override
    public void analysedData(){
        String convertedJsonData = xmlToJsonConverter(xmldata);
        System.out.println("Analysing data in progress for following data -> "+convertedJsonData);
    }

    public String xmlToJsonConverter(XmlData xmldata){
        return xmldata.getXmlData();
    }
}
