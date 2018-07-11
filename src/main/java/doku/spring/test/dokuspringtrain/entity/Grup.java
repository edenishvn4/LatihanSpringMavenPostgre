package doku.spring.test.dokuspringtrain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "grup")
@Data
public class Grup {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String namagrup;

}
