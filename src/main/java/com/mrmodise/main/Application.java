package com.mrmodise.main;

import calculator.wsdl.AddResponse;
import com.mrmodise.main.calculator.client.CalculatorClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner lookup(CalculatorClient calculatorClient) {
        return args -> {

            int intA = 12;
            int intB = 12;

            if (args.length > 0) {
                intA = Integer.parseInt(args[0]);
                intB = Integer.parseInt(args[1]);
            }

            AddResponse addResponse = calculatorClient.add(intA, intB);
            System.err.println("Adding " + intA + " & " + intB + " , result: " + addResponse.getValue());
        };
    }
}
