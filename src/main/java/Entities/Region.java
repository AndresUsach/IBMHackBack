package Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="Region")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @OneToMany(mappedBy="region")
    @JsonIgnore
    private List<Comuna> Comuna;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public List<Entities.Comuna> getComuna() {
        return Comuna;
    }

    public void setComuna(List<Entities.Comuna> comuna) {
        Comuna = comuna;
    }
}
