package axonproduct.event;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductRegisteredEvent {

    private String productId;
    private String productName;
    private Integer stock;
    private String orderId;
}
