package test.spring;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import test.spring.xml.RequestDetails;
import test.spring.xml.XMLExtract;

import java.io.IOException;

public class TestXML {

    public static final String content = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><XMLExtract>\n" +
            "  <RequestDetails>\n" +
            "    <RequestStatus>Failure</RequestStatus>\n" +
            "    <RequestErrorNumber>V0006</RequestErrorNumber>\n" +
            "    <RequestErrorDetails>You must supply a From Date and a To Date when no account parameter is supplied</RequestErrorDetails>\n" +
            "  </RequestDetails>\n" +
            "  <XMLEntityDetails>\n" +
            "    <XMLEntityName>your.clients Transactions</XMLEntityName>\n" +
            "    <XMLEntityVersion>V1.5</XMLEntityVersion>\n" +
            "  </XMLEntityDetails>\n" +
            "</XMLExtract>";

    public static void main(String[] args) throws IOException {
        XmlMapper xmlMapper = new XmlMapper();

        RequestDetails value = xmlMapper.readValue(content, RequestDetails.class);
        System.out.println(value);

        XMLExtract testExtract = new XMLExtract();

        RequestDetails details = new RequestDetails();
        testExtract.setDetails(details);
        details.setErrorDetails("1");
        details.setErrorNumber("99");
        details.setStatus("TEST");


        System.out.println(xmlMapper.writeValueAsString(testExtract));
    }
}
