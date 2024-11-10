package sdk.model;

import java.math.BigDecimal;

public class WithdrawReq {
    private String requestId;
    private BigDecimal amount;
    private String coin;
    private String network;
    private String to;
    private String tag;

    public WithdrawReq(String requestId, BigDecimal amount, String coin, String network, String to, String tag) {
        this.requestId = requestId;
        this.amount = amount;
        this.coin = coin;
        this.network = network;
        this.to = to;
        this.tag = tag;

    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCoin() {
        return coin;
    }

    public void setCoin(String coin) {
        this.coin = coin;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

}
