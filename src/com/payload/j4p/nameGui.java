package com.payload.j4p;

import javax . swing .*;

public class nameGui {
    public static void main(String[] args) {
        String first_name, last_name, message;
        first_name = JOptionPane.showInputDialog("Enter your first  name:");
        last_name = JOptionPane.showInputDialog("Enter your last  name:");
        message = JOptionPane.showInputDialog("Enter your message:");
        System.out.println(first_name);
        JOptionPane.showMessageDialog(null, "Your Name is :" + first_name + last_name);
        JOptionPane.showMessageDialog(null, "Your Message is:" + message);

    }
}
