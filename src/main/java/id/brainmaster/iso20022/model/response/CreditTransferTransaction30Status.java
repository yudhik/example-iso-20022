package id.brainmaster.iso20022.model.response;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CdtTrfTxInfSts", propOrder = {
        "instrId", "endToEndId", "txId", "clrSysRef", "success", "errorCode", "errorMessage"
})
public class CreditTransferTransaction30Status {
    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "EndToEndId", required = true)
    protected String endToEndId;
    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "ClrSysRef")
    protected String clrSysRef;
    @XmlElement(name = "Success", required = true)
    private boolean success;
    @XmlElement(name = "ErrCd")
    private String errorCode;
    @XmlElement(name = "ErrMsg")
    private String errorMessage;

    public CreditTransferTransaction30Status() {}

    public CreditTransferTransaction30Status(String instrId, String endToEndId, String txId, String clrSysRef, String errorCode, String errorMessage) {
        this.instrId = instrId;
        this.endToEndId = endToEndId;
        this.txId = txId;
        this.clrSysRef = clrSysRef;
        this.success = false;
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public CreditTransferTransaction30Status(String instrId, String endToEndId, String txId, String clrSysRef, boolean success) {
        this.instrId = instrId;
        this.endToEndId = endToEndId;
        this.txId = txId;
        this.clrSysRef = clrSysRef;
        this.success = success;
    }

    public String getInstrId() {
        return instrId;
    }

    public void setInstrId(String instrId) {
        this.instrId = instrId;
    }

    public String getEndToEndId() {
        return endToEndId;
    }

    public void setEndToEndId(String endToEndId) {
        this.endToEndId = endToEndId;
    }

    public String getTxId() {
        return txId;
    }

    public void setTxId(String txId) {
        this.txId = txId;
    }

    public String getClrSysRef() {
        return clrSysRef;
    }

    public void setClrSysRef(String clrSysRef) {
        this.clrSysRef = clrSysRef;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
