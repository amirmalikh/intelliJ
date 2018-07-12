import java.util.Random;

public abstract class Soldier {

    String name;
    protected int hitpoints;
    protected int attackingPower;
    protected int defendingPower;
    protected int attackBonus;
    protected int defenceBonus;
    protected int speed;
    protected int range;

   public Soldier (){}

    public Soldier (String name, int hitpoints,
                    int attackingPower, int defendingPower,
                    int attackBonus, int defenceBonus,
                    int speed, int range){
    System.out.println("Soldier with name " + name + " created.");
    this.name = name;
    this.hitpoints = hitpoints;
    this.attackingPower = attackingPower;
    this.defendingPower =defendingPower;
    this.attackBonus = attackBonus;
    this.defenceBonus =defenceBonus;
    this.speed = speed;
    this.range = range;

}

    public void attack(Soldier target) {
        int defenderDamage = Math.max(0, (int)(Math.random() * this.attackingPower * 1.5) - target.defendingPower);

        System.out.print(
                "Attacker " + this.name + " attacks defender " + target.name +
                        " dealing " + defenderDamage + " amount of damage causing defender to "
        );
        target.hitpoints -= defenderDamage;
        if(target.isDead()) {
            System.out.println("die");
        } else {
            if(new Random().nextBoolean()) {
                int attackerDamage = Math.max(0, (int) ((Math.random() * target.attackingPower * 0.5) - this.defendingPower));
                this.hitpoints -= attackerDamage;
                System.out.print("respond with a counter attack dealing " + attackerDamage + " amount of damage causing attacker to ");
                if(this.isDead()) {
                    System.out.println("die");
                } else {
                    System.out.println("take the punch");
                }
            } else {
                System.out.println("buckle");
            }
        }
    }


    public boolean isDead() {
        return hitpoints <= 0;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoints() {
        return hitpoints;
    }

    public void setHitpoints(int hitpoints) {
        this.hitpoints = hitpoints;
    }

    public int getAttackingPower() {
        return attackingPower;
    }

    public void setAttackingPower(int attackingPower) {
        this.attackingPower = attackingPower;
    }

    public int getDefendingPower() {
        return defendingPower;
    }

    public void setDefendingPower(int defendingPower) {
        this.defendingPower = defendingPower;
    }

    public int getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    public int getDefenceBonus() {
        return defenceBonus;
    }

    public void setDefenceBonus(int defenceBonus) {
        this.defenceBonus = defenceBonus;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }


}
