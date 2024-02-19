package steps;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import io.cucumber.java.en.Given;

public class BasicSteps {
    
  @Given("probamos lo básico")
  public void weSendAMessageToTopic(String message, String topic) throws IOException, ExecutionException, InterruptedException {
    System.out.println("Probamos lo básico amigo");
  }


}
