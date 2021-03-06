
/**
 * Write a description of class Voiture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Voiture
{
    // instance variables - replace the example below with your own
    private int x;
    private String couleur;
    private String modele;
    private Conducteur conducteur;

    /**
     * Constructor for objects of class Voiture
     */
    public Voiture()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void setModele(String modele) {
        this.modele = modele;
    }
    
    public String getModele() {
        return this.modele;
    }
    
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    
    public String getCouleur() {
        return this.couleur;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }
    
    public String changeCouleur(String couleur) {
        this.couleur = couleur;
        return this.modele;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Voiture voiture = (Voiture) o;

        if (couleur != null ? !couleur.equals(voiture.couleur) : voiture.couleur != null) return false;
        if (modele != null ? !modele.equals(voiture.modele) : voiture.modele != null) return false;
        return !(conducteur != null ? !conducteur.equals(voiture.conducteur) : voiture.conducteur != null);

    }
}
