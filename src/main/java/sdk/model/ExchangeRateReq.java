package sdk.model;

public class ExchangeRateReq {
    private String symbol;

    public ExchangeRateReq(String s) {
        this.symbol = s;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
