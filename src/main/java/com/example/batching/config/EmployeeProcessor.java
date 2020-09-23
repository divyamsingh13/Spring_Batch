package com.example.batching.config;

import com.example.batching.entity.Employee;
import org.springframework.batch.item.ItemProcessor;

public class EmployeeProcessor implements ItemProcessor<Employee, Employee> {

    @Override
    public Employee process(final Employee voltage) {
        final String volt = voltage.getName();

        final Employee processedVoltage = new Employee();
        processedVoltage.setName(volt);
        return processedVoltage;
    }
}
