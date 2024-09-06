package com.example.demo.Service;

import com.example.demo.Entities.ExtraFee;
import com.example.demo.Repository.ExtraFeeRepo;
import com.example.demo.Service.Interface.ExtraFee_Interface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExtraFeeService implements ExtraFee_Interface {

    @Autowired
    private ExtraFeeRepo additionalChargeRepository;

    @Override
    public List<ExtraFee> getAllAdditionalCharges() {
        return additionalChargeRepository.findAll();
    }

    @Override
    public ExtraFee getAdditionalChargeById(Long id) {
        return additionalChargeRepository.findById(id).orElse(null);
    }

    @Override
    public ExtraFee createAdditionalCharge(ExtraFee additionalCharge) {
        return additionalChargeRepository.save(additionalCharge);
    }

    @Override
    public ExtraFee updateAdditionalCharge(Long id, ExtraFee additionalCharge) {
        if (additionalChargeRepository.existsById(id)) {
            additionalCharge.setId(id);
            return additionalChargeRepository.save(additionalCharge);
        }
        return null;
    }

    @Override
    public void deleteAdditionalCharge(Long id) {
        additionalChargeRepository.deleteById(id);
    }
}
