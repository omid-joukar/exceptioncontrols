package service;

import exception.InvalidException;
import model.Employee;

import java.util.Objects;

/**
 * Created by KPS on 7/18/2020.
 */
public class EmployeeGenerator {
    public void addEmployee(Employee employee) throws InvalidException {
        Objects.requireNonNull(employee);
        if (employee.getName()==" "){
            throw new InvalidException("The name is empty");
        }else {
            System.out.println("Employee saved : " + employee.getName()+" "+employee.getFamily());

        }
    }
}
