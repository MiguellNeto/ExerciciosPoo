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
public class Retangulo {
    
    //ATRIBUTOS
    
    private float comprimento = 0;
    private float largura = 0;
    
    //METODOS 

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento)throws Exception {
         if (comprimento < 0 )throw new Exception("Comprimento não pode ser negativo");
        this.comprimento = comprimento;
    }

    /**
     * @return the largura
     */
    public float getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(float largura)throws Exception {
        if (largura < 0 )throw new Exception("Largura não pode ser negativo");
        this.largura = largura;
    }
    
    public float calculoDoPerimetro(){
        
        return (2 * comprimento) + (2 * largura);
        
    }
    
    public float calculoDaArea(){
        
        return (largura*comprimento);
        
    }
}
