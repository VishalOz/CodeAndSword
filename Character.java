public class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int defensePower;
    protected int level;

    public Character (String name, int health, int attackPower, int defensePower, int level) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defensePower = defensePower;
        this.level = level;
    }
    public abstract void attack(Character target);

    public void takeDamage(int damage) {
        int reducedDamage  = health - defensePower;
        if (reducedDamage < 0 )reducedDamage = 0;
        health -= reducedDamage;
        System.out.println(name + "took " + reducedDamage + " damage. Remaining HP: "+health);
    }
    public boolean isAlive() {
        return health > 0;
    }

    public String getName() {
        return name;
    }
    public int getHealth() {
        return health;
    }
}
