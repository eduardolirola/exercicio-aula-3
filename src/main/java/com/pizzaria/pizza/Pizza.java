package com.pizzaria.pizza;


import io.swagger.annotations.ApiModelProperty;

import java.time.LocalDateTime;
import java.util.UUID;

public class Pizza {
    @ApiModelProperty (hidden = true)
    private final UUID id;

    @ApiModelProperty(hidden = true)
    private final LocalDateTime dataDeCadastro;

    private String massa;

    private String queijo;

    private String molho;

    private String Sabor;

    private int tempoDePreparo;

    private Pizza(){
        this.id = UUID.randomUUID();
        this.dataDeCadastro = LocalDateTime.now();

    }

    public Pizza(UUID id, LocalDateTime dataDeCadastro, String massa, String queijo, String molho, String sabor, int tempoDePreparo) {
        this.id = id;
        this.dataDeCadastro = dataDeCadastro;
        this.massa = massa;
        this.queijo = queijo;
        this.molho = molho;
        Sabor = sabor;
        this.tempoDePreparo = tempoDePreparo;
    }

    public void setTempoDePreparo(int tempoDePreparo) {
        this.tempoDePreparo = tempoDePreparo;
    }

    public UUID getId() {
        return id;
    }

    public LocalDateTime getDataDeCadastro() {
        return dataDeCadastro;
    }

    public String getMassa() {
        return massa;
    }

    public String getQueijo() {
        return queijo;
    }

    public String getMolho() {
        return molho;
    }

    public String getSabor() {
        return Sabor;
    }

    public int getTempoDePreparo() {
        return tempoDePreparo;
    }
}
