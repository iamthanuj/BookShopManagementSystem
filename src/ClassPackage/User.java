/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.io.BufferedReader;
import java.io.IOException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Thanuja
 */
public abstract class User {
    
    FileSystem fsBookStore = new FileSystem("bookStore.txt");
    
    private String userName;
    private String password;
    
    public User() {
    }
    
    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
    
    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
    
    public abstract boolean validateUser(String username, String password);
    
    public void viewBook(JTable table) {
        try {
            BufferedReader bookRecords = fsBookStore.readFile();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            model.setRowCount(0);
            
            Object[] tableLines = bookRecords.lines().toArray();
            
            for (Object tableLine : tableLines) {
                String line = tableLine.toString().trim();
                String[] dataRow = line.split(",");
                model.addRow(dataRow);
            }
            
        } catch (Exception e) {
            System.out.println("Something went wrong" + e);
        }
    }
    
    public boolean searchBookStock(String bookname, JTable table) {
        try {
            String bookName = bookname.toLowerCase();
            String findLine;
            String[] stocks;
            
            BufferedReader bookDetails = fsBookStore.readFile();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            model.setRowCount(0);
            
            while ((findLine = bookDetails.readLine()) != null) {
                stocks = findLine.split(",");
                for (String stock : stocks) {
                    if (stock.toLowerCase().contains(bookName)) {
                        model.addRow(new Object[]{stocks[0], stocks[4]});
                        return true;
                    }
                    
                }
                
            }
        } catch (IOException e) {
        }
        return false;
        
    }
    
    public boolean searchBook(String bookTitle, JTable table) {
        try {
            String bookName = bookTitle.toLowerCase();
            String findLine;
            String[] books;
            
            BufferedReader bookDetails = fsBookStore.readFile();
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            
            model.setRowCount(0);
            
            while ((findLine = bookDetails.readLine()) != null) {
                books = findLine.split(",");
                for (String book : books) {
                    if (book.toLowerCase().contains(bookName)) {
                        model.addRow(books);
                        return true;
                    }
                }
            }
            
        } catch (IOException e) {
        }
        return false;
    }
    
}
