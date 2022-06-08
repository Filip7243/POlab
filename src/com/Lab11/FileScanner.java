package com.Lab11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileScanner {

    private Scanner scanner = new Scanner(System.in);

    public void execute() throws IOException {
        String path = scanner.nextLine();

        try {
            FileReader fR = new FileReader(path);
            Scanner scanner = new Scanner(fR);

            int i = 0;
            while(scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
                i++;
            }

            System.out.println("Linii w pliku: " + i);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
