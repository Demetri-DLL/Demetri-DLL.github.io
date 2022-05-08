package game;


import city.cs.engine.*;

public class Spike extends DynamicBody {
    private static final Shape SpikeShape = new BoxShape(1.3f,1.7f);

    private static final BodyImage image =
            new BodyImage("data/spike.png", 4.0f);

    public Spike(World w) {
        super(w,SpikeShape);
        addImage(image);
    }
}

