package gui;

import javax.swing.*;

public class TextPanel extends JPanel {

    public TextPanel(){
        JTextField txtTemperature = new JTextField(20);
        txtTemperature.setEnabled(false);
        add(txtTemperature);
    }

}
