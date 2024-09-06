package com.example.demo.Service.Interface;

import com.example.demo.Entities.ExtraFee;
import java.util.List;

public interface ExtraFee_Interface {
    List<ExtraFee> getAllAdditionalCharges();
    ExtraFee getAdditionalChargeById(Long id);
    ExtraFee createAdditionalCharge(ExtraFee additionalCharge);
    ExtraFee updateAdditionalCharge(Long id, ExtraFee additionalCharge);
    void deleteAdditionalCharge(Long id);
}
