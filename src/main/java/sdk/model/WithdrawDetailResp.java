package sdk.model;

import java.math.BigDecimal;

public class WithdrawDetailResp {
    private String requestId;
    private BigDecimal amount;
    private String coin;
    private String network;
    private String to;
    private String from;
    private String tag;
    private int state;
    private BigDecimal gas;
    private String hash;

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
    public int getState() {
        return state;
    }
    public void setState(int state) {
        this.state = state;
    }
    public BigDecimal getGas() {
        return gas;
    }
    public void setGas(BigDecimal gas) {
        this.gas = gas;
    }
    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }

    public void  setFrom(String from) {
        this.from = from;
    }
    public String getFrom() {
        return from;
    }
}
