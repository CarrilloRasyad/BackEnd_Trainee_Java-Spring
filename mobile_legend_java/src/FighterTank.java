class FighterTank extends Fighter {
    private String spell;
    private String lane;

    public FighterTank(String nama, String emblem, String spell, String lane) {
        super(nama,emblem);
        this.spell = spell;
        this.lane = lane;
    }

    @Override
    public void showStatisticHero() {
        super.showStatisticHero();
        System.out.println("Spell: " + spell);
        System.out.println("Lane: " + lane);
        System.out.println("Durability: " + durability);
        System.out.println("Speed: " + speed);
        System.out.println("Damage: " + damage);
    }
}
