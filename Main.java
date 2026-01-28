public class Main {
    public static void main(String[] args) {
        CurrencyRateService api = new CurrencyRateService();
        CurrencyConverterGUI gui = new CurrencyConverterGUI();
        gui.setVisible(true);
        Controller controller = new Controller(gui, api);
    }
}
