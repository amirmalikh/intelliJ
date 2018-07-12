public class Infantry extends Soldier {

    public Infantry (String name, int hitpoints, int attackingPower, int defendingPower, int attackBonus, int defenceBonus, int speed, int range){
        super(name,hitpoints,attackingPower,defendingPower,attackBonus,defenceBonus,speed,range);
        System.out.println("Created infantry unit with name " + name + ".");
        this.hitpoints = hitpoints;
        this.attackingPower = attackingPower;
        this.defendingPower = defendingPower;
        this.attackBonus = attackBonus;
        this.defenceBonus = defenceBonus;
        this.speed = speed;
        this.range = range;

    }


}
