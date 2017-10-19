package hello;

/**
 * Created by vsabadosh on 19/10/2017.
 */
public class NewHelloService implements HelloService {

    @Override
    public void sayHello(String name) {
        System.out.println("Hello");
    }
}
