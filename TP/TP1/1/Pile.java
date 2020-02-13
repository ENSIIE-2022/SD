class Pile {

    private Liste L;

    public Pile() {
        L = null;
    }

    public boolean estVide() {
        return (this.L == null);
    }

    public void empiler(int a) {
        this.L = new Liste(a, this.L);
    }

    public void depiler() {
        this.L = this.L.queue();
    }

    public int sommet() {
        return (this.L.tete());
    }
    
}