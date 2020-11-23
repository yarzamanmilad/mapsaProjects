package com.mapsa.webstore.product.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Data
@Accessors(chain = true)
@Entity
@Table(name = "GROUP_TBL")
@Component
@AllArgsConstructor
@NoArgsConstructor
public class GroupTbl {
    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Basic
    @Column(name = "NAME")
    private String name;
    @Basic
    @Column(name = "DESCRIPTION")
    private String description;
    @ManyToOne
    private Category category;
    @OneToMany
    private List<Product> products;
}
