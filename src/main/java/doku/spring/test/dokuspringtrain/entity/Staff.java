package doku.spring.test.dokuspringtrain.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "staf_it")
@Data
public class Staff{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nama;

    private int usia;
}
