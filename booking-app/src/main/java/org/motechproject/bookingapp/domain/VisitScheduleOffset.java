package org.motechproject.bookingapp.domain;

import org.motechproject.ebodac.domain.VisitType;
import org.motechproject.mds.annotations.Entity;
import org.motechproject.mds.annotations.Field;

import javax.jdo.annotations.Unique;

@Entity
public class VisitScheduleOffset {

    @Unique
    @Field(required = true)
    private VisitType visitType;

    @Field(required = true)
    private Integer timeOffset;

    public VisitType getVisitType() {
        return visitType;
    }

    public void setVisitType(VisitType visitType) {
        this.visitType = visitType;
    }

    public Integer getTimeOffset() {
        return timeOffset;
    }

    public void setTimeOffset(Integer timeOffset) {
        this.timeOffset = timeOffset;
    }
}
