package Enum;

public class REAL_AUTOMATION {
    public static void main(String[] args) {
        System.out.println(Locators.page_input_email.getLocator());
    }

}
 enum Locators{
    page_input_email("//*[@id= \"login-username\"]");
        private String locator;
    Locators(String locator){
        this.locator=locator;
    }
    String getLocator(){
        return this.locator;
    }


        }



