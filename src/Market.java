import java.util.*;

public class Market implements QueueBehaviour, MarketBehaviour{
    List <Buyer> actors = new LinkedList<>();
    Queue <Buyer> actorsQueue = new ArrayDeque<>();
    @Override
    public void acceptToMarket(Buyer actor) {
        System.out.println(actor.getName() + "Зфшел в магазин");
        actors.add(actor);

    }

    @Override
    public void releaseFromMarket(Buyer actor) {
        actors.remove(actor);
        System.out.println(actor.getName() + "Покинул магазин");

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Buyer actor) {
        actorsQueue.add(actor);
        System.out.println(actor.getName() + "Встал в очередь");

    }

    @Override
    public void takeOrders() {
        actorsQueue.peek().isTakeOrder();
        System.out.println(actorsQueue.peek().getName() + "забрал заказ");

    }

    @Override
    public void giveOrders() {
        actorsQueue.peek().isMakeOrder();
        System.out.println(actorsQueue.peek().getName() + "сделал заказ");

    }

    @Override
    public void releaseFromQueue() {
        System.out.println(actorsQueue.peek().getName() + "покинул очередь");
        actorsQueue.poll();

    }
}
