package jp.ac.uryukyu.ie.e225702;

public class LivingThing{
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public void attack(LivingThing opponent){
        if (this.dead != true) {
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if (hitPoint < 0) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    public boolean isDead(){
        return dead;
    }

    public void setDead(){
        this.dead = dead;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public int getHitPoint(){
        return this.hitPoint;
    }
    public void setHitPoint(){
        this.hitPoint = hitPoint;
    }

    public int getAttack(){
        return this.attack;
    }
    public void setAttck(){
        this.attack = attack;
    }
    
}
