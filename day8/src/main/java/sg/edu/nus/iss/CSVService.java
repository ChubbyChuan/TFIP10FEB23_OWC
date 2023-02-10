package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class CSVService {
    public static final String FILE_HEADER ="staff no, full name , department , role , email,";
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE = "\n";

    public void writeToCSV (List<Employee> employees String fullPathFileName){
        FileWriter fw = new FileWriter(fullPathFileName);

        fw.append(FILE_HEADER);
        fw.append(NEW_LINE);
        // processing to write record-by-record
        for (Employee emp : employees){
            fw.append(emp.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getEmail());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(emp.getClass());
            fw.append(COMMA_DELIMITER);
            fw.append(String.valueof(emp.getSalary()));
            fw.append(COMMA_DELIMITER);



        }

public List<Employee> readFromCSV (String fullPathFileName) throws FileNotFoundException{
    FileReader Fr = new FileReader(fullPathFileName);
    BufferedReader br = new BufferedReader(fr);

    String line ="";
    List<Employee> employees = new ArrayList<Employee>();
    line = br.readLine();

    while((line = br.readLine()) != null) {
        String[] strEmployee = line.split(COMMA_DELIMITER);

        if (strEmployee.length > 0) {
            Employee emp = new Employee(strEmployee[0], strEmployee[1], strEmployee[2], strEmployee[3],strEmployee[4], Integer.parseInt(strEmployee[5]));
            employees.add(emp);
        }
    }
}

        fw.flush();
        fw.close();
    }
}
