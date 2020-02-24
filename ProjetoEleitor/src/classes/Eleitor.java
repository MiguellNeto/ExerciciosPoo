/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.Calendar;

/**
 *
 * @author miguelneto
 */
public class Eleitor {

    //Atributos 
    private String nome = "";
    private int anoDeNascimento = 0;

    // Metodos 
    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the anoDeNascimento
     */
    public int getAnoDeNascimento() {
        return anoDeNascimento;
    }

    /**
     * @param anoDeNascimento the anoDeNascimento to set
     */
    public void setAnoDeNascimento(int anoDeNascimento) {
        this.anoDeNascimento = anoDeNascimento;
    }

    public String calcularTipoEleitor() {

        int idade = 2020 - anoDeNascimento;
        String tipoDeEleitor = "";
        if (idade < 16) {
            tipoDeEleitor = " Não Eleitor";
        } else if (idade >= 16 && idade < 18) {
            tipoDeEleitor = " Eleitor Facultativo";
        } else if (idade >= 18 && idade < 65) {
            tipoDeEleitor = " Eleitor Obrigatório";
        } else if (idade > 65) {
            tipoDeEleitor = " Eleitor Facultativo";
        }

        return tipoDeEleitor;

    }

}
