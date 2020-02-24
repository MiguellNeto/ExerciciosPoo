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
public class Paralelepipedo {
    //atributos
    
    private float altura = 0;
    private float largura = 0;
    private float comprimento = 0;
    

    
    //metodos

    /**
     * @return the altura
     */
    public float getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura)throws Exception{
        if(altura < 0)throw new Exception("Altura não pode ser negativo");
        this.altura = altura;
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
         if(largura < 0)throw new Exception("Largura não pode ser negativo");
        this.largura = largura;
    }

    /**
     * @return the comprimento
     */
    public float getComprimento() {
        return comprimento;
    }

    /**
     * @param comprimento the comprimento to set
     */
    public void setComprimento(float comprimento)throws Exception{
       if(comprimento < 0)throw new Exception("Comprimento não pode ser negativo");
        this.comprimento = comprimento;
    }
    
    
    
    public float calcularArea(){
        float x = (float) 2.0;
       return  ( x * (altura * largura + altura * comprimento + largura * comprimento));
        
    }
    
    public float calcularVolume(){
        
       return  (altura * comprimento * largura);
        
    }
    
    
}
