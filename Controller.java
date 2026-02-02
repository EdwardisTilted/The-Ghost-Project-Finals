public class Controller {
    private final CurrencyConverterGUI gui;
    private final CurrencyRateService service;

    public Controller(CurrencyConverterGUI gui, CurrencyRateService service)
    {
        // assign final fields first
        this.gui = gui;
        this.service = service;
        for (String currency : service.getCurrency()) {
            this.gui.setCombobox(currency);
        }

        // then initialize the GUI
        this.gui.startScreen1();

        // add action listeners
        this.gui.Startbtn.addActionListener(e -> {
            gui.startScreen2();
            gui.frame2.setVisible(true);
            gui.frame1.setVisible(false);
            //gui.convertbtn.addActionListener(ev -> convertCurrency());
        });
    }
/*
    private void convertCurrency()
    {
        try
        {
            String base = gui.from.getSelectedItem().toString();
            String to = gui.to.getSelectedItem().toString();

            String result = service.fetchData();
            System.out.println(result);
            } catch (Exception error) {
            error.printStackTrace();
        }
    }
*/
}
