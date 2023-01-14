package org.example;

import java.awt.*;
import java.util.regex.Pattern;
import java.util.Scanner;
import javax.swing.*;

public class Greet {

    public static boolean testDisplay(String input) {
        return Pattern.matches(".*[@#$%^&*].*", input);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Hi! may i know whats your name?");
        Thread.sleep(1250);
        String name = "";
        boolean con = true;
        System.out.println("please type your gender or its first letter\n(male/female)");
        String gender = input.next();
        System.out.println("please enter valid name:");
        while (con) {
            input.nextLine();
            name = input.nextLine();
            if (testDisplay(name)) {
                System.out.println("please enter name that consist of alphabet");
            } else if (name.equalsIgnoreCase("") || name.equalsIgnoreCase(" ")) {
                System.out.println("Empty! enter your name please");
            } else {
                con = false;
            }
        }
        System.out.println("Nice to Meet You " + name + "!");
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        String ShowHiWithG = "";
        if(gender.equalsIgnoreCase("m") || gender.equalsIgnoreCase("male")){
            ShowHiWithG = "👨👋";
        }else{
            ShowHiWithG = "👩👋";
        }
        JLabel label = new JLabel("Nice to Meet You " + name + ShowHiWithG);

        label.setForeground(Color.BLACK);
        label.setBackground(Color.decode("#BCF1ED"));
        label.setOpaque(true);
        label.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        label.setPreferredSize(new Dimension(600,200));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 30));

        panel.add(label);
        frame.add(panel);

        frame.pack();
        frame.setVisible(true);
    }
}
