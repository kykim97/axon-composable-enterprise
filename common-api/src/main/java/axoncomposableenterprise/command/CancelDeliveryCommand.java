package axoncomposableenterprise.command;

import java.util.List;
import lombok.Data;
import lombok.ToString;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

@ToString
@Data
public class CancelDeliveryCommand {

    @TargetAggregateIdentifier
    private String orderId;
}
