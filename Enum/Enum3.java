package Enum;

public class Enum3 {
    public static void main(String[] args) {
        System.out.println(HEXCODES.RED.getHexcode());
    }
}
    //Store hex code-colours
  enum HEXCODES{
        RED("#FF000"),
        GREEN ("#61FF33"),
        YELLOW ("#4477FF");
        private String hexcode;
        HEXCODES(String hexcode){
            this.hexcode = hexcode;
        }
        String getHexcode(){
            return this.hexcode;
      }
    }

