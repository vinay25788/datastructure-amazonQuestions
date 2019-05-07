package com.practise.designPattern.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
public class Writer {
    public static void main(String[] args) throws IOException {
        Employee employee = new Employee();
        employee.setName("Ashintha");
        employee.setAge((byte) 30);
        employee.setAddress("Galle");
        File file = new File("emp.ser");
        FileOutputStream fout = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(fout);
        oos.writeObject(employee);
        oos.close();
        System.out.println("Process complete");
    }
}
