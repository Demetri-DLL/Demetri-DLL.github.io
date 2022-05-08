package game;

import city.cs.engine.*;

public class MagicCoin extends DynamicBody {
    private static final Shape MagicCoinShape = new BoxShape(2.0f,1f);

    private static final BodyImage image =
            new BodyImage("data/pixelcoin.png", 2.5f);

    public MagicCoin(World w) {
        super(w,MagicCoinShape);
        addImage(image);
    }
}