/*
Conor Budge
Coffee Shop Program
2/26/16
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String fileName = "coffee.txt";
        String line;

        ArrayList coffeeList = new ArrayList();

        //Read the lines from the file and put into ArrayList
        try {
            BufferedReader bInput = new BufferedReader(new FileReader(fileName));
            if(!bInput.ready()) { //checking to see if file is ready
                throw new IOException();
            }
            while ((line = bInput.readLine()) != null) {
                coffeeList.add(line); //add to Array List
            }

            bInput.close();

        } catch (IOException e) { //Catch any exceptions
            System.out.println(e);
        }

        int aSize = coffeeList.size();
        for (int i = 0; i < aSize; i++) {
            System.out.println(coffeeList.get(i).toString());
        }
    }
}
