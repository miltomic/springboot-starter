package rs.milan.starter.foo.datastore;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "foo")
public class Foo {

    @Id
    @Column(name = "id")
    private Integer id;

    @Version
    @Column(name = "version")
    private int version;

    @CreatedDate
    @Column(name = "created")
    private Instant created;

    @LastModifiedDate
    @Column(name = "modified")
    private Instant modified;
}
