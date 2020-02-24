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
public class Esfera {
    
    
    //Atributos
    
    private float raio =0 ;
     
    
    
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
    public void setRaio(float raio) throws Exception{  //aqui throws
        if (raio < 0 )throw new Exception("Raio não pode ser negativo");
        this.raio = raio;
        
    }
    
    
    public float calcularArea(){
        
       return  (float) (4*3.1415*(raio*raio));
        
        
    }
    
    public float calcularVolume(){
        
       return (float) ((4.0/3.0)*3.1415*(raio*raio*raio)); 
        
    }
    
   
    
    
    
    
}
