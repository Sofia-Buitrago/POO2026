public class TestBankAccount {

    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456", "Sofia Buitrago");

        System.out.println("Cuenta: " + account.getAccountNumber()
                + " | Titular: " + account.getAccountHolder()
                + " | Saldo: " + account.getBalance());

        boolean d1 = account.deposit(500.0);
        System.out.println("Depositar 500.0 -> " + (d1 ? "Aceptado" : "Rechazado"));

        boolean d2 = account.deposit(-100.0);
        System.out.println("Depositar -100.0 -> " + (d2 ? "Aceptado" : "Rechazado"));

        boolean w1 = account.withdraw(200.0);
        System.out.println("Retirar 200.0 -> " + (w1 ? "Aceptado" : "Rechazado"));

        boolean w2 = account.withdraw(10000.0);
        System.out.println("Retirar 10000.0 -> " + (w2 ? "Aceptado" : "Rechazado"));

        boolean w3 = account.withdraw(-50.0);
        System.out.println("Retirar -50.0 -> " + (w3 ? "Aceptado" : "Rechazado"));

        System.out.println("Saldo final: " + account.getBalance());
    }
}