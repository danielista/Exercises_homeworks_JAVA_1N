package sk.kosickaakademia.daniel.martinek.novyprojekt.school;

public class Grades {
    private int mat;
    private int eng;
    private int pro;

    public Grades(int mat, int eng, int pro){
        this.mat = mat;
        this.eng = eng;
        this.pro = pro;
    }

    public void getMat(int mat) {
        this.mat = mat;
    }

    public void getEng(int eng) {
        this.eng = eng;
    }

    public void getPro(int pro) {
        this.pro = pro;
    }

    public String toString(){
        return "Grades: MAT"+mat+" ENG: "+eng+" PRO: "+pro;
    }

}
