package com.example.demo.Controller;

import com.example.demo.Entities.Utility;
import com.example.demo.Service.Interface.Utility_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/utilities")
public class UtilityController {

    @Autowired
    private Utility_Interface utilityService;

    @GetMapping
    public ResponseEntity<List<Utility>> getAllUtilities() {
        List<Utility> utilities = utilityService.getAllUtilities();
        return new ResponseEntity<>(utilities, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Utility> getUtilityById(@PathVariable Long id) {
        Utility utility = utilityService.getUtilityById(id);
        if (utility != null) {
            return new ResponseEntity<>(utility, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Utility> createUtility(@RequestBody Utility utility) {
        Utility createdUtility = utilityService.createUtility(utility);
        return new ResponseEntity<>(createdUtility, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Utility> updateUtility(@PathVariable Long id, @RequestBody Utility utility) {
        Utility updatedUtility = utilityService.updateUtility(id, utility);
        if (updatedUtility != null) {
            return new ResponseEntity<>(updatedUtility, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUtility(@PathVariable Long id) {
        utilityService.deleteUtility(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
