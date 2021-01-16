package creational.builder;

 public class LunchOrder {
    public static class Builder{
        private String bread;
        private String dressing;
        private String condiments;
        private String vegetable;

        public Builder(){}

        public Builder bread(String bread){
            this.bread = bread;
            return this;
        }


        public Builder dressing(String dressing){
            this.dressing = dressing;
            return this;
        }


        public Builder condiments(String condiments){
            this.condiments = condiments;
            return this;
        }


        public Builder vegetable(String vegetable){
            this.vegetable = vegetable;
            return this;
        }

        public LunchOrder build(){
            return new LunchOrder(this);
        }

    }

    private final String bread;
    private final String dressing;
    private final String condiments;
    private final String vegetable;

    private LunchOrder(Builder builder){
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.vegetable = builder.vegetable;

    }

    public String getBread() {
        return bread;
    }


    public String getDressing() {
        return dressing;
    }

    public String getCondiments() {
        return condiments;
    }


    public String getVegetable() {
        return vegetable;
    }


}
