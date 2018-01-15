package test.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Contact {

    @JsonProperty(value="Id")
    private String id;

    @JsonProperty(value="IsDeleted")
    private boolean isDeleted;

    @JsonProperty(value="MasterRecordId")
    private String masterRecordId;

    @JsonProperty(value="AccountId")
    private String accountId;

    @JsonProperty(value="LastName")
    private String lastName;

    @JsonProperty(value="FirstName")
    private String firstName;

    @JsonProperty(value="Salutation")
    private String salutation;

    @JsonProperty(value="Name")
    private String name;

    @JsonProperty(value="OtherStreet")
    private String otherStreet;

    @JsonProperty(value="OtherCity")
    private String otherCity;

    @JsonProperty(value="OtherState")
    private String otherState;

    @JsonProperty(value="OtherPostalCode")
    private String otherPostalCode;

    @JsonProperty(value="OtherCountry")
    private String otherCountry;

    @JsonProperty(value="OtherGeocodeAccuracy")
    private String otherGeocodeAccuracy;

    @JsonProperty(value="OtherAddress")
    private String otherAddress;

    @JsonProperty(value="MailingStreet")
    private String mailingStreet;

/*           MailingCity = string = xsd:string
            MailingState = string = xsd:string
            MailingPostalCode = string = xsd:string
            MailingCountry = string = xsd:string
            MailingGeocodeAccuracy = picklist = xsd:string
            MailingAddress = address = urn:address
            Phone = phone = xsd:string
            Fax = phone = xsd:string
            MobilePhone = phone = xsd:string
            HomePhone = phone = xsd:string
            OtherPhone = phone = xsd:string
            AssistantPhone = phone = xsd:string
            ReportsToId = reference = tns:ID
            Contact
    Email = email = xsd:string
            Title = string = xsd:string
            Department = string = xsd:string
            AssistantName = string = xsd:string
            LeadSource = picklist = xsd:string

            Birthdate = date = xsd:date
            Description = textarea = xsd:string

    OwnerId = reference = tns:ID
            User
    CreatedDate = datetime = xsd:dateTime
            CreatedById = reference = tns:ID
            User
    LastModifiedDate = datetime = xsd:dateTime
            LastModifiedById = reference = tns:ID
            User
    SystemModstamp = datetime = xsd:dateTime
            LastActivityDate = date = xsd:date
            LastCURequestDate = datetime = xsd:dateTime
            LastCUUpdateDate = datetime = xsd:dateTime
            LastViewedDate = datetime = xsd:dateTime
            LastReferencedDate = datetime = xsd:dateTime
            EmailBouncedReason = string = xsd:string
            EmailBouncedDate = datetime = xsd:dateTime
    IsEmailBounced = boolean = xsd:boolean
            PhotoUrl = url = xsd:string
            Jigsaw = string = xsd:string
            JigsawContactId = string = xsd:string
            CleanStatus = picklist = xsd:string
            Level__c = picklist = xsd:string
            Languages__c = string = xsd:string*/

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("id='").append(id).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
