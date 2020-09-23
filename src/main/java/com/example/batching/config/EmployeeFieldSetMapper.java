package com.example.batching.config;

import com.example.batching.entity.Employee;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.stereotype.Component;

@Component
public class EmployeeFieldSetMapper implements FieldSetMapper<Employee> {

    @Override
    public Employee mapFieldSet(FieldSet fieldSet) {
        final Employee voltage = new Employee();

        voltage.setName(fieldSet.readString("name"));
        return voltage;

    }
}
