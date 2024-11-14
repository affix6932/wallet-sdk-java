package sdk.model;

import java.math.BigDecimal;

public class WithdrawSymbolReq {
    private String requestId;
    private BigDecimal fiatAmount;
    private String symbol;
    private String network;
    private String to;
    private String tag;

    public WithdrawSymbolReq(String requestId, BigDecimal fiatAmount, String symbol, String network, String to, String tag) {
        this.requestId = requestId;
        this.fiatAmount = fiatAmount;
        this.symbol = symbol;
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


    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
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

    public BigDecimal getFiatAmount() {
        return fiatAmount;
    }

    public void setFiatAmount(BigDecimal fiatAmount) {
        this.fiatAmount = fiatAmount;
    }
}
