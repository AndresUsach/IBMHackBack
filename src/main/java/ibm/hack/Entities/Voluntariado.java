package ibm.hack.Entities;

import javax.persistence.*;

@Entity
@Table(name="Voluntariado")
public class Voluntariado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voluntariado_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;
}
