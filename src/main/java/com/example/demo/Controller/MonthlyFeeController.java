package com.example.demo.Controller;

import com.example.demo.Entities.MonthlyFee;
import com.example.demo.Service.Interface.MonthlyFee_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/monthly-fees")
public class MonthlyFeeController {

    @Autowired
    private MonthlyFee_Interface monthlyFeeService;

    @GetMapping
    public ResponseEntity<List<MonthlyFee>> getAllMonthlyFees() {
        List<MonthlyFee> monthlyFees = monthlyFeeService.getAllMonthlyFees();
        return new ResponseEntity<>(monthlyFees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MonthlyFee> getMonthlyFeeById(@PathVariable Long id) {
        MonthlyFee monthlyFee = monthlyFeeService.getMonthlyFeeById(id);
        if (monthlyFee != null) {
            return new ResponseEntity<>(monthlyFee, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<MonthlyFee> createMonthlyFee(@RequestBody MonthlyFee monthlyFee) {
        MonthlyFee createdMonthlyFee = monthlyFeeService.createMonthlyFee(monthlyFee);
        return new ResponseEntity<>(createdMonthlyFee, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<MonthlyFee> updateMonthlyFee(@PathVariable Long id, @RequestBody MonthlyFee monthlyFee) {
        MonthlyFee updatedMonthlyFee = monthlyFeeService.updateMonthlyFee(id, monthlyFee);
        if (updatedMonthlyFee != null) {
            return new ResponseEntity<>(updatedMonthlyFee, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    // Delete a monthly fee by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMonthlyFee(@PathVariable Long id) {
        monthlyFeeService.deleteMonthlyFee(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
