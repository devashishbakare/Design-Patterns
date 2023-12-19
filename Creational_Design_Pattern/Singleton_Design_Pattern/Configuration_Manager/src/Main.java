public class Main {
    public static void main(String[] args) {
        ConfigurationManager configurationManager1 = ConfigurationManager.getInstance();
        ConfigurationManager configurationManager2 = ConfigurationManager.getInstance();
        System.out.println(configurationManager2 == configurationManager1);
    }
}