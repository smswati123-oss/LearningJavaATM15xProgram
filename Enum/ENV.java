package Enum;

public enum ENV {
    DEV("http;//dev.myapp.com"),
    QA("http;//staging.myapp.com");

    private String baseURL;
    ENV(String baseURL) {
        this.baseURL = baseURL;
    }
    public String getBaseURL() {
        return baseURL;
    }
}
