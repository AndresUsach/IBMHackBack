package ibm.hack.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="Voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voluntario_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JsonIgnore
    @JoinTable(name="voluntario_beneficio",
            joinColumns={@JoinColumn(name="voluntario_id")},
            inverseJoinColumns={@JoinColumn(name="beneficio_id")})
    private Set<Beneficio> beneficios;

    public Voluntario() {
    }

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

    public Set<Beneficio> getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(Set<Beneficio> beneficios) {
        this.beneficios = beneficios;
    }
}
