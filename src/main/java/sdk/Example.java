package sdk;

import sdk.model.*;

import java.math.BigDecimal;

public class Example {
    public void main(String[] args) throws Exception {
        // todo
        String caPath = "";
        String cliCertPath = "";
        String clientKey = "";
        String publicKeyPath = "";

        Client cli = new Client(cliCertPath, "", clientKey, "", caPath, publicKeyPath);

        // todo
        Wallet w = new Wallet("", "", cli);


        Deposit deposit = new Deposit(w);

        DepositAddressReq depositNewAddrReq = new DepositAddressReq(
                "TON",
                "abcd1"
        );

        Resp<DepositAddressResp> resp = deposit.GetNewAddress(depositNewAddrReq);
        System.out.println(resp.getData());
        System.out.println(resp.getData().getAddress());
        System.out.println(resp.getCode());

        DepositDetailReq depositDetailReq = new DepositDetailReq("185c47ed8476", "TSGDoaWCz8QP", "");
        Resp<DepositDetailResp> resp1 = deposit.QueryDepositDetail(depositDetailReq);
        System.out.println(resp1.getCode());
        if (resp1.getData() != null) {
            System.out.println(resp1.getData().getAddress());
        }


        Withdraw withdraw = new Withdraw(w);

        WithdrawReq withdrawReq = new WithdrawReq("abc9", new BigDecimal("0.001"), "USDT", "TON", "EQAkhkg79yqAqbG6", "23");
        Resp<WithdrawResp> resp2 = withdraw.DoWithdraw(withdrawReq);
        System.out.println(resp2.getCode());
        System.out.println(resp2.getData());

        WithdrawDetailReq withdrawDetailReq = new WithdrawDetailReq("abc8");
        Resp<WithdrawDetailResp> resp3 = withdraw.QueryWithdrawDetail(withdrawDetailReq);
        System.out.println(resp3.getCode());
        System.out.println(resp3.getData().getAmount());
    }
}
