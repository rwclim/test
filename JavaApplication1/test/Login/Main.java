/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
package com.devcolibir.prop;
 
import java.io.*;
import java.util.Properties;
 
public class Main {
 
    public static void main(String[] args) {
 
        FileInputStream fis;
        Properties property = new Properties();
 
        try {
            fis = new FileInputStream("/AT/JavaApplication1/testdata.properties");
            property.load(fis);
 
            String host = property.getProperty("db.host");
            String login = property.getProperty("db.login");
            String password = property.getProperty("db.password");
 
            System.out.println("HOST: " + host
                            + ", LOGIN: " + login
                            + ", PASSWORD: " + password);
 
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
 
    }
 
}