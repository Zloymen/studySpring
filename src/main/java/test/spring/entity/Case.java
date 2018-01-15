package test.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Case {
    @JsonProperty(value="Id")
    private String id;

    @JsonProperty(value="CaseNumber")
    private String caseNumber;

    @JsonProperty(value="ContactId")
    private String contactId;

    @JsonProperty(value="AccountId")
    private String accountId;

    @JsonProperty(value="AssetId")
    private String assetId;

    @JsonProperty(value="ParentId")
    private String parentId;

    @JsonProperty(value="SuppliedName")
    private String suppliedName;

    @JsonProperty(value="SuppliedEmail")
    private String suppliedEmail;

    @JsonProperty(value="SuppliedPhone")
    private String suppliedPhone;

    @JsonProperty(value="SuppliedCompany")
    private String suppliedCompany;

    @JsonProperty(value="Type")
    private String type;

    @JsonProperty(value="Status")
    private String status;

    @JsonProperty(value="Reason")
    private String reason;

    @JsonProperty(value="Origin")
    private String origin;

    @JsonProperty(value="Subject")
    private String subject;

    @JsonProperty(value="Priority")
    private String priority;

    @JsonProperty(value="Description")
    private String description;

    @JsonProperty(value="IsClosed")
    private Boolean isClosed;

    @JsonProperty(value="ClosedDate")
    private String closedDate;

    @JsonProperty(value="IsEscalated")
    private Boolean isEscalated;

    @JsonProperty(value="OwnerId")
    private String ownerId;

    @JsonProperty(value="CreatedDate")
    private String createdDate;

    @JsonProperty(value="CreatedById")
    private String createdById;

    @JsonProperty(value="LastModifiedDate")
    private String lastModifiedDate;

    @JsonProperty(value="LastModifiedById")
    private String lastModifiedById;

    @JsonProperty(value="SystemModstamp")
    private String systemModstamp;

    @JsonProperty(value="ContactPhone")
    private String contactPhone;

    @JsonProperty(value="ContactMobile")
    private String contactMobile;

    @JsonProperty(value="ContactEmail")
    private String contactEmail;

    @JsonProperty(value="ContactFax")
    private String contactFax;

    @JsonProperty(value="LastViewedDate")
    private String lastViewedDate;

    @JsonProperty(value="LastReferencedDate")
    private String lastReferencedDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getCaseNumber() {
        return caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getSuppliedName() {
        return suppliedName;
    }

    public void setSuppliedName(String suppliedName) {
        this.suppliedName = suppliedName;
    }

    public String getSuppliedEmail() {
        return suppliedEmail;
    }

    public void setSuppliedEmail(String suppliedEmail) {
        this.suppliedEmail = suppliedEmail;
    }

    public String getSuppliedPhone() {
        return suppliedPhone;
    }

    public void setSuppliedPhone(String suppliedPhone) {
        this.suppliedPhone = suppliedPhone;
    }

    public String getSuppliedCompany() {
        return suppliedCompany;
    }

    public void setSuppliedCompany(String suppliedCompany) {
        this.suppliedCompany = suppliedCompany;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Boolean getClosed() {
        return isClosed;
    }

    public void setClosed(Boolean closed) {
        isClosed = closed;
    }

    public String getClosedDate() {
        return closedDate;
    }

    public void setClosedDate(String closedDate) {
        this.closedDate = closedDate;
    }

    public Boolean getEscalated() {
        return isEscalated;
    }

    public void setEscalated(Boolean escalated) {
        isEscalated = escalated;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedById() {
        return lastModifiedById;
    }

    public void setLastModifiedById(String lastModifiedById) {
        this.lastModifiedById = lastModifiedById;
    }

    public String getSystemModstamp() {
        return systemModstamp;
    }

    public void setSystemModstamp(String systemModstamp) {
        this.systemModstamp = systemModstamp;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactMobile() {
        return contactMobile;
    }

    public void setContactMobile(String contactMobile) {
        this.contactMobile = contactMobile;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public String getContactFax() {
        return contactFax;
    }

    public void setContactFax(String contactFax) {
        this.contactFax = contactFax;
    }

    public String getLastViewedDate() {
        return lastViewedDate;
    }

    public void setLastViewedDate(String lastViewedDate) {
        this.lastViewedDate = lastViewedDate;
    }

    public String getLastReferencedDate() {
        return lastReferencedDate;
    }

    public void setLastReferencedDate(String lastReferencedDate) {
        this.lastReferencedDate = lastReferencedDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Case{");
        sb.append("id='").append(id).append('\'');
        sb.append(", caseNumber='").append(caseNumber).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", contactId='").append(contactId).append('\'');
        sb.append(", accountId='").append(accountId).append('\'');
        sb.append(", assetId='").append(assetId).append('\'');
        sb.append(", parentId='").append(parentId).append('\'');
        sb.append(", suppliedName='").append(suppliedName).append('\'');
        sb.append(", suppliedEmail='").append(suppliedEmail).append('\'');
        sb.append(", suppliedPhone='").append(suppliedPhone).append('\'');
        sb.append(", suppliedCompany='").append(suppliedCompany).append('\'');
        sb.append(", Type='").append(type).append('\'');
        sb.append(", status='").append(status).append('\'');
        sb.append(", reason='").append(reason).append('\'');
        sb.append(", origin='").append(origin).append('\'');
        sb.append(", Subject='").append(subject).append('\'');
        sb.append(", priority='").append(priority).append('\'');
        sb.append(", description='").append(description).append('\'');
        sb.append(", isClosed=").append(isClosed);
        sb.append(", ClosedDate='").append(closedDate).append('\'');
        sb.append(", isEscalated=").append(isEscalated);
        sb.append(", ownerId='").append(ownerId).append('\'');
        sb.append(", createdDate='").append(createdDate).append('\'');
        sb.append(", createdById='").append(createdById).append('\'');
        sb.append(", lastModifiedDate='").append(lastModifiedDate).append('\'');
        sb.append(", lastModifiedById='").append(lastModifiedById).append('\'');
        sb.append(", systemModstamp='").append(systemModstamp).append('\'');
        sb.append(", contactPhone='").append(contactPhone).append('\'');
        sb.append(", contactMobile='").append(contactMobile).append('\'');
        sb.append(", contactEmail='").append(contactEmail).append('\'');
        sb.append(", contactFax='").append(contactFax).append('\'');
        sb.append(", lastViewedDate='").append(lastViewedDate).append('\'');
        sb.append(", lastReferencedDate='").append(lastReferencedDate).append('\'');
        sb.append('}');
        return sb.toString();
    }
}