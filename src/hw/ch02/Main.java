package hw.ch02;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileIO f = new FileProperties(); //어댑터 생성
        try {
            f.readFromFile("file.txt");

            // f.setValue("width", "1024");
            // f.setValue("height", "512");
            // f.setValue("depth", "32");
            
            f.setValue("Year", "2023");
            f.setValue("bornYear", "2000");
            f.setValue("StudentId", "20200733");
            f.setValue("Name", "KimHyeSoo");
            f.setValue("Location","Gimpo");
            f.writeToFile("KimHyeSoo.txt");
            
            System.out.println("20200733 김혜수");

            System.out.println("newfile.txt is created.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
