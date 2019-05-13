package builder.two;

abstract class ActorBuilder {

    protected Actor actor = new Actor();

    public abstract void buildType();

    public abstract void buildSex();

    public abstract void buildFace();

    public abstract void buildConstume();

    public abstract void buildHairStyle();

    public Actor cteateActpr() {
        return actor;
    }
}
