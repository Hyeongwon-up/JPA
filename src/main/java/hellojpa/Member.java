package hellojpa;


import javax.persistence.*;
import java.util.Date;

@Entity
public class Member {

    @Id
    private Long id;

    @Column(name = "name", nullable = false) //nullabe : false -> notnull
    private String username;

    private Integer age;

    @Enumerated(EnumType.STRING) // BLOB, CLOB 매
    private RoleType roleType;

    @Temporal(TemporalType.TIMESTAMP) //날짜 타입 매핑
    private Date createdDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date lastModifiedDate;

    @Lob
    private String description;

    public Member() {
    }

}
 