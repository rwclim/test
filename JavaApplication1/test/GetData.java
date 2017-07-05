/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author boss
 */
package com.devcolibir.prop;
 
import java.io.*;
import java.util.Properties;
 
public class GetData {
 
    public static void getData(String[] args) {
 
        FileInputStream fis;
        Properties property = new Properties();
 
        try {
            fis = new FileInputStream("C:\\AT\\JavaApplication1\\testdata.properties");
            property.load(fis);
 
            String email = property.getProperty("email");
            String emailPassword = property.getProperty("emailPassword");
             
            System.out.println("email: " + email
                            + ", emailPassword: " + emailPassword);
 
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
 
    }
 
}
