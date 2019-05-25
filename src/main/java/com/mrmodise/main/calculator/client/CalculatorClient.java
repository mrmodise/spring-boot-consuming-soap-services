package com.mrmodise.main.calculator.client;

import calculator.wsdl.Add;
import calculator.wsdl.AddResponse;
import calculator.wsdl.ObjectFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class CalculatorClient extends WebServiceGatewaySupport {

    public AddResponse add(int intA, int intB) {

        JAXBElement<AddResponse> addResponseJAXBElement;

        Add add = new Add();
        add.setIntA(intA);
        add.setIntB(intB);

        addResponseJAXBElement = (JAXBElement<AddResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(new ObjectFactory()
                        .createAdd(add));

        return addResponseJAXBElement.getValue();
    }
}
