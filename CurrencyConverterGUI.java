import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class CurrencyConverterGUI implements ActionListener
{
    private JFrame frame1, frame2;
    private JPanel p8, p9, p10, p11, p12, p13, p14, mp2;
    private JButton exitbtn, convertbtn;
    private JLabel
    private JComboBox from, to;
    public void startScreen1()
    {  
        
        
        .setContentPane();
        .setSize(600, 450);
        .setVisible(true);
        .setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        .setResizable(true);
    }
    public void startScreen2()
    {   
        //panels 8 to 14
        p8 = new JPanel();
        p9 = new JPanel();
        p10 = new JPanel();
        p11 = new JPanel();
        p12 = new JPanel();
        p13 = new JPanel();
        p14 = new JPanel();
        mp2 = new JPanel();

        //Combo Boxes
        JComboBox from = new JComboBox();
        JComboBox to = new JComboBox();
        from.addItem("USD");
        from.addItem("EUR");
        from.addItem("AUD");
        from.addItem("SGD");
        from.addItem("MYR");
        from.addItem("INR");
        from.addItem("CAD");
        from.addItem("BRP");
        from.addItem("CHF");
        from.addItem("JPY");
        to.addItem("USD");
        to.addItem("EUR");
        to.addItem("AUD");
        to.addItem("SGD");
        to.addItem("MYR");
        to.addItem("INR");
        to.addItem("CAD");
        to.addItem("BRP");
        to.addItem("CHF");
        to.addItem("JPY");
        from.setBounds( 4, 2)


        frame2.setContentPane(mp2);
        frame2.setSize(600, 450);
        frame2.setVisible(true);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setResizable(true);
    }


        
    }
}
