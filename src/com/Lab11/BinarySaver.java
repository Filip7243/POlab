package com.Lab11;

import java.io.*;
import java.util.Scanner;

public class BinarySaver {

    private Scanner scanner = new Scanner(System.in);

    public void execute() throws IOException {
        String fileName = scanner.nextLine();
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        try (DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(fileName))) { //try with resources
            dataOutputStream.writeInt(day);
            dataOutputStream.writeInt(month);
            dataOutputStream.writeInt(year);
        }
    }

    public void read() throws IOException {
        String path = scanner.nextLine();

        DataInputStream dS = new DataInputStream(new FileInputStream(path));

        while(dS.available() > 0){
            System.out.println(dS.readInt());
        }

        dS.close();
    }
}
