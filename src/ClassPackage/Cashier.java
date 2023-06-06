/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.io.BufferedReader;
import java.io.IOException;

/**
 *
 * @author Thanuja
 */
public class Cashier extends User{
    
    FileSystem fsCashier = new FileSystem("cashierAccounts.txt");

    @Override
    public boolean validateUser(String username, String password) {
        try {
            String[] words = null;
            BufferedReader users = fsCashier.readFile();
            String user;

            while ((user = users.readLine()) != null) {
                words = user.split(",");

                if (words[0].equals(username) && words[1].equals(password)) {
                    return true;
                }
            }

        } catch (IOException e) {
            System.out.println("Error validating Login" + e);
        }
        return false;
    }
    
}
