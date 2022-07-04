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
     * @param mobileId is used to search by id in DB.
     * @return mobile dto with full description or status 404
     */
    @GetMapping("/{id}")
    public ResponseEntity findMobileDtoFullById(@PathVariable(name = "id") String mobileId) {
        Optional<MobileDtoFull> mobileDtoFull = mobileDtoFullService.findMobileDtoFullById(mobileId);
        return ResponseEntity.of(mobileDtoFull);
    }
}
