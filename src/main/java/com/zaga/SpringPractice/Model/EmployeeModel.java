package com.zaga.SpringPractice.Model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class EmployeeModel {
    private String name;
    private long age;
    private String email;
    private String department;
    private String location;

    
}
