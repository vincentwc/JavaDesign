package builder.two;

public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("帅气");
    }

    @Override
    public void buildConstume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairStyle() {
        System.out.println("飘逸");
    }
}
