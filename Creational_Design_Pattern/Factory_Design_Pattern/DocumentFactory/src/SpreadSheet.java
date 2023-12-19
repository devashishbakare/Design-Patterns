public class SpreadSheet implements Document{
    @Override
    public void open(){
        System.out.println("spreadsheet is open now");
    }
    @Override
    public void close(){
        System.out.println("spreadsheet close now");
    }

}

