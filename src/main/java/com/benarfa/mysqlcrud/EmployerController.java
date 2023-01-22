package com.benarfa.mysqlcrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/api")
public class EmployerController {
    @Autowired
    private EmpRepo empRepo;

    // get employee
    @GetMapping(path="/emp")
    public @ResponseBody Iterable<Employee> getAllEmployee() {
        // This returns a JSON or XML with the users
        return empRepo.findAll();
    }
}
