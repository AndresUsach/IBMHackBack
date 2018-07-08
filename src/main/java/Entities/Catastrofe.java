package Entities;

import javax.persistence.*;

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
