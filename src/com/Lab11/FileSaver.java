package com.Lab11;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileSaver {

    private Scanner scanner = new Scanner(System.in);

    public void execute() throws IOException {
        String path = scanner.nextLine();

        FileWriter fW = new FileWriter(path);

        while (true) {
            String text = scanner.nextLine();
            System.out.println(text);
            if(text.equals("-")) {
                break;
            } else {
                if(text.equals("\n")) {
                    fW.write(System.lineSeparator());
                    continue;
                }
                fW.write(text);
            }
        }
        fW.close();
    }
}
