package org.icomemerce.data.jpa.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Setter
@Getter
@Table(name = "PRODUCT")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductEntity {
    String name;
}
