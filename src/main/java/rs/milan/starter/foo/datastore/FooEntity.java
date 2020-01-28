package rs.milan.starter.foo.datastore;

import rs.milan.starter.common.datastore.CommonEntity;

import javax.persistence.*;

@Entity
@Table(name = "foo")
public class FooEntity extends CommonEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "is_foo")
    private boolean isFoo;
}
