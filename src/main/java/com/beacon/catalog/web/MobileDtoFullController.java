package com.beacon.catalog.web;

import com.beacon.catalog.model.MobileDtoFull;
import com.beacon.catalog.service.MobileDtoFullService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/mobile")
@CrossOrigin
public class MobileDtoFullController {

    private MobileDtoFullService mobileDtoFullService;

    public MobileDtoFullController(MobileDtoFullService mobileDtoFullService) {
        this.mobileDtoFullService = mobileDtoFullService;
    }

    /**
     * Get mobile dto with full description by mobile id. If this mobile does not exist, return 404 status.
     * @param brand is a brand field and also the first part of mobileId.
     * @param id is the second part of mobileId.
     * @return mobile dto with full description or status 404
     */
    @GetMapping("/{brand}/{id}")
    public ResponseEntity findMobileDtoFullById(@PathVariable(name = "brand") String brand,
                                                @PathVariable(name = "id") String id) {
        Optional<MobileDtoFull> mobileDtoFull = mobileDtoFullService.findMobileDtoFullById(brand + id);
        return ResponseEntity.of(mobileDtoFull);
    }
}
