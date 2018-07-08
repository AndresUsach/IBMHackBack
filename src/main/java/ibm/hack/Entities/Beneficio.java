package ibm.hack.Entities;

import javax.persistence.*;

@Entity
@Table(name="Beneficio")
public class Beneficio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "beneficio_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;


}
