package Oops.OOps_polymorphism;

public class Real_MOverloading {
    public static void main(String[] args) {
        webAutomation t1 = new webAutomation();
        t1.openBrowser();
        t1.openBrowser("firefox");
    }
}
class webAutomation {
    void openBrowser() {
        System.out.println("Default browser");
    }
    void openBrowser(String browser) {
        System.out.println("Starting browser!!");
    }
}
