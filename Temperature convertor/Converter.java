import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Converter
{
    public static JFrame frmMain;
    public static JLabel ToCelcius;
    public static JTextField textCelcius;
    public static JLabel ToFahrenheit;
    public static JTextField textFahrenheit;
    public static JButton FahrenheitToCelcius;
    public static JButton CelciusToFahrenheit;

    public static void main(String[] args)
    {
        frmMain=new JFrame("Temperature Converter");
        frmMain.setSize(320,220);
        frmMain.setLayout(new FlowLayout());

        ToCelcius=new JLabel("Celcius :");
        textCelcius=new JTextField(7);
        ToFahrenheit=new JLabel("Fahrenheit :");
        textFahrenheit=new JTextField(7);
        CelciusToFahrenheit=new JButton("Convert C to F");
        CelciusToFahrenheit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double celcius=Double.parseDouble(textCelcius.getText());
                double fahrenheit=celcius*9/5+32;
                textFahrenheit.setText(String.valueOf(fahrenheit));
            }
        });
        FahrenheitToCelcius=new JButton("Convert F to C");
        FahrenheitToCelcius.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                double fahrenheit=Double.parseDouble(textFahrenheit.getText());
                double celcius=(fahrenheit-32)*5/9;
                textCelcius.setText(String.valueOf(celcius));
            }
        });
        
        frmMain.add(ToCelcius);
        frmMain.add(textCelcius);
        frmMain.add(ToFahrenheit);
        frmMain.add(textFahrenheit);
        frmMain.add(CelciusToFahrenheit);
        frmMain.add(FahrenheitToCelcius);
        frmMain.setVisible(true);
    }
}