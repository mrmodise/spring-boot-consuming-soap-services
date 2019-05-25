package com.mrmodise.main.calculator.client;

import calculator.wsdl.*;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import javax.xml.bind.JAXBElement;

public class CalculatorClient extends WebServiceGatewaySupport {

    @SuppressWarnings("unchecked")
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

    @SuppressWarnings("unchecked")
    public SubtractResponse subtract(int intA, int intB) {
        JAXBElement<SubtractResponse> subtractResponseJAXBElement;

        Subtract subtract = new Subtract();
        subtract.setIntA(intA);
        subtract.setIntB(intB);

        subtractResponseJAXBElement = (JAXBElement<SubtractResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(new ObjectFactory()
                        .createSubtract(subtract));

        return subtractResponseJAXBElement.getValue();
    }

    @SuppressWarnings("unchecked")
    public DivideResponse divide(int intA, int intB) {
        JAXBElement<DivideResponse> divideResponseJAXBElement;

        Divide divide = new Divide();
        divide.setIntA(intA);
        divide.setIntB(intB);

        divideResponseJAXBElement = (JAXBElement<DivideResponse>)getWebServiceTemplate()
                .marshalSendAndReceive(new ObjectFactory()
                        .createDivide(divide));

        return divideResponseJAXBElement.getValue();
    }
}
