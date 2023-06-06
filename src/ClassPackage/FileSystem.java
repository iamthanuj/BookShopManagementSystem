 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Thanuja
 */
public class FileSystem {

    private static String FILE_PATH = "C:\\FileStore\\";
    File file;
    private String fileName;

    public FileSystem(String fileName) {
        this.fileName = fileName;
        createANewFile();
    }

    //Create_file_method
    public boolean createANewFile() {
        try {
            file = new File(FILE_PATH + fileName);
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
                return true;
            } else {
                System.out.println("File already exisit!");
                return false;
            }
        } catch (IOException e) {
            System.out.println("Something went wrong with Creating file " + e);
            return false;
        }
    }

    //write_data_to_file_method
    public boolean writeDataToFile(String record) {
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file, true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(record);
            bw.newLine();
            bw.close();
            fw.close();

            return true;

        } catch (IOException e) {
            System.out.println("Something went wrong with data writing to file " + e);
            return false;
        }
    }

    public BufferedReader readFile() {
        if (!createANewFile()) {
            try {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);

                return br;
            } catch (IOException e) {
                System.out.println("Something went wrong with Reading file " + e);
            }
        }
        return null;
    }

}
