public class Controller {
    private final CurrencyConverterGUI gui;
    private final CurrencyRateService service;

    public Controller(CurrencyConverterGUI gui, CurrencyRateService service) {
        this.gui = gui;
        this.service = service;

        this.gui.convertBtn.addActionListener(e -> convertCurrency());
    }

    private void convertCurrency() {
        try {
            String base = gui.baseInput.getSelectedItem().toString();
            String to = gui.toInput.getSelectedItem().toString();

            String result = service.fetchData();
            System.out.println(result);
            gui.resultLabel.setText("Result: " + result);
            gui.pack();
        } catch (Exception error) {
            error.getMessage();
        }
    }
}
