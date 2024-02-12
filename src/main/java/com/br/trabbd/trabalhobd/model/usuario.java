package com.br.trabbd.trabalhobd.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import javax.xml.crypto.Data;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "O nome não pode ser nulo")
    @Size(min = 1, max = 25, message = "O nome deve ter entre 1 e 25 caracteres")
    @Column(name = "nome", length = 25, nullable = true)
    private String nome;

    @NotBlank(message = "O setor não pode ser nulo")
    @Size(min = 1, max = 25, message = "O setor deve ter entre 1 e 25 caracteres")
    @Column(name = "setor", length = 25, nullable = true)
    private String setor;

    @NotNull(message = "A data de início não pode ser nula")
    @Column(name = "dataini", length = 25, nullable = true)
    private Date dataini;

    @NotNull(message = "A hora de início não pode ser nula")
    @Column(name = "horaini", length = 25, nullable = true)
    private Time horaini;

    @NotNull(message = "A hora de fim não pode ser nula")
    @Column(name = "horafim", length = 25, nullable = true)
    private Time horafim;

    @NotBlank(message = "A descrição não pode ser nula")
    @Size(min = 1, max = 255, message = "A descrição deve ter entre 1 e 255 caracteres")
    @Column(name = "descricao", length = 255, nullable = true)
    private String descricao;

    // Métodos getters e setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Date getDataini() {
        return dataini;
    }

    public void setDataini(Date dataini) {
        this.dataini = dataini;
    }

    public Time getHoraini() {
        return horaini;
    }

    public void setHoraini(Time horaini) {
        this.horaini = horaini;
    }

    public Time getHorafim() {
        return horafim;
    }

    public void setHorafim(Time horafim) {
        this.horafim = horafim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
