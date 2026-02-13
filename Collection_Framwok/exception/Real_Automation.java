package Collection_Framwok.exception;

public class Real_Automation {
    public static void main(String[] args) {
        class APIAutomation{
            private String appName;
            private String urls;

            public String getUrls() {
                return urls;
            }

            public void setUrls(String urls) {
                this.urls = urls;
            }

            public void  setAppName(String appName) {
                this.appName = appName;
                System.out.println("setAppName:"+appName);
            }
        }
    }
}
