public class Main {
        public static void main(String[] args) {

            Cliente cliente1 = new Cliente("Mara Maravilha", "333.333.333-33", "Rua Deus e mais, 7", 60, 'F');

            Conta conta1 = new Conta(cliente1, 100000.0, 34343, 5000, "333");

            conta1.Imprimir();


        }

}
