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
public class Manager extends User {

    FileSystem fsManager = new FileSystem("managerAccounts.txt");
    FileSystem fsCashier = new FileSystem("cashierAccounts.txt");
    FileSystem fsBookStore = new FileSystem("bookStore.txt");

    public Manager() {
    }

    public Manager(String userName, String password) {
        super(userName, password);
    }

    @Override
    public boolean validateUser(String username, String password) {
        try {
            String[] words = null;
            BufferedReader users = fsManager.readFile();
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

    public boolean createUser(String userType) {
        if (userType.equals("Manager")) {
            if (!fsManager.createANewFile()) {
                String userDetails = super.getUserName() + "," + super.getPassword();
                return fsManager.writeDataToFile(userDetails);
            }
        } else if (userType.equals("Cashier")) {
            if (!fsCashier.createANewFile()) {
                String userDetails = super.getUserName() + "," + super.getPassword();
                return fsCashier.writeDataToFile(userDetails);
            }
        }
        return false;
    }

    public boolean addBook(String title, String author, String category, double price, int quantity) {
        Book newBook = new Book(title, author, category, price, quantity);
        if (!fsBookStore.createANewFile()) {
            String bookDetails = newBook.getTitle() + "," + newBook.getAuthor() + "," 
                    + newBook.getCategory() + "," + newBook.getPrice() + "," + newBook.getQuantity();
            return fsBookStore.writeDataToFile(bookDetails);
        }
        return false;
    }


}
