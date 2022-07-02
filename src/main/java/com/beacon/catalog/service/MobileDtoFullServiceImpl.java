package com.beacon.catalog.service;

import com.beacon.catalog.dao.MobileDtoFullDao;
import com.beacon.catalog.model.MobileDtoFull;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Default implementation of {@link MobileDtoFullService}
 */
@Service
@Transactional
public class MobileDtoFullServiceImpl implements MobileDtoFullService {

    private MobileDtoFullDao mobileDtoFullDao;

    public MobileDtoFullServiceImpl(MobileDtoFullDao mobileDtoFullDao) {
        this.mobileDtoFullDao = mobileDtoFullDao;
    }

    @Transactional(readOnly = true)
    @Override
    public List<MobileDtoFull> findAllMobileDtoFull() {
        return mobileDtoFullDao.findAll();
    }
}
