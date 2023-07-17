package view;

import model.service.ServiceRebeldes;

public class App {
    public static void main(String[] args) {
        ServiceRebeldes serviceRebeldes = new ServiceRebeldes();
        serviceRebeldes.consultarRebeldesCadastrados();
        serviceRebeldes.atualizarLocalidade("nigeria", 1);
        serviceRebeldes.consultarRebeldesCadastrados();


    }
}