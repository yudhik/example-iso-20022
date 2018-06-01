package id.brainmaster.iso20022.entity;

public enum CreditDebitIndicator {
    CREDIT("CRDT"),DEBIT("DBIT");

    private static final String NO_CREDIT_DEBIT_INDICATOR_FOR_XML_VALUE = "No credit debit indicator for xml value : ";
    private String xmlValue;

    private CreditDebitIndicator(String xmlValue) {
        this.xmlValue = xmlValue;
    }

    @Override
    public String toString() {
        return xmlValue;
    }

    public static CreditDebitIndicator fromString(String xmlValue) {
        for (CreditDebitIndicator creditDebitIndicator : CreditDebitIndicator.values()) {
            if (creditDebitIndicator.toString().equalsIgnoreCase(xmlValue)) {
                return creditDebitIndicator;
            }
        }
        throw new IllegalArgumentException(NO_CREDIT_DEBIT_INDICATOR_FOR_XML_VALUE + xmlValue);
    }
}
