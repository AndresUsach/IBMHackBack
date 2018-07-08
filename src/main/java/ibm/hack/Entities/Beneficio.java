package ibm.hack.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Set;

@Entity
@Table(name="Beneficio")
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beneficio_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name="voluntariado_id")
    private Voluntariado voluntariado;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JsonIgnore
    @JoinTable(name="voluntariado_beneficio",
            joinColumns={@JoinColumn(name="beneficio_id")},
            inverseJoinColumns={@JoinColumn(name="voluntariado_id")})
    private Set<Voluntariado> voluntariados;

    @ManyToMany(cascade = {CascadeType.ALL},mappedBy="beneficios")
    @JsonIgnore
    private Set<Voluntario> voluntarios;

    @Column(nullable = false)
    private Timestamp fechaDeIngreso;

    public Beneficio() {
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

    public Voluntariado getVoluntariado() {
        return voluntariado;
    }

    public void setVoluntariado(Voluntariado voluntariado) {
        this.voluntariado = voluntariado;
    }

    public Set<Voluntariado> getVoluntariados() {
        return voluntariados;
    }

    public void setVoluntariados(Set<Voluntariado> voluntariados) {
        this.voluntariados = voluntariados;
    }

    public Set<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(Set<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }

    public Timestamp getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(Timestamp fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }
}
