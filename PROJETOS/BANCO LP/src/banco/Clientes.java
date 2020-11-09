/*
 *To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;

/*
 *
 * @author Kauan
 */
public class Clientes {
      private int rg,cpf;
      private String titular;
      public Clientes(int rg, int cpf,String titular){
            this.cpf=cpf;
            this.rg=rg;
            this.titular=titular;
      }
      public String getTitular(){
            return titular;
      }
      public void setTitular(String titular){
            this.titular = titular;
      }
      public int getCpf(){
            return cpf;
      }
      public void setCpf(int cpf){
            this.cpf = cpf;
      }
      public int getRg(){
            return rg;
      }
      public void setRg(int rg){
            this.rg = rg;
      }
      @Override
      public String toString(){
            return "rg: "+rg+" cpf: "+cpf+" Nome:"+titular;
      }
}
