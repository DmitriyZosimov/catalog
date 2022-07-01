package com.beacon.catalog.dao;

import com.beacon.catalog.model.MobileDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Dao class is to manipulate with mobile data in database.
 */
@Repository
public interface MobileDao extends JpaRepository<MobileDto, String> {

}
