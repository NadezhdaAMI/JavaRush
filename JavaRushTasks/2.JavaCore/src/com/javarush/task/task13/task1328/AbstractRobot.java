package com.javarush.task.task13.task1328;

import org.omg.CORBA.TypeCodePackage.BadKind;

public abstract class AbstractRobot implements Attackable, Defensable  {
    private static int hitCount;
    private String name;



    public String getName() {
        return name;
    }

    public void setName(){
        this.name = name;
    }

    public BodyPart attack() {
        BodyPart attackedBodyPart = null;
        hitCount = (int)(Math.random()*3.5 +1);
//        hitCount = hitCount + 1;

        if (hitCount == 1) {
            attackedBodyPart = BodyPart.ARM;
        } else if (hitCount == 2) {
            attackedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 3) {
            hitCount = 0;
            attackedBodyPart = BodyPart.LEG;
        } else attackedBodyPart = BodyPart.CHEST;
        return attackedBodyPart;
    }

    public BodyPart defense() {
        BodyPart defencedBodyPart = null;
//        hitCount = hitCount + 2;
        hitCount = (int)(Math.random()*3.5 +1);

        if (hitCount == 1) {
            defencedBodyPart = BodyPart.HEAD;
        } else if (hitCount == 2) {
            defencedBodyPart = BodyPart.LEG;
        } else if (hitCount == 3) {
            hitCount = 0;
            defencedBodyPart = BodyPart.ARM;
        } else defencedBodyPart = BodyPart.CHEST;
        return defencedBodyPart;
    }


}
