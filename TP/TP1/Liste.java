class Liste {
    private int valeur;
    private Liste suivant;

    public Liste(int premier, Liste reste) {
        valeur = premier;
        suivant = reste;
    }

    public int tete() {
        return (this.valeur);
    }

    public Liste queue() { return (this.suivant); }

}