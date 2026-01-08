package vet.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "tb_animal")
public class Animal implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String raca;
    private Date dataNascimento;
    private Integer especie;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente dono;

    public Animal(){

    }
    public Animal(Long id, String nome, Especie especie, Date data, String raca, Cliente dono){
        this.id = id;
        this.nome = nome;
        setEspecie(especie);
        this.dataNascimento = data;
        this.raca = raca;
        this.dono = dono;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Animal setNome(String nome) {
        this.nome = nome;
        return this;
    }

    public String getRaca() {
        return raca;
    }

    public Animal setRaca(String raca) {
        this.raca = raca;
        return this;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Animal setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
        return this;
    }

    public Especie getEspecie() {
        return Especie.valueOf(especie);
    }

    public void setEspecie(Especie especie) {
      if(especie != null){
          this.especie = especie.getCode();
      }
    }

    public Cliente getDono() {
        return dono;
    }

    public Animal setDono(Cliente dono) {
        this.dono = dono;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Animal animal)) return false;
        return Objects.equals(id, animal.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
