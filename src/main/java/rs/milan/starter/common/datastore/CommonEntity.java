package rs.milan.starter.common.datastore;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.time.Instant;

/**
 * Entity containing common fields all other entities should contain.
 */
@MappedSuperclass
public abstract class CommonEntity {
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
