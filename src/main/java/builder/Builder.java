package builder;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public abstract class Builder {

    Role role = new Role();

    public abstract void buildHead();

    public abstract void buildFace();

    public abstract void buildBody();

    public abstract void buildHp();

    public abstract void buildSp();

    public abstract void buildMp();

    public abstract Role getResult();

}
