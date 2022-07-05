package com.beacon.catalog.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@DiscriminatorValue(value = "2")
@Data
@NoArgsConstructor
public class MobileNotMainImage extends MobileImage {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mobile_id", nullable = false)
    @JsonBackReference
    private MobileDtoFull mobileDtoFull;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MobileNotMainImage that = (MobileNotMainImage) o;

        return mobileDtoFull.equals(that.mobileDtoFull);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + mobileDtoFull.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "MobileNotMainImage{} " + super.toString();
    }
}
