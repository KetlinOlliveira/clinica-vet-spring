package vet.entities;

import java.util.Date;
import java.util.Objects;

public class Animal {

    private Long id;
    private String nome;
    private String raca;
    private Date dataNascimento;

    private Especie especie;
    private Cliente dono;

    public Animal(){

    }
    public Animal(Long id, String nome, Especie especie, Date data, String raca, Cliente cliente){
        this.id = id;
        this.nome = nome;
        this.especie = especie;
        this.dataNascimento = data;
        this.raca = raca;
        this.dono = cliente;
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
        return especie;
    }

    public Animal setEspecie(Especie especie) {
        this.especie = especie;
        return this;
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
