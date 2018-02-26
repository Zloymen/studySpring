package test.spring.xml;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.xml.bind.annotation.XmlElementWrapper;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class XMLExtract {
    @JsonProperty("RequestDetails")
    @XmlElementWrapper(name="RequestDetails")
    @Getter @Setter
    private RequestDetails details;
}
