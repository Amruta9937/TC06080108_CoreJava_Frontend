package miniProject;

class GSPrimeAcc extends PrimeAcc {				//concrete class(instantiated)
    private static final float charges = 100;

    public GSPrimeAcc(int accNo, String accNm) {
        super(accNo, accNm, charges);
    }

    @Override
    public void bookProduct() {
        System.out.println("Booking product for GSPrimeAcc");
    }
}
