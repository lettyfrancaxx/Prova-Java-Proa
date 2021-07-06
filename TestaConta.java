import java.util.*;
public class TestaConta {
public static void main(String[] args) {
Conta conta = new Conta ("Letícia França", 24062602, 2406, 6987.54, "24/06/2016");
Scanner sc = new Scanner (System.in);
System.out.println ("Qual operação deseja realizar?: \n 1 - Sacar. \n 2 - Depositar.  \n 3 - Consultar rendimento.");
int opcao = sc.nextInt ();
switch (opcao) {
case 1:
System.out.println ("Qual é o valor que deseja sacar? ");
double retirada = sc.nextInt (); 
conta.sacar (retirada);
break;

case 2:
System.out.println ("Qual é o valor deseja depositar?" );
double entrada = sc.nextInt ();
conta.deposito (entrada);
break;

case 3:
System.out.println ("O seu dinheiro tem um rendimento de 0.05% por mês.");
System.out.println ("A quantos meses você tem uma poupança?");
int mes = sc.nextInt();
System.out.println ("No próximo mês, o seu saldo, com rendimento da conta, será:");
conta.rendimento (mes);
break;
   
default:
System.out.println ("Opção inválida.");
}
}
}
