package creational.builder;

public class LunchOrderApp {
    public static void main(String[] args){
        LunchOrder.Builder builder = new LunchOrder.Builder();
        LunchOrder lunchOrder = builder.bread("Brown Bread").condiments("Pepper").dressing("Mustard").
                vegetable("Tomato").build();

        System.out.println(lunchOrder.getBread());
        System.out.println(lunchOrder.getDressing());
        System.out.println(lunchOrder.getCondiments());
        System.out.println(lunchOrder.getVegetable());
    }
}
