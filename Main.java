public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer("Grace");

        SavingsAccount savings = new SavingsAccount("SA001", 100000, 5);
        CurrentAccount current = new CurrentAccount("CA001", 50000, 30000);

        savings.deposit(20000);
        savings.withdraw(50000);
        savings.addInterest();

        current.withdraw(60000);

        customer.addAccount(savings);
        customer.addAccount(current);

        System.out.println(savings.generateStatement());
        System.out.println();

        System.out.println(current.generateStatement());
        System.out.println();

        System.out.println("Customer Total Worth: " + customer.totalWorth());
    }
}
