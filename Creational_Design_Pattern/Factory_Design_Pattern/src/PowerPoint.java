public class PowerPoint implements Document{
    @Override
    public void open(){
        System.out.println("powerpoint open now");
    }
    @Override
    public void close(){
        System.out.println("powerpoint is close now");
    }
}
