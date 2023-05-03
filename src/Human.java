public class Human extends Buyer {


    @Override
    public void setMakeOrder() {
        isMakeOrderClass = true;

    }

    @Override
    public void setTakeOrder() {
        isTakeOrderClass = true;

    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrderClass;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrderClass;
    }

    @Override
    String getName() {
        return name;
    }
}
