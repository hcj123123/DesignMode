package builder;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class SuperRoleBuilder extends Builder {


    @Override
    public void buildHead() {
        role.setBody("suoer head");
    }

    @Override
    public void buildFace() {
        role.setFace("super face");
    }

    @Override
    public void buildBody() {
        role.setBody("super body");
    }

    @Override
    public void buildHp() {
        role.setHp(120d);
    }

    @Override
    public void buildSp() {
        role.setSp(120d);
    }

    @Override
    public void buildMp() {
        role.setMp(120d);
    }

    @Override
    public Role getResult() {
        return role;
    }
}
