package com.example.Challange_88;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class fileReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please entre the file name , that you want to read : ");

        String fileNmae = input.next();

        try(FileReader reader = new FileReader(fileNmae))   {
            int read;
            while((read = reader.read()) != -1) {
                System.out.println((char)read);
            }
        }catch (FileNotFoundException exception)    {
            System.out.printf("%s not found",fileNmae);
        }catch (IOException exception)  {
            System.out.printf("Exception Occurred : %s",exception.getMessage());
        }
    }
}
