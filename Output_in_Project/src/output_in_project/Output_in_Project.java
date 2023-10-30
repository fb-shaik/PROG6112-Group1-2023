/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package output_in_project;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Output_in_Project {

public static void main(String[] args) {
    String content = "Hello, World!";  // This is the content we want to write to the file.

    File file = new File("output.txt"); // This creates a reference to a file named "output.txt".

    try (FileWriter fw = new FileWriter(file); BufferedWriter bw = new BufferedWriter(fw)) {
        bw.write(content);  // This writes the content string to the file.
        System.out.println("File written successfully!");
    } catch (IOException e) {
        e.printStackTrace();
    }
}
}
