package Oops.methodoverriding;

public class Method_overloading {
    public static void main(String[] args) {
        chromeTC c1 = new chromeTC();
        c1.openBrowser();
         commonToAll c2 = new commonToAll();
        c2.openBrowser();
        //Dynamic dispatch
        commonToAll c3 = new chromeTC();
        c3.openBrowser();
    }
}
class commonToAll{
    void  openBrowser(){
        System.out.println("starting IE Browser");
    }
}
class chromeTC extends commonToAll{
    @Override
    void openBrowser(){
        System.out.println("starting Chrome Browser");
    }
}
