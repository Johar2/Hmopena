public class Hero {

    private int Health;
    private int damage;
    private String superpower;


    public Hero(int Health, int damage, String superpower) {
        this.Health = Health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int Health, int damage) {
        this.Health = Health;
        this.damage = damage;
        this.superpower = null;
    }

    public int getHealth() {
        return Health;
    }

    public int getdamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }



}
