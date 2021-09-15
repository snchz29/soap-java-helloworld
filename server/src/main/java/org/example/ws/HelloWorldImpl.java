package org.example.ws;


import javax.jws.WebService;

@WebService(endpointInterface = "org.example.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{
    @Override
    public Model say() {
        Model model = new Model();
        model.setInteger(1);
        model.setString("adsf");
        return model;
    }
}
