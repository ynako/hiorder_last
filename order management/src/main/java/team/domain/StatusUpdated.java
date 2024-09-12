package team.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import team.domain.*;
import team.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class StatusUpdated extends AbstractEvent {

    private Long orderId;
    private Long menuId;
    private Integer quantity;
    private String orderStatus;
    private Integer tableIdx;
    private Date createdAt;

    public StatusUpdated(Ordermenu aggregate) {
        super(aggregate);
    }

    public StatusUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
