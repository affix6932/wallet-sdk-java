package sdk.webhook;

import java.math.BigDecimal;

public class DepositCallback {
    private String chain;
    private String hash;
    private String address;
    private String coin;
    private BigDecimal amount;
    private String tag;
    private String requestId;

    public String getChain() {
        return chain;
    }
    public void setChain(String chain) {
        this.chain = chain;
    }
    public String getHash() {
        return hash;
    }
    public void setHash(String hash) {
        this.hash = hash;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCoin() {
        return coin;
    }
    public void setCoin(String coin) {
        this.coin = coin;
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
}
