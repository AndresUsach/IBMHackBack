package ibm.hack.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Comuna")
public class Comuna {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comuna_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="region_id")
    private Region region;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return name;
    }

    public void setFirstName(String firstName) {
        this.name = firstName;
    }

}
