class MarksmanHyper extends Marksman {
    private String spell;
    private String lane;

    public MarksmanHyper(String nama, String emblem, String spell, String lane) {
        super(nama, emblem);
        this.spell = spell;
        this.lane = lane;
    }
    public void showStatisticHero() {
        super.showStatisticHero();
        System.out.println("Spell: " + spell);
        System.out.println("Lane: " + lane);
        System.out.println("Durability: " + durability);
        System.out.println("Speed: " + speed);
        System.out.println("Damage: " + damage);
    }
}
