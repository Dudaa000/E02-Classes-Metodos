public class Conta{

    Cliente dono;
    double saldo;
    int numero;
    int limite;
    String agencia;

    public Conta (Cliente dono, double saldo, int numero, int limite, String agencia) {
        this.dono = dono;
        this.saldo = saldo;
        this.numero = numero;
        this.limite = limite;
        this.agencia = agencia;
    }

    boolean deposito(double valor) {
        if(valor > 0.0) {
            this.saldo += valor;
            return true;
        } else {
            return false;
        }
    }


    boolean saque(double valor) {
        if(valor > 0.0 && valor <= this.saldo) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }


    boolean transferir(Conta contaDestino, double valor) {
        boolean transfenciaFeita = this.saque(valor);
        if(transfenciaFeita) {
            boolean deposito = contaDestino.deposito(valor);
            return deposito;
        } else {
            return false;
        }
    }


    void Imprimir() {
        System.out.println("Nome do dono da conta: " + this.dono.nome);
        System.out.println("CPF: " + this.dono.CPF);
        System.out.println("Endereço: " + this.dono.endereco);
        System.out.println("Idade: " + this.dono.idade);
        System.out.println("Sexo: " + this.dono.sexo);
        System.out.println("Número da conta: " + this.numero);
        System.out.println("Saldo atual: " + this.saldo);
        System.out.println("Limite: " + this.limite);
    }
}
