class Cylinder{
    private int radious;
    private int height;

    public int getRadious() {
        return radious;
    } 

    public void setRadious(int radious) {
        this.radious = radious;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2*Math.PI*radious*radious+2*Math.PI*radious*height;
    }
    public double volume(){
        return Math.PI*radious*radious*height;
    }
}




public class cwh_44_practiceset {
    public static void main(String[] args) {
        Cylinder myCylinder= new Cylinder();
        myCylinder.setHeight(12);
        int h=myCylinder.getHeight();
        System.out.println(h);
        myCylinder.setRadious(9);
        System.out.println(myCylinder.getRadious());
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

    }
}
