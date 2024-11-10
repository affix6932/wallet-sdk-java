package sdk.model;

public class DepositDetailReq {
    private String requestId;
    private String address;
    private String tag;

    public DepositDetailReq(String requestId, String address, String tag) {
        this.requestId = requestId;
        this.address = address;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
}
