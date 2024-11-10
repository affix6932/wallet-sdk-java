package sdk.model;

public class DepositAddressReq {
    private String network;
    private String requestId;

    public DepositAddressReq(String network, String requestId) {
        this.network = network;
        this.requestId = requestId;
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
