package com.example.demo.Controller;


import com.example.demo.Entities.ExtraFee;
import com.example.demo.Service.Interface.ExtraFee_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/additional-charges")
public class ExtraFeeController {

    @Autowired
    private ExtraFee_Interface additionalChargeService;

    @GetMapping
    public ResponseEntity<List<ExtraFee>> getAllAdditionalCharges() {
        List<ExtraFee> additionalCharges = additionalChargeService.getAllAdditionalCharges();
        return new ResponseEntity<>(additionalCharges, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ExtraFee> getAdditionalChargeById(@PathVariable Long id) {
        ExtraFee additionalCharge = additionalChargeService.getAdditionalChargeById(id);
        if (additionalCharge != null) {
            return new ResponseEntity<>(additionalCharge, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<ExtraFee> createAdditionalCharge(@RequestBody ExtraFee additionalCharge) {
        ExtraFee createdAdditionalCharge = additionalChargeService.createAdditionalCharge(additionalCharge);
        return new ResponseEntity<>(createdAdditionalCharge, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ExtraFee> updateAdditionalCharge(@PathVariable Long id, @RequestBody ExtraFee additionalCharge) {
        ExtraFee updatedAdditionalCharge = additionalChargeService.updateAdditionalCharge(id, additionalCharge);
        if (updatedAdditionalCharge != null) {
            return new ResponseEntity<>(updatedAdditionalCharge, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdditionalCharge(@PathVariable Long id) {
        additionalChargeService.deleteAdditionalCharge(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}