package sdk;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import sdk.model.*;

public class Deposit {
    private final Wallet wallet;

    private final String newAddrPath = "/v1/api/deposit/get_new_address";
    private final String queryDepositDetail = "/v1/api/deposit/query_detail";
    private final String queryDepositDetailByTxID = "/v1/api/deposit/query_detail_by_txid";

    public Deposit(Wallet wallet) {
        this.wallet = wallet;
    }

    public Resp<DepositAddressResp> GetNewAddress(DepositAddressReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, DepositAddressReq.class);

        TypeToken<Resp<DepositAddressResp>> typeToken = new TypeToken<Resp<DepositAddressResp>>() {
        };
        String respBody = this.wallet.Post(newAddrPath, body);
        return gson.fromJson(respBody, typeToken.getType());
    }

    public Resp<DepositDetailResp> QueryDepositDetail(DepositDetailReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, DepositDetailReq.class);

        TypeToken<Resp<DepositDetailResp>> typeToken = new TypeToken<Resp<DepositDetailResp>>() {
        };
        String respBody = this.wallet.Post(queryDepositDetail, body);
        return gson.fromJson(respBody, typeToken.getType());
    }

    public Resp<DepositDetailResp> QueryDepositDetailByTxID(DepositDetailByTxIDReq req) throws Exception {
        Gson gson = new Gson();
        String body = gson.toJson(req, req.getClass());

        TypeToken<Resp<DepositDetailResp>> typeToken = new TypeToken<Resp<DepositDetailResp>>() {
        };
        String respBody = this.wallet.Post(queryDepositDetailByTxID, body);
        return gson.fromJson(respBody, typeToken.getType());
    }
}
