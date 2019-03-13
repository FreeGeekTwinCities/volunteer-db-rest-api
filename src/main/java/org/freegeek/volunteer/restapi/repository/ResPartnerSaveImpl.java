package org.freegeek.volunteer.restapi.repository;

import org.freegeek.volunteer.restapi.entity.ResPartner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;

/**
 * Created by tom on 1/27/19.
 */
public class ResPartnerSaveImpl implements ResPartnerSave<ResPartner> {
    @Autowired
    EntityManager em;
    public static final Logger log = LoggerFactory.getLogger(ResPartnerSaveImpl.class.getName());
    @Override
    public <S extends ResPartner> ResPartner save(S entity) {
        log.info("Custom Save here!");
        ResPartner resPartner = new ResPartner();
        resPartner.setName(entity.getName());
        resPartner.setEmail(entity.getEmail());
        resPartner.setNotification_email_send(entity.getEmail());
        em.persist(resPartner);
        return resPartner;
    }
}
