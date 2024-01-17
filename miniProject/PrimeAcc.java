package miniProject;

abstract class PrimeAcc extends ShopAcc {
    private static final boolean isPrime = true;
    private static final float deliveryCharges = 0;

    public PrimeAcc(int accNo, String accNm, float charges) {
        super(accNo, accNm, charges);
    }

    public abstract void bookProduct();

    @Override
    public String toString() {
        return super.toString() + ", isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges;
    }
}
