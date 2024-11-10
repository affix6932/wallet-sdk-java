package sdk.model;

import java.math.BigDecimal;

public class WithdrawDetailReq {
    private String requestId;

    public WithdrawDetailReq(String requestId) {
        this.requestId = requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getRequestId() {
        return requestId;
    }
}
