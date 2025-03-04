package sdk.model;

import java.math.BigDecimal;

public class ExchangeRateFloatResp {
    private BigDecimal depositPrice;
    private BigDecimal withdrawPrice;
    private int updatedAt;

    public BigDecimal getDepositPrice() {
        return this.depositPrice;
    }

    public BigDecimal getWithdrawPrice() {
        return this.withdrawPrice;
    }

    public void setDepositPrice(BigDecimal price) {
        this.depositPrice = price;
    }

    public void setWithdrawPrice(BigDecimal price) {
        this.withdrawPrice = price;
    }

    public int getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(int updatedAt) {
        this.updatedAt = updatedAt;
    }
}
