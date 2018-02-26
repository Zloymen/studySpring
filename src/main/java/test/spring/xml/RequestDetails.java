package test.spring.xml;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *   <RequestDetails>
 <RequestStatus>Failure</RequestStatus>
 <RequestErrorNumber>V0006</RequestErrorNumber>
 <RequestErrorDetails>You must supply a From Date and a To Date when no account parameter is supplied</RequestErrorDetails>
 </RequestDetails>
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class RequestDetails {

    @JsonProperty("RequestStatus")
    @Getter @Setter
    private String status;

    @JsonProperty("RequestErrorNumber")
    @Getter @Setter
    private String errorNumber;

    @JsonProperty("RequestErrorDetails")
    @Getter @Setter
    private String errorDetails;
}
