package ibm.hack.Entities;


import javax.persistence.*;

@Entity
@Table(name="Voluntario")
public class Voluntario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "voluntario_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;
}
