package org.springframework.batch.item.querydsl.integrationtest.entity;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
abstract class EntityAuditing2 extends EntityAuditing {

    @Column
    private Long id2;

    public Long getId2() {
        return id2;
    }
}
