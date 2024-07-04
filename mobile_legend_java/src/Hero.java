class Hero {
    protected String nama;
    protected String emblem;

    public Hero(String nama,String emblem ) {
        this.nama = nama;
        this.emblem = emblem;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getEmblem() {
        return emblem;
    }
    public void setEmblem(String emblem) {
        this.emblem = emblem;
    }
    public void showStatisticHero() {
        System.out.println("Nama: " + nama);
        System.out.println("Emblem: " + emblem);
    }
}


