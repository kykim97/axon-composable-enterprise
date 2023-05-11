package axoncomposableenterprise.policy;

import axoncomposableenterprise.aggregate.*;
import axoncomposableenterprise.command.*;
import axoncomposableenterprise.event.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.DisallowReplay;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.queryhandling.QueryHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@ProcessingGroup("order")
public class PolicyHandler {

    @Autowired
    CommandGateway commandGateway;

    @EventHandler
    //@DisallowReplay
    public void wheneverOrderPlaced_OrderSaga(OrderPlacedEvent orderPlaced) {
        System.out.println(orderPlaced.toString());

        OrderSagaCommand command = new OrderSagaCommand();
        //TODO: mapping attributes (anti-corruption)
        commandGateway.send(command);
    }

    @EventHandler
    //@DisallowReplay
    public void wheneverDeliveryStarted_OrderSaga(
        DeliveryStartedEvent deliveryStarted
    ) {
        System.out.println(deliveryStarted.toString());

        OrderSagaCommand command = new OrderSagaCommand();
        //TODO: mapping attributes (anti-corruption)
        commandGateway.send(command);
    }

    @EventHandler
    //@DisallowReplay
    public void wheneverStockDecreased_OrderSaga(
        StockDecreasedEvent stockDecreased
    ) {
        System.out.println(stockDecreased.toString());

        OrderSagaCommand command = new OrderSagaCommand();
        //TODO: mapping attributes (anti-corruption)
        commandGateway.send(command);
    }

    @EventHandler
    //@DisallowReplay
    public void wheneverOrderCompleted_OrderSaga(
        OrderCompletedEvent orderCompleted
    ) {
        System.out.println(orderCompleted.toString());

        OrderSagaCommand command = new OrderSagaCommand();
        //TODO: mapping attributes (anti-corruption)
        commandGateway.send(command);
    }
}
