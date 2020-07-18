package main;

import exception.InvalidException;
import model.Employee;
import service.EmployeeGenerator;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by KPS on 7/18/2020.
 */
public class Main {
    private static final Logger LOG = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        LOG.info("beginning the programm");
        Employee employee = new Employee(" " , "masoomi");
        Employee employee1 = new Employee("omid" , "masoomi");

        EmployeeGenerator employeeGenerator = new EmployeeGenerator();
        try {
            employeeGenerator.addEmployee(employee);

        } catch (InvalidException e) {
            LOG.log(Level.SEVERE,e.getMessage());
        }
        try {
            employeeGenerator.addEmployee(employee1);
        } catch (InvalidException e) {
            LOG.log(Level.SEVERE,e.getMessage());
        }

        LOG.info("Successfull finishedddd!");
    }
}
