/*



Teste redirecionamento gitHub


 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author miguelneto
 */
public class Cilindro {
    //Atributos
    
    private float raio = 0;
    private float altura = 0 ;
    
    
    
    //Metodos

    /**
     * @return the raio
     */
    public float getRaio() {
        return raio;
    }

    /**
     * @param raio the raio to set
     */
    public void setRaio(float raio)throws Exception{
        if(raio < 0 )throw new Exception("Raio não pode ser negativo");
        this.raio = raio;
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
    public void setAltura(float altura)throws Exception{
        if(altura < 0 )throw new Exception("Altura não pode ser negativo");
        this.altura = altura;
    }
    
    
    
    public float CalcularAreaLateral(){
        return (float) (2*3.1415*raio*altura);
        
        
    }
    public float CalcularAreaTotal(){
        return (float) ((2*3.1415*raio*(altura+raio)));
        
        
    }
    public float CalcularVolume(){
        return (float) (3.1415*raio*raio*altura);
        
        
    }
    
}
