package com.mapsa.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ORDER")
@SequenceGenerator(
        name = "order_sequence",
        sequenceName = "ORDER_SEQ",
        allocationSize = 1000, initialValue = 10000
)
public class Order {
    private long id;
    private String status;
    private String name;
    private String remarks;

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "order_sequence")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "STATUS")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "REMARKS")
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id &&
                Objects.equals(status, order.status) &&
                Objects.equals(name, order.name) &&
                Objects.equals(remarks, order.remarks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, name, remarks);
    }
}
