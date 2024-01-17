package miniProject;

abstract class NormalAcc extends ShopAcc {
    private float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    public float getDeliveryCharges() {
        return deliveryCharges;
    }

    public abstract void bookProduct();

    @Override
    public String toString() {
        return super.toString() + ", deliveryCharges=" + deliveryCharges;
    }
}

