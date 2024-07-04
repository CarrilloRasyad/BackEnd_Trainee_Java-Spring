class Marksman extends Hero{
    protected int durability = 2000;
    protected int speed = 200;
    protected int damage = 200;

    public Marksman(String nama, String emblem){
        super(nama,emblem);
    }
    public int getDurability(){
        return durability;
    }
    public int getSpeed() {
        return speed;
    }
    public int getDamage(){
        return damage;
    }
    public void setDurability(int durability) {
        this.durability = durability;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void serangan(int damage) {
        this.durability -= damage;
    }

    @Override
    public void showStatisticHero() {
        super.showStatisticHero();
        System.out.println("Durability: " +durability);
        System.out.println("Speed: " +speed);
        System.out.println("Damage: " +damage);
    }
}
