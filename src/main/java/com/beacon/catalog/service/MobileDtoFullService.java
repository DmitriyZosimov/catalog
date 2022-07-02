package com.beacon.catalog.service;

import com.beacon.catalog.model.MobileDtoFull;

import java.util.List;

/**
 * The service layout is to use one transaction for several connection to a database if it is needed.
 * Work with {@link com.beacon.catalog.model.MobileDtoFull} model.
 */
public interface MobileDtoFullService {

    /**
     * Find all mobile dtos with full information in a database.
     * @return list with {@link MobileDtoFull} models.
     */
    List<MobileDtoFull> findAllMobileDtoFull();
}
