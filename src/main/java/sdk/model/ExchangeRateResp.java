package sdk.model;

import java.math.BigDecimal;

public class ExchangeRateResp {
    private BigDecimal price;
    private int updatedAt;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }
}
