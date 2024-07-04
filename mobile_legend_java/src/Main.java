public class Main {
    public static void showHeroDetails(Hero hero) {
        System.out.println("\n ---------------------");
        if(hero instanceof Fighter ) {
            System.out.println("Fighter Details");
            ((Fighter)hero).showStatisticHero();
        }else if (hero instanceof Marksman) {
            System.out.println("Marksman Details");
            ((Marksman)hero).showStatisticHero();
        }
    }
    public static void pertarunganHero(Hero a, Hero b) {
        System.out.println("\n Hero yang akan bertarung adalah: "+ a.getNama() + " VS Hero" + b.getNama());
        System.out.println("Durability hero " + a.getNama() + " saat ini sebesar: " + ((Fighter)a).getDurability());
        System.out.println("Durability hero " + a.getNama() + " saat ini sebesar: " + ((Marksman)b).getDurability());
        System.out.println("----------------------");

        while (((Fighter)a).getDurability() >0 && ((Marksman)b).getDurability() > 0) {

        }
    }

//    public static void iniStatic(){}

    public static void main(String[] args) {


        FighterTank silvanna = new FighterTank("Silvanna", "Fighter", "Flicker","Midlane");
        FighterTank chou = new FighterTank("Chou", "Tank", "Flicker","ExpLane");
        FighterTank xborg = new FighterTank("X-Borg", "Fighter", "Flicker","ExpLane");
        FighterTank alpha = new FighterTank("Alpha", "Assassin", "Retribution","Jungler");
        FighterTank paquito = new FighterTank("Paquito", "Fighter", "Execute","ExpLane");

        MarksmanGoldLane claude = new MarksmanGoldLane("Claude", "Assassin","Purify","GoldLane");
        MarksmanHyper granger = new MarksmanHyper("Granger", "Assassin","Retribution","Jungler");
        MarksmanHyper yss = new MarksmanHyper("Yi-Shun-Shin","Assassin","Retribution","Jungler");
        MarksmanHyper bruno = new MarksmanHyper("Bruno","Marksman","Retribution","Jungler");
        MarksmanGold beatrix = new MarksmanGold("Beatrix", "Marksman", "Flicker", "GoldLane");

        Hero hero1 = silvanna;
        Hero hero2 = chou;
        Hero hero3 = xborg;
        Hero hero4 = alpha;
        Hero hero5 = paquito;

        Hero hero6 = claude;
        Hero hero7 = granger;
        Hero hero8 = yss;
        Hero hero9 = bruno;
        Hero hero10 = beatrix;

        hero1.showStatisticHero();
        hero2.showStatisticHero();
        hero3.showStatisticHero();
        hero4.showStatisticHero();
        hero5.showStatisticHero();

        hero6.showStatisticHero();
        hero7.showStatisticHero();
        hero8.showStatisticHero();
        hero9.showStatisticHero();
        hero10.showStatisticHero();

        System.out.println("\n Data Fighter");
        showHeroDetails(hero1);
        showHeroDetails(hero2);
        showHeroDetails(hero3);
        showHeroDetails(hero4);
        showHeroDetails(hero5);

        System.out.println("\n Data Marksman");
        showHeroDetails(hero6);
        showHeroDetails(hero7);
        showHeroDetails(hero8);
        showHeroDetails(hero9);
        showHeroDetails(hero10);

        pertarunganHero(xborg, beatrix);


    }
}