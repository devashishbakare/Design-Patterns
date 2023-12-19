
public class TextDocument implements Document{
    @Override
    public void open(){
        System.out.println("Text document open now");
    }
    @Override
    public void close(){
        System.out.println("Text document close now");
    }
}
