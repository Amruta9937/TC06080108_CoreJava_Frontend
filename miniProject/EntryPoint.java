package miniProject;

public class EntryPoint {
    public static void main(String[] args) {
        // Assign instance of GSShopFactory to ShopFactory reference.
        ShopFactory shopFactory = new GSShopFactory();

        // Instantiate GSPrimeAcc and refer it through reference PrimeAcc.
        PrimeAcc primeAcc = shopFactory.getNewPrimeAcc(1, "PrimeUser", 100, true);

        // Instantiate GSNormalAcc and refer it through reference NormalAcc.
        NormalAcc normalAcc = shopFactory.getNewNormalAcc(2, "NormalUser", 50, 10);

        // Invoke bookProduct() method.
        primeAcc.bookProduct();
        normalAcc.bookProduct();

        // Invoke toString() method.
        System.out.println("Prime Account Details: " + primeAcc.toString());
        System.out.println("Normal Account Details: " + normalAcc.toString());
    }
}
