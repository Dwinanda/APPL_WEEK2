package currencyconverter;

import java.awt.*;
import javax.swing.*;

public class CurrencyConverter {

    
    public static void main(String[] args) 
        // TODO code application logic here
    {
        JFrame frame = new JFrame ("Currency Converter");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        RatePanel ratePanel = new RatePanel ();
        frame.getContentPane().add(ratePanel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
}
