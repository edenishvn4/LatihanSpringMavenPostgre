package doku.spring.test.dokuspringtrain.entity;

import lombok.Data;

import java.util.List;

@Data
public class Employee {
  private int id;
  private String nama;
  private int usia;
  private List<Address> alamat;

}
