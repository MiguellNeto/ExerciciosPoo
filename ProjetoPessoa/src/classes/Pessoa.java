/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author miguelneto
 */
public class Pessoa {

    //Atributos
    private String nome = "";
    private int peso = 0;
    private float altura = 0;
    private String sexo = "";

    //Metodos   bt direito  = refatorar / encapsular campos
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
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public float calcularIMC() {
        // float valor = (peso/(altura*altura));
        //  return valor;
        return (peso / (altura * altura));

    }

    public String resultadoImc() {

        if (calcularIMC() < 17) {
            return " MUITO ABAIXO DO PESO ";
        } else if (calcularIMC() < 18.50) {
            return " ABAIXO DO PESO ";
        } else if (calcularIMC() < 25) {
            return " PESO NORMAL ";
        } else if (calcularIMC() < 35) {
            return " SOBREPESO I ";
        } else if (calcularIMC() <= 40) {
            return " OBESIDADE II";
        } else {
            return " OBESIDADE GRAVE III";
        }

    }

}


