package Overloading;

public class Overloading
{
    int volume(int r) {
        int vol =  r * r * r;
        return vol;
    }
    
    double volume(double h, double r) {
        double vol = (22 / 7.0) * r * r * h;
        return vol;
    }
    
    double volume(double l, double b, double h) {
        double vol = l * b * h;
        return vol;
    }
    
    public static void main(String args[]) {
        Overloading obj = new Overloading();
        System.out.println("Sphere Volume = " + 
            obj.volume(7));
        System.out.println("Cylinder Volume = " + 
            obj.volume(5, 5.6));
        System.out.println("Cuboid Volume = " + 
            obj.volume(8.5, 4.5, 2));
    }
}