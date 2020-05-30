package builder;

/**
 * @author Jackey
 * @date 2020/5/30
 */
public class CommonRoleBuilder extends Builder {


    @Override
    public void buildHead() {
        role.setBody("common head");

    }

    @Override
    public void buildFace() {
        role.setFace("common face");

    }

    @Override
    public void buildBody() {
        role.setBody("common body");

    }

    @Override
    public void buildHp() {
        role.setHp(100d);
    }

    @Override
    public void buildSp() {
        role.setSp(100d);
    }

    @Override
    public void buildMp() {
        role.setMp(100d);
    }

    @Override
    public Role getResult() {
        return role;
    }

}
