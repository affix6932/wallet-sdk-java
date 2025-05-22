package sdk.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.math.BigDecimal;

public class WithdrawReq {
    private String requestId;
    private BigDecimal amount;
    private String coin;
    private String network;
    private String to;
    private String tag;

    private String extra;

    public static class Extra {
        private String user;
        private BigDecimal fiatAmount;
        private BigDecimal exchangeRate;

        public String getUser() {
            return user;
        }
        public void setUser(String user) {
            this.user = user;
        }
        public BigDecimal getFiatAmount() {
            return fiatAmount;
        }
        public void setFiatAmount(BigDecimal fiatAmount) {
            this.fiatAmount = fiatAmount;
        }
        public BigDecimal getExchangeRate() {
            return exchangeRate;
        }
        public void setExchangeRate(BigDecimal exchangeRate) {
            this.exchangeRate = exchangeRate;
        }
        public Extra(String user, BigDecimal fiatAmount, BigDecimal exchangeRate) {
            this.user = user;
            this.fiatAmount = fiatAmount;
            this.exchangeRate = exchangeRate;
        }
    }

    public WithdrawReq(String requestId, BigDecimal amount, String coin, String network, String to, String tag, Extra extra) {
        this.requestId = requestId;
        this.amount = amount;
        this.coin = coin;
        this.network = network;
        this.to = to;
        this.tag = tag;
        if (extra == null) {
            this.extra = "";
        } else {
            Gson gson = new GsonBuilder()
                    .registerTypeAdapter(BigDecimal.class, new BigDecimalAsStringTypeAdapter())
                    .create();
            this.extra = gson.toJson(extra, Extra.class);
        }
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

    public String getExtra() {
        return extra;
    }

    public void setExtra(String extra) {
        this.extra = extra;
    }
}
