public class PrinterAdapter implements LegacyPrinter{
    public ModernPrinter modernPrinter;

    public PrinterAdapter(ModernPrinter modernPrinter){
        this.modernPrinter = modernPrinter;
    }
    public void printDocument(){
        modernPrinter.printWithModernPrinter();
    }
}
