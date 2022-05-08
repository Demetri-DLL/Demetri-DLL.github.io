package game;

import city.cs.engine.*;

    public class Mech extends DynamicBody {
        private static final Shape MechShape = new BoxShape(1.3f,1.7f);

        private static final BodyImage image =
                new BodyImage("data/mech.png", 4.0f);

        public Mech(World w) {
            super(w,MechShape);
            addImage(image);
        }
    }

