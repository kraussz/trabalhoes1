package com.br.trabbd.trabalhobd.model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", length = 25, nullable = true)
    private String nome;



    @Column(name = "setor", length = 25, nullable = true)
    private String setor;

    @Column(name = "dataini", length = 25, nullable = true)
    private String dataini;

    @Column(name = "horaini", length = 25, nullable = true)
    private String horaini;


    @Column(name = "horafim", length = 25, nullable = true)
    private String horafim;

    @Column(name = "descricao", length = 25, nullable = true)
    private String descricao;

    // Métodos getters
    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }


    public String getSetor() {
        return setor;
    }

    public String getDataini() {
        return dataini;
    }

    public String getHoraini() {
        return horaini;
    }



    public String getHorafim() {
        return horafim;
    }

    public String getDescricao() {
        return descricao;
    }

    // Métodos setters
    public void setId(Integer id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void setDataini(String dataini) {
        this.dataini = dataini;
    }

    public void setHoraini(String horaini) {
        this.horaini = horaini;
    }



    public void setHorafim(String horafim) {
        this.horafim = horafim;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

