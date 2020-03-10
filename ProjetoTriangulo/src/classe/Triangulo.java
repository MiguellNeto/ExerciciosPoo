/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classe;

/**
 *
 * @author miguelneto
 */
public class Triangulo {
    
    //Atributos 
    
    private float ladoA = 0; // =1;
    private float ladoB = 0; // =1;
    private float ladoC = 0; // =1;
   // satatic private int valor = 15; 
 
   //Metodos 

    /**
     * @return the ladoA
     */
    public float getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
   public void setLadoA(float ladoA)throws Exception{
        if ( ladoA < 0 )throw new Exception(" Lado A do Triângulo não pode ser negativo");
   this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public float getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(float ladoB)throws Exception{
        if ( ladoB < 0 )throw new Exception(" Lado B do Triângulo não pode ser negativo");
     this.ladoB = ladoB;
    }

    /**
     * @return the ladoC
     */
    public float getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(float ladoC)throws Exception{
        if ( ladoC < 0 )throw new Exception(" Lado C do Triângulo não pode ser negativo");
       this.ladoC = ladoC;
    }
    
    
    public String tipoDeTriangulo(){
        
        if ( ladoA == ladoB && ladoB == ladoC) {
            return " O triângulo é Equilátero ";
        }else if ( ladoA == ladoB || ladoA == ladoC  || ladoB==ladoC){
            return " O triângulo é Isósceles  ";
        }else {
            return " O triângulo é Escaleno ";
        }
        
    }
    
    public String anguloDoTriangulo(){
        
        if ( ladoA <  (ladoB + ladoC) ) {
            return " O ângulo é Acutângulo ";
        }else if ( ladoA > (ladoB + ladoC )){
            return " O ângulo é Obtusângulo  ";
        }else if ( ladoA == (ladoB + ladoC)){
            return " O ângulo é Etângulo ";
        }else {
            
        }
        return null;
    }  
       
    
    
    public float calculoArea()throws Exception{
        
        if ( ladoA > ladoB + ladoC || ladoB > ladoC + ladoA || ladoC > ladoA + ladoB)throw new Exception("Os lados fornecidos não caracterizam um triângulo") ;
     
        float tri = (ladoA + ladoB + ladoC)/2;
     
     return (float) Math.sqrt(tri*(tri-ladoA)*(tri-ladoB)*(tri-ladoC));
     
    }
   
 /*
    
    
    Staticos metodo ou atributo que nao necessita de uma instancia 
    
   *** nao precisa de objeto para usar 
   *** de forma alguma pode usar atributos da sua classe, nao pode fazer referencia pq nao tem objeto 
   *** A MESMO QUE SEU ATRIBUTO SEJA ESTATICO - PQ UM ATRIBUTO ESTATICO NAO DEPENTE DA INSTANCIA  
    
    
    static public boolean formaTriangulo(int lado1 , int lado2, int lado3){
    if ((lado1 >= lado2+lado3) || (lado2 >= lado1 +lado3) || (lado3 >= lado1 =lado2))return false;
    return true;
    }
    
    
   atributo - satatic - Triangulo.valor; 
   metodo -  Triangulo.formaTriangulo(--,--)
    
    acessa pelo nome da classe ou objeto + Ponto(.) + 
    
    */   
    
    
    
    
    
    
   
} 
    
    
    
    
    

