package builder;

import lombok.Data;

/**
 * @author Jackey
 * @date 2020/5/30
 */

@Data
public class Role {

    private String head; //头部
    private String face; //脸部（脸部依赖于头部）
    private String body; //身体
    private Double hp;   //生命值
    private Double sp;   //能量值
    private Double mp;   //魔法值

}
