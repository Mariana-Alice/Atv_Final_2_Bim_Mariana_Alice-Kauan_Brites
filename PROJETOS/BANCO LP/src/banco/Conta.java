package banco;

public class Conta{
      private double valor;
      private String  tipo;
      //private Clientes cliente;
      public Conta(String titular,int rg, int cpf, String tipo){
            this.tipo = tipo;
            this.valor = 0;
            //this.cliente = new Clientes(cpf,rg,titular);
      }
      public void deposito(double valor){
            this.valor+=valor;
      }
      public void saque(double valor){
            this.valor-=valor;
      }
      public void transferencia(double valor){
            this.valor-=valor;
      }
      @Override
      public String toString(){
            return "Conta de valor em conta: "+this.valor;
      }
}