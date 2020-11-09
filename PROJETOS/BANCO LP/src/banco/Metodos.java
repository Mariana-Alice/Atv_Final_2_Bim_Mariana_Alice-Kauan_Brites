/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Kauan
 */
public interface Metodos {
      public void deposito(int conta, double valor);
      public void sacar(int conta, double valor);
      public void transferencia(int con1 , int con2, double valor);
      public String relatorio();
}
