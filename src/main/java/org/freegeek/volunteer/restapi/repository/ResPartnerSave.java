package org.freegeek.volunteer.restapi.repository;

import org.freegeek.volunteer.restapi.entity.ResPartner;

/**
 * Created by tom on 1/27/19.
 */
public interface ResPartnerSave<T> {
    <S extends ResPartner> ResPartner save(S entity);
}
