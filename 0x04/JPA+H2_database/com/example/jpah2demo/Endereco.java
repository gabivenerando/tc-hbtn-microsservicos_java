package com.example.jpah2demo;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String logadouro;
    private String endereco;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;
    @ManyToOne
    private Cliente cliente;

    public Endereco(Long id, String logadouro, String endereco, String numero, String bairro, String cidade, String estado, Cliente cliente) {
        this.id = id;
        this.logadouro = logadouro;
        this.endereco = endereco;
        this.numero = numero;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "id=" + id +
                ", logadouro='" + logadouro + '\'' +
                ", endereco='" + endereco + '\'' +
                ", numero='" + numero + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", cliente=" + cliente +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco1 = (Endereco) o;
        return Objects.equals(id, endereco1.id) && Objects.equals(logadouro, endereco1.logadouro) && Objects.equals(endereco, endereco1.endereco) && Objects.equals(numero, endereco1.numero) && Objects.equals(bairro, endereco1.bairro) && Objects.equals(cidade, endereco1.cidade) && Objects.equals(estado, endereco1.estado) && Objects.equals(cliente, endereco1.cliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, logadouro, endereco, numero, bairro, cidade, estado, cliente);
    }
}
