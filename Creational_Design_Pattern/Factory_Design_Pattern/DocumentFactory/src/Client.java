public class Client {
    public static void main(String[] args) {

        Document textDocumentObject = DocumentFactory.createObjet("text document");
        textDocumentObject.open();
        textDocumentObject.close();

        Document spreadsheetDocumentObject = DocumentFactory.createObjet("spreadsheet document");
        spreadsheetDocumentObject.open();
        spreadsheetDocumentObject.close();

        Document powerpointDocumentObject = DocumentFactory.createObjet("powerpoint document");
        powerpointDocumentObject.open();
        powerpointDocumentObject.close();

    }
}