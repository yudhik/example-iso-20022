package id.brainmaster.iso20022.util;

import id.brainmaster.iso20022.entity.CreditDebitIndicator;
import id.brainmaster.iso20022.entity.Transaction;
import id.brainmaster.iso20022.entity.TransactionCode;
import id.brainmaster.iso20022.entity.TransactionKey;
import id.brainmaster.iso20022.model.FIToFICustomerCreditTransferV07;

import java.util.HashSet;
import java.util.Set;

public class Iso20022TransactionHelper {

    public static Set<Transaction> populateTransaction(final FIToFICustomerCreditTransferV07 model, final String accountId,
            final CreditDebitIndicator creditDebitIndicator, final TransactionCode transactionCode, final String reference) {
        Set<Transaction> transactions = new HashSet<>(model.getCdtTrfTxInf().size());
        for (int i = 0; i < model.getCdtTrfTxInf().size(); i++) {
            String sourceId = model.getCdtTrfTxInf().get(i).getDbtrAcct().getId().getOthr().getId();
            String sourceName = model.getCdtTrfTxInf().get(i).getDbtrAgt().getFinInstnId().getBICFI() == null ?
                    model.getCdtTrfTxInf().get(i).getDbtrAgt().getFinInstnId().getOthr().getId() : model.getCdtTrfTxInf().get(
                    i).getDbtrAgt().getFinInstnId().getBICFI();
            String endToEndId = model.getCdtTrfTxInf().get(i).getPmtId().getEndToEndId();
            String destinationId = model.getCdtTrfTxInf().get(i).getCdtrAcct().getId().getOthr().getId();
            String destinationName = model.getCdtTrfTxInf().get(i).getCdtrAgt().getFinInstnId().getBICFI() == null ?
                    model.getCdtTrfTxInf().get(i).getCdtrAgt().getFinInstnId().getOthr().getId() : model.getCdtTrfTxInf().get(
                    i).getCdtrAgt().getFinInstnId().getBICFI();
            TransactionKey key = new TransactionKey(model.getCdtTrfTxInf().get(i).getPmtId().getTxId(), accountId,
                    model.getGrpHdr().getCreDtTm().toGregorianCalendar().getTime());
            transactions.add(new Transaction(key,
                    model.getCdtTrfTxInf().get(i).getIntrBkSttlmAmt().getValue(), creditDebitIndicator, transactionCode, sourceName, sourceId,
                    destinationName, destinationId, reference, endToEndId));
        }
        return transactions;
    }

}
