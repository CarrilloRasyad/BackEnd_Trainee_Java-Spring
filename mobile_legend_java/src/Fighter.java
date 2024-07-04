class Fighter extends Hero {
    protected int durability = 3000;
    protected int speed = 150;
    protected int damage = 100;

    public Fighter(String nama, String emblem) {
        super(nama, emblem);
    }
    public int getDurability() {
        return durability;
    }
}
