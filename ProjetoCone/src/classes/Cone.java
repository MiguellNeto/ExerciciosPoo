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
public class Cone {
    //Atributos
    
    private float  raio = 0;
    private float altura = 0 ;
    private float geratriz = 0;//calculo da geratriz?????? Altura e raio gera a geratriz
     
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
        if(raio < 0 )throw new Exception("Raio nao pode ser negativo");
        this.raio = raio;
    }

    /**
     * @return the altura
     */
    public float getAltura(){
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(float altura) throws Exception{
        if(altura < 0)throw new Exception("Altura nao pode ser negativo");
        this.altura = altura;
    }
    
    public float calcularGeratriz(){
        
        return (float) (Math.sqrt((altura*altura)+(raio*raio)));
        
    }
     public float calcularAreaLateral(){
        
        return (float) (3.1415*raio*calcularGeratriz());
        
    }
      public float calcularAreaTotal(){
        
        return (float) (3.1415*raio*(calcularGeratriz()+raio));
        
    }
       public float calcularVolume(){
        
        return (float) (1.0/3.0*3.1415*(raio*raio)*altura);
        
    }

    /**
     * @return the geratriz
     */
    public float getGeratriz() {
        return geratriz;
    }

    /**
     * @param geratriz the geratriz to set
     */
    public void setGeratriz(float geratriz) {
        this.geratriz = geratriz;
    }
    
}
