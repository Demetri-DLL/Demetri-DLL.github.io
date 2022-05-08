package game;

import city.cs.engine.*;

public class EnemyBike extends DynamicBody {
    private static final Shape EnemyBikeShape = new BoxShape(2.0f,1f);

    private static final BodyImage image =
            new BodyImage("data/redbike.png", 2.5f);

    public EnemyBike(World w) {
        super(w,EnemyBikeShape);
        addImage(image);
    }
}