package hildo.costa.btg_api.entity.dto;

import java.math.BigDecimal;

public record OrderItemEvent(String produto,
                             Integer quantidade,
                             BigDecimal preco) {
}
