package com.beacon.catalog.dao;

import com.beacon.catalog.model.MobileDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class MobileDaoIT {

    @Autowired
    MobileDao mobileDao;

    @Test
    public void setupTest() {
        Assertions.assertNotNull(mobileDao);
    }

    @Test
    public void getAllMobileDto() {
        List<MobileDto> dtos = mobileDao.findAll();
        Assertions.assertNotNull(dtos);
        Assertions.assertEquals(2, dtos.size());
        // if it doesn't pass, check import.sql. Mobiles should be inserted in row
        Assertions.assertEquals("honor508128black", dtos.get(0).getMobileId());
        System.out.println("\nFirst: " + dtos.get(0).toString());
        Assertions.assertEquals("pocox3pro8256green", dtos.get(1).getMobileId());
        System.out.println("\nSecond: " + dtos.get(1).toString());
    }
}
