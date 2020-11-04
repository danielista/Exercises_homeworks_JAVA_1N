package sk.kosickaakademia.daniel.martinek.novyprojekt.school;

public class Grades {   // extends Object
    private int mat;
    private int eng;
    private int pro;

    public Grades(int mat, int eng, int pro) { // parametricky konstruktor
        this.mat = mat;
        this.eng = eng;
        this.pro = pro;
    }

    public int getMat() {
        return mat;
    }

    public int getEng() {
        return eng;
    }

    public int getPro() {
        return pro;
    }

    @Override
    public String toString() {
        return "Grades: MAT: "+mat+"  ENG: "+eng+"  PRO: "+pro;
    }

    public double getAverage(){
        return (double)(mat+eng+pro)/3;   //(mat+eng+pro)/3.0;
    }
}

