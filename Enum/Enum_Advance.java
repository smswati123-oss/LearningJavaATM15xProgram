package Enum;

public class Enum_Advance {
    public static void main(String[] args) {
        double earthGravity = Planet.EARTH.surfaceGravity();
        System.out.println(earthGravity);
    }
    enum Planet{
        EARTH(3.303e23, 2.4397e6);
        private final double mass;
        private final double radious;
        Planet(double mass, double radious) {
            this.mass = mass;
            this.radious = radious;
        }
        public double getMass() {return mass;}
        public double getRadious() {return radious;}
public double surfaceGravity(){
            final double G = 6.67300E-11;
            return G* mass / (radious*radious);
}
    }
}
