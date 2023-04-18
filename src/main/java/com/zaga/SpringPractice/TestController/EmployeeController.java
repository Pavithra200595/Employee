package com.zaga.SpringPractice.TestController;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zaga.SpringPractice.Model.EmployeeModel;

@RestController
public class EmployeeController {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;
    @GetMapping("/version")
    public String getVersion()
    {
        return appName+"-"+appVersion;
    }
    @GetMapping("/employee")
    public String getEmployee()
    {
        return "list of employees";
    }
    @GetMapping("/employee/{id}")
        public String getEmployee(@PathVariable("id") Long id)
        {
            return "Fetching the details for employee id:"+id;
        }
    @PostMapping("/createEmployee")
    public String createEmp(@RequestBody EmployeeModel employeeModel )
    {
        return "Saving details to the database"+employeeModel;
    }
    @DeleteMapping("/employee")
    public String deleteEmployee(@RequestParam("id") Long id)
    {
        return "deleting employee details for employee id:"+id;
    }
    @PutMapping("/updateEmployee/{id}")
    public EmployeeModel updateEmp(@PathVariable Long id,@RequestBody EmployeeModel employeeModel)
    {
        System.out.println("updating employee details for the id:"+id);
        return employeeModel;
    }
    
    

    
}
