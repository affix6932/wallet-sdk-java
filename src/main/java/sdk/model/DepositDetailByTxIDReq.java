package sdk.model;

public class DepositDetailByTxIDReq {
    private String txId;

    public DepositDetailByTxIDReq(String txId) {
        this.txId = txId;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }
}
