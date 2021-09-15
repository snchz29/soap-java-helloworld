import org.example.soap.ws.client.HelloWorldImplService;
import org.example.soap.ws.client.Model;

public class Client {
    public static void main(String[] args) {
        HelloWorldImplService hw = new HelloWorldImplService();
        Model model = hw.getHelloWorldImplPort().say();
        System.out.println(model.getInteger() + " " + model.getString());
    }
}
