public class Client {
    public static void main(String[] args) {
        ModernPrinter modernPrinter = new ModernPrinter();
        LegacyPrinter legacyPrinter = new PrinterAdapter(modernPrinter);
        legacyPrinter.printDocument();
    }
}