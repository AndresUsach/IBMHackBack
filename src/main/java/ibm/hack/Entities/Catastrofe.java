package ibm.hack.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Catastrofe")
public class Catastrofe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "catastrofe_id")
    private Long id;

    @Column(nullable = false)
    private String firstName;

}
