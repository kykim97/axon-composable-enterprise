package axondelivery.query;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.hateoas.server.core.Relation;

@Entity
@Table(name = "Delivery_table")
@Data
@Relation(collectionRelation = "deliveries")
public class DeliveryReadModel {

    @Id
    private String orderId;

    private String productName;

    private String productId;

    private String status;

    private Integer qty;

    private String userId;
}
