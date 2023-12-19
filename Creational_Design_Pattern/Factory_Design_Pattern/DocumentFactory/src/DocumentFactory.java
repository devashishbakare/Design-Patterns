public class DocumentFactory {

    public static Document createObjet(String documentName){

        if(documentName.trim().equalsIgnoreCase("text document")){
            return new TextDocument();
        }else if(documentName.trim().equalsIgnoreCase("spreadsheet document")){
            return new SpreadSheet();
        }else if(documentName.trim().equalsIgnoreCase("powerpoint document")){
            return new PowerPoint();
        }else{
            return null;
        }
    }

}
