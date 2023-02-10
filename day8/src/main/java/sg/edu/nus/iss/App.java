package sg.edu.nus.iss;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class App {
    private App() {
    }

    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            if (args[0].equalsIgnoreCase("kill")) {
                System.out.println("Ending program...");
                System.exit(0);
            }
        }
        String dirName = "day08data";
        String fileName = ".txt";
        String dirFileName = dirName + File.separator + fileName;
        FileService fs = new FileService();
        Boolean directoryCreated = fs.createDirectory(dirName);

        if (directoryCreated) {
            System.out.println("Directory Created" + dirName);
        } else {
            System.out.println("Directory already exist:" + dirName);
        }

        try {
            Boolean fileCreated = fs.createFile(dirName, fileName);

            if (fileCreated) {
                System.out.print("File created:" + fileCreated);
            } else {
                System.out.print("File already created:" + fileCreated);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileOutputStream fos = new FileOutputStream(dirFileName);
            // for (int i = 0; i < 20; i++) {
            //     //byte str[] = ByteBuffer.allocate(4).putInt(1).array();

            //     char str[] = Integer.toString(i).toCharArray();
            //     // writing string in byte array
            //     fos.write(str[0]);
            //     fos.write('\n');
            // }

            EmployeeService es = new EmployeeService();
            List<Employee> empList = es.generateEmployees();
            
            // clear the outputstream
            // force data to store to file
            fos.flush();
            fos.close();

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
