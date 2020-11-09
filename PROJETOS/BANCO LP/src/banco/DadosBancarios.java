/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package banco;
import java.util.ArrayList;
/**
 *
 * @author Kauan
 */
public class DadosBancarios {
      private ArrayList<Conta> dados;
      public DadosBancarios(){
            dados = new ArrayList<>();
      }
      public void criar(String nome, int cpf, int rg,String tipo){
            Conta conta = new Conta(nome,cpf,rg,tipo);
            dados.add(conta);
      }
      public void deposito(int account,double valor){
            dados.get(account).deposito(valor);
      }
      public void saque(int account,double valor){
            dados.get(account).saque(valor);
      }
      
      public void transferir(int account1, int account2,double valor){
            dados.get(account1).transferencia(valor);
            dados.get(account2).deposito(valor);
      }
      public String Relatorio(){
        String texto = "\nContas:";
        for(int i=0; i<dados.size(); i++){
            texto = texto + "\nConta ("+i+"):\n" + dados.get(i).toString() + "\n";
        }
        return texto;   
      }
}
