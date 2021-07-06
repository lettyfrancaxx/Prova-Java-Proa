import java.util.*;

public class Conta {
String nome;
int conta;
int agencia;
double saldo;
String dataDeAbertura;

public Conta (String nome, int conta, int agencia, double saldo, String dataDeAbertura) {
this.nome = nome;
this.conta = conta;
this.agencia = agencia;
this.saldo = saldo;
this.dataDeAbertura = dataDeAbertura;
}

public double sacar (double retirada) {
this.saldo = this.saldo - retirada;
return this.saldo;
}

public double deposito (double entrada) {
this.saldo = this.saldo + entrada;
return this.saldo;
}

public double rendimento (int mes) {
this.saldo = mes * 0.05 + this.saldo;
return this.saldo;
}
}
