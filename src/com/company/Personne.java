package com.company;

/**
 * Created by DELL on 28/10/2016.
 */
public class Personne {
    private String nom;
    private int age;
    private String nationalite;
    private int nbAmis;
    private Personne[] Amis;
    private int indiceAmi;

    public Personne() {
    }

    public Personne(String nom, int age, String nationalite) {
        this.nom = nom;
        this.age = age;
        this.nationalite = nationalite;
    }

    public Personne(String nom, int age, String nationalite, int nbAmis) {
        this.nom = nom;
        this.age = age;
        this.nationalite = nationalite;
        this.nbAmis = nbAmis;
    }

    public Personne(Personne autre){
        nom = autre.nom;
        age = autre.age;
        nationalite = autre.nationalite;
    }

    public String getNom() {
        return nom;
    }

    public int getAge() {
        return age;
    }

    public String getNationalite() {
        return nationalite;
    }

    public int getNbAmis() {
        return nbAmis;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", age=" + age +" ans"+
                ", nationalite='" + nationalite + '\''+
                '}';
    }

    public Personne[] getAmis() {
        return Amis;
    }

    public void CreerListeAmis(){
        Amis = new Personne[nbAmis];
        indiceAmi = 0;

    }

    public void ajouterAmi(Personne p)  {
        if(indiceAmi<this.Amis.length){
            Amis[indiceAmi] = new Personne(p);
            indiceAmi ++;
        }
    }

    public void MaListeAmis(){
        for (Personne a: this.Amis)
            System.out.println(a);
    }

    public void AmisAlgeriens(){
        for (Personne a: this.Amis){
            if (a.nationalite.equals("algerienne"))
                System.out.println(a);
        }

    }

    public void AmisEtrangers(){
        for (Personne a: this.Amis){
            if (!a.nationalite.equals("algerienne"))
                System.out.println(a);
        }

    }
}
