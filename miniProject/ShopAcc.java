package miniProject;

abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public int getAccNo() {
        return accNo;
    }

    public String getAccNm() {
        return accNm;
    }

    public float getCharges() {
        return charges;
    }

    public abstract void bookProduct();

    @Override
    public String toString() {
        return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
    }
}
