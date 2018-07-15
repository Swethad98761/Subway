package SW;

public class OrderBuilder {
    private Order o;
    OrderBuilder(Order o)
    {
        this.o=o;
    }
    public void build(int i)
    {
        if(i==1)
            o.addItem(new Bread());
        else if(i==2)
            o.addItem(new Sauce());
        else if(i==3)
            o.addItem(new Salad());
        else if(i==4)
            o.addItem(new Addons());
        else
            o.addItem(null);

    }

}
