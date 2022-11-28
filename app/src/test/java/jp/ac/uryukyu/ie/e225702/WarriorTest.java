package jp.ac.uryukyu.ie.e225702;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        Warrior demoWarrior = new Warrior("デモ戦士", 100, 100);
        Enemy slime = new Enemy("スライムもどき", 1000, 1);
        for (int i = 0; i < 3; i++) {
            int  attackWithoutWeponSkill = demoWarrior.getAttack() * 3/2;

            int beforeAttackHitPoint = slime.getHitPoint();
            demoWarrior.attackWithWeponSkill(slime);
            int afterAttackHitPoint = slime.getHitPoint();
            int attackWithWeponSkill = beforeAttackHitPoint - afterAttackHitPoint;
            assertEquals(attackWithoutWeponSkill, attackWithWeponSkill);
        }
    }
}
