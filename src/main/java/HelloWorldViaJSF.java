public class HelloWorldViaJSF {
    private String msg;

    public String sayHello() {
        if (msg != null) {
            return "HelloWorld " + msg + "! via JSF";
        }
        return "HelloWorld! via JSF";
    }

    public void loadMsg(String msg) {
        this.msg = msg;
    }
}
