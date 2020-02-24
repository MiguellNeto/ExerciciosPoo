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
public class Funcionarios {

    //Atributos
    private String nome = "";
    private float salarioDoMes = 0;
    private int filhos = 0;
   
    //Metodos 
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
     * @return the salarioDoMes
     */
    public float getSalarioDoMes() {
        return salarioDoMes;
    }

    /**
     * @param salarioDoMes the salarioDoMes to set
     */
    public void setSalarioDoMes(float salarioDoMes) {
        this.salarioDoMes = salarioDoMes;
    }

    /**
     * @return the filhos
     */
    public int getFilhos() {
        return filhos;
    }

    /**
     * @param filhos the filhos to set
     */
    public void setFilhos(int filhos) {
        this.filhos = filhos;
    }

    public void calculoAumentoSalarial(int aumento)  { //salário base pelo índice de reajuste para saber qual o valor do aumento. Por exemplo: R$ 1.500,00 
        //(salário base) x 9% (reajuste salarial) = R$ 135,00; o salário base + reajuste = R$ 1.635,00.

       salarioDoMes  += (salarioDoMes * aumento) /100;

    }

    public float calculoInss() { // calcular INSS ( 6% para salário <= R$2545,00 e 10% para o restante)

        float inss ;
                
        if (salarioDoMes <= 2545.00){
        inss = (float) (salarioDoMes * 0.6);

        }else {
            inss = (float) (salarioDoMes * 0.10);
            }
        return inss;

    }

    public float calculoImpostoRenda() {//calcular parcela do imposto de renda - IR (usar tabela) 

     float aliquotaPorcento =0;

 if (salarioDoMes <= 1903.98){
     aliquotaPorcento = (float) 0.0;
    }else if (salarioDoMes > 1903.98 && salarioDoMes <= 2826.65){
   aliquotaPorcento = (float) ((salarioDoMes * 7.5) /100);
     }else if (salarioDoMes > 2826.65 && salarioDoMes <= 3751.05){
     aliquotaPorcento = (float) ((salarioDoMes *15.0) /100);
    }else if (salarioDoMes > 3751.05 && salarioDoMes <= 4664.68){
     aliquotaPorcento = (float) ((salarioDoMes * 22.5) /100);
    }else if (salarioDoMes > 4664.68){
     aliquotaPorcento = (float) ((salarioDoMes * 27.5) /100);
      }
      return aliquotaPorcento;

  }
        
    

    public float calculoIRPF() { // calcular o valor mensal do IRPF ( valor da parcela do IR - (R$545,00 por filho)

float irpf =0;
irpf = (float) (calculoImpostoRenda() - (filhos * 545.00));
return irpf;

    }


  

}
