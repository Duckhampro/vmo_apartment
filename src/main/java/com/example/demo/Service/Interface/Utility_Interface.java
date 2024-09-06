package com.example.demo.Service.Interface;

import com.example.demo.Entities.Utility;
import java.util.List;

public interface Utility_Interface {
    List<Utility> getAllUtilities();
    Utility getUtilityById(Long id);
    Utility createUtility(Utility utility);
    Utility updateUtility(Long id, Utility utility);
    void deleteUtility(Long id);
}