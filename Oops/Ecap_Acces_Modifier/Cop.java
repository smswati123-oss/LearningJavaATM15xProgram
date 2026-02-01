package Oops.Ecap_Acces_Modifier;

public class Cop {


        private int gun;
        private String icard;
    public void Cop( int bullet){
            this.gun = bullet;

        }
        protected void canIShoot () {
            System.out.println("yes you can");
        }
        void thisDefaultF1 () {
            System.out.println("Hi cop");
        }
    }

