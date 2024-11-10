package sdk.webhook;

import java.math.BigDecimal;

public class WithdrawCallback {
    private String chain;
    private String coin;
    private String from;
    private String to;
    private BigDecimal amount;
    private String tag;
    private String requestId;
    private String hash;
    private BigDecimal gas;

    public String getChain() {
        return chain;
    }
    public void setChain(String chain) {
        this.chain = chain;
    }
    public String getCoin() {
        return coin;
    }
    public void setCoin(String coin) {
        this.coin = coin;
    }
    public String getFrom() {
        return from;
    }
    public void setFrom(String from) {
        this.from = from;
    }
    public String getTo() {
        return to;
    }
    public void setTo(String to) {
        this.to = to;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
    public String getTag() {
        return tag;
    }
    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getRequestId() {
        return requestId;
    }
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }
    public BigDecimal getGas() {
        return gas;
    }
    public void setGas(BigDecimal gas) {
        this.gas = gas;
    }
}
