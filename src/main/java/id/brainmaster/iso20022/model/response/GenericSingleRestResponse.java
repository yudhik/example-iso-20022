package id.brainmaster.iso20022.model.response;

import id.brainmaster.iso20022.model.GroupHeader70;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseDocument", propOrder = {
        "grpHdr", "cdtTrfTxInfSts"
})
@XmlRootElement()
public class GenericSingleRestResponse {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader70 grpHdr;

    @XmlElement(name = "CdtTrfTxInfSts", required = true)
    protected List<CreditTransferTransaction30Status> cdtTrfTxInfSts;

    public GroupHeader70 getGrpHdr() {
        return grpHdr;
    }

    public void setGrpHdr(GroupHeader70 grpHdr) {
        this.grpHdr = grpHdr;
    }

    public List<CreditTransferTransaction30Status> getCdtTrfTxInfSts() {
        if (cdtTrfTxInfSts == null) {
            cdtTrfTxInfSts = new ArrayList<>();
        }
        return cdtTrfTxInfSts;
    }
}
