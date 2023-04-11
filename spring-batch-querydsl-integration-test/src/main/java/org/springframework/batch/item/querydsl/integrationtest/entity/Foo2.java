package org.springframework.batch.item.querydsl.integrationtest.entity;

import javax.persistence.Entity;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Foo2 extends EntityAuditing2 {

    private String name;

    public Foo2(String name) {
        this.name = name;
    }
}
