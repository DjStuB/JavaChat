package com.simbirsoft.Shimarovinternship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.swing.*;
import java.net.URL;

@SpringBootApplication
public class ShimarovInternshipApplication {
public static void main(String[] args) {
SpringApplication.run(ShimarovInternshipApplication.class, args);
URL iconURL = ClassLoader.getSystemResource("/images/icon.png");
ImageIcon imageIcon = new ImageIcon(iconURL);}

}

