package id.brainmaster.iso20022;


import id.brainmaster.iso20022.model.Document;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import java.io.Reader;
import java.io.StringReader;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static final String TRANSFER_TO_NP_XML = "<?xml version=\"1.0\" encoding=\"UTF-8\" ?><Document xmlns=\"urn:iso:std:iso:20022:tech:xsd:iso20022\"><FIToFICstmrCdtTrf><GrpHdr><MsgId>42E1037861BE4EF9BDF0CE57B4ECB083</MsgId><CreDtTm>2018-01-01T01:00:00.000+07:00</CreDtTm><NbOfTxs>1</NbOfTxs><SttlmInf><SttlmMtd>INDA</SttlmMtd></SttlmInf></GrpHdr><CdtTrfTxInf><PmtId>    <EndToEndId>5AFB29F960474677A6D28C559A2EBFAB</EndToEndId><TxId>FA4A4F894C7943A896F4673B1D9714F5</TxId></PmtId><IntrBkSttlmAmt Ccy=\"IDR\">10000</IntrBkSttlmAmt><ChrgBr>DEBT</ChrgBr><Dbtr><Nm>Hardi</Nm><Id>        <PrvtId><Othr><Id>1234567890123456</Id><SchmeNm><Prtry>NIK</Prtry></SchmeNm></Othr></PrvtId></Id></Dbtr><DbtrAgt><FinInstnId><BICFI>CENAIDJAXXX</BICFI><ClrSysMmbId><MmbId>1234567890</MmbId></ClrSysMmbId></FinInstnId></DbtrAgt><CdtrAgt><FinInstnId><Othr><Id>NUSAPAY</Id>        </Othr></FinInstnId></CdtrAgt><Cdtr><Nm>Hardi</Nm><Id><PrvtId><Othr><Id>1234567890123456</Id><SchmeNm><Prtry>SYSTEM</Prtry></SchmeNm></Othr></PrvtId></Id></Cdtr></CdtTrfTxInf></FIToFICstmrCdtTrf></Document>";
    @Test
    public void testXmlToObject() throws JAXBException {
        System.out.println(UUID.randomUUID().toString().toUpperCase().replace("-",""));
        JAXBContext context = JAXBContext.newInstance(Document.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Reader reader = new StringReader(TRANSFER_TO_NP_XML);
        JAXBElement<Document> model = (JAXBElement)unmarshaller.unmarshal(reader);
        Assert.assertEquals("CENAIDJAXXX", model.getValue().getFIToFICstmrCdtTrf().getCdtTrfTxInf().get(0).getDbtrAgt().getFinInstnId().getBICFI());

        //TODO : just for fun, delete later
        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTime(new Date());
        try {
            DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar).toXMLFormat();
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }
        RandomStringUtils.randomNumeric(5);
    }
}
