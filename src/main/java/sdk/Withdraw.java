package sdk;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import sdk.model.*;

public class Withdraw {
    private final Wallet wallet;

    private final String doWithdraw = "/v1/api/withdraw";
    private final String doWithdrawSymbol = "/v1/api/withdraw_symbol";
    private final String queryWithdrawDetail = "/v1/api/withdraw/query_detail";
    private final String queryExchangeRate = "/v1/api/exchange_rate";

    public Withdraw(Wallet wallet) {
        this.wallet = wallet;
    }

    public Resp<WithdrawResp> DoWithdraw(WithdrawReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, WithdrawReq.class);

        TypeToken<Resp<WithdrawResp>> typeToken = new TypeToken<Resp<WithdrawResp>>() {
        };
        String respBody = this.wallet.Post(doWithdraw, body);
        return gson.fromJson(respBody, typeToken.getType());
    }

    public Resp<WithdrawResp> DoWithdrawSymbol(WithdrawSymbolReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, WithdrawSymbolReq.class);

        TypeToken<Resp<WithdrawResp>> typeToken = new TypeToken<Resp<WithdrawResp>>() {
        };
        String respBody = this.wallet.Post(doWithdrawSymbol, body);
        return gson.fromJson(respBody, typeToken.getType());
    }

    public Resp<WithdrawDetailResp> QueryWithdrawDetail(WithdrawDetailReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, WithdrawDetailReq.class);

        TypeToken<Resp<WithdrawDetailResp>> typeToken = new TypeToken<Resp<WithdrawDetailResp>>() {
        };
        String respBody = this.wallet.Post(queryWithdrawDetail, body);
        return gson.fromJson(respBody, typeToken.getType());
    }

    public Resp<ExchangeRateResp> QueryExchangeRate(ExchangeRateReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, ExchangeRateReq.class);

        TypeToken<Resp<ExchangeRateResp>> typeToken = new TypeToken<Resp<ExchangeRateResp>>() {
        };
        String respBody = this.wallet.Post(queryExchangeRate, body);
        return gson.fromJson(respBody, typeToken.getType());
    }
}
