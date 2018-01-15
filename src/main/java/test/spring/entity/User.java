package test.spring.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 *
 Division = string = xsd:string
 Department = string = xsd:string
 Title = string = xsd:string
 Street = textarea = xsd:string
 City = string = xsd:string
 State = string = xsd:string
 PostalCode = string = xsd:string
 Country = string = xsd:string
 Latitude = double = xsd:double
 Longitude = double = xsd:double
 GeocodeAccuracy = picklist = xsd:string
 Address = address = urn:address
 Email = email = xsd:string
 EmailPreferencesAutoBcc = boolean = xsd:boolean
 EmailPreferencesAutoBccStayInTouch = boolean = xsd:boolean
 EmailPreferencesStayInTouchReminder = boolean = xsd:boolean
 SenderEmail = email = xsd:string
 SenderName = string = xsd:string
 Signature = textarea = xsd:string
 StayInTouchSubject = string = xsd:string
 StayInTouchSignature = textarea = xsd:string
 StayInTouchNote = string = xsd:string
 Phone = phone = xsd:string
 Fax = phone = xsd:string
 MobilePhone = phone = xsd:string
 Alias = string = xsd:string
 CommunityNickname = string = xsd:string
 BadgeText = string = xsd:string
 IsActive = boolean = xsd:boolean
 TimeZoneSidKey = picklist = xsd:string
 UserRoleId = reference = tns:ID
 UserRole
 LocaleSidKey = picklist = xsd:string
 ReceivesInfoEmails = boolean = xsd:boolean
 ReceivesAdminInfoEmails = boolean = xsd:boolean
 EmailEncodingKey = picklist = xsd:string
 ProfileId = reference = tns:ID
 Profile
 UserType = picklist = xsd:string
 LanguageLocaleKey = picklist = xsd:string
 EmployeeNumber = string = xsd:string
 DelegatedApproverId = reference = tns:ID
 Group
 User
 ManagerId = reference = tns:ID
 User
 LastLoginDate = datetime = xsd:dateTime
 LastPasswordChangeDate = datetime = xsd:dateTime
 CreatedDate = datetime = xsd:dateTime
 CreatedById = reference = tns:ID
 User
 LastModifiedDate = datetime = xsd:dateTime
 LastModifiedById = reference = tns:ID
 User
 SystemModstamp = datetime = xsd:dateTime
 OfflineTrialExpirationDate = datetime = xsd:dateTime
 OfflinePdaTrialExpirationDate = datetime = xsd:dateTime
 UserPermissionsMarketingUser = boolean = xsd:boolean
 UserPermissionsOfflineUser = boolean = xsd:boolean
 UserPermissionsCallCenterAutoLogin = boolean = xsd:boolean
 UserPermissionsMobileUser = boolean = xsd:boolean
 UserPermissionsSFContentUser = boolean = xsd:boolean
 UserPermissionsKnowledgeUser = boolean = xsd:boolean
 UserPermissionsInteractionUser = boolean = xsd:boolean
 UserPermissionsSupportUser = boolean = xsd:boolean
 UserPermissionsJigsawProspectingUser = boolean = xsd:boolean
 UserPermissionsSiteforceContributorUser = boolean = xsd:boolean
 UserPermissionsSiteforcePublisherUser = boolean = xsd:boolean
 UserPermissionsWorkDotComUserFeature = boolean = xsd:boolean
 ForecastEnabled = boolean = xsd:boolean
 UserPreferencesActivityRemindersPopup = boolean = xsd:boolean
 UserPreferencesEventRemindersCheckboxDefault = boolean = xsd:boolean
 UserPreferencesTaskRemindersCheckboxDefault = boolean = xsd:boolean
 UserPreferencesReminderSoundOff = boolean = xsd:boolean
 UserPreferencesDisableAllFeedsEmail = boolean = xsd:boolean
 UserPreferencesDisableFollowersEmail = boolean = xsd:boolean
 UserPreferencesDisableProfilePostEmail = boolean = xsd:boolean
 UserPreferencesDisableChangeCommentEmail = boolean = xsd:boolean
 UserPreferencesDisableLaterCommentEmail = boolean = xsd:boolean
 UserPreferencesDisProfPostCommentEmail = boolean = xsd:boolean
 UserPreferencesContentNoEmail = boolean = xsd:boolean
 UserPreferencesContentEmailAsAndWhen = boolean = xsd:boolean
 UserPreferencesApexPagesDeveloperMode = boolean = xsd:boolean
 UserPreferencesHideCSNGetChatterMobileTask = boolean = xsd:boolean
 UserPreferencesDisableMentionsPostEmail = boolean = xsd:boolean
 UserPreferencesDisMentionsCommentEmail = boolean = xsd:boolean
 UserPreferencesHideCSNDesktopTask = boolean = xsd:boolean
 UserPreferencesHideChatterOnboardingSplash = boolean = xsd:boolean
 UserPreferencesHideSecondChatterOnboardingSplash = boolean = xsd:boolean
 UserPreferencesDisCommentAfterLikeEmail = boolean = xsd:boolean
 UserPreferencesDisableLikeEmail = boolean = xsd:boolean
 UserPreferencesSortFeedByComment = boolean = xsd:boolean
 UserPreferencesDisableMessageEmail = boolean = xsd:boolean
 UserPreferencesJigsawListUser = boolean = xsd:boolean
 UserPreferencesDisableBookmarkEmail = boolean = xsd:boolean
 UserPreferencesDisableSharePostEmail = boolean = xsd:boolean
 UserPreferencesEnableAutoSubForFeeds = boolean = xsd:boolean
 UserPreferencesDisableFileShareNotificationsForApi = boolean = xsd:boolean
 UserPreferencesShowTitleToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowManagerToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowEmailToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowWorkPhoneToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowMobilePhoneToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowFaxToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowStreetAddressToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowCityToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowStateToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowPostalCodeToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowCountryToExternalUsers = boolean = xsd:boolean
 UserPreferencesShowProfilePicToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowTitleToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowCityToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowStateToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowPostalCodeToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowCountryToGuestUsers = boolean = xsd:boolean
 UserPreferencesDisableFeedbackEmail = boolean = xsd:boolean
 UserPreferencesDisableWorkEmail = boolean = xsd:boolean
 UserPreferencesHideS1BrowserUI = boolean = xsd:boolean
 UserPreferencesDisableEndorsementEmail = boolean = xsd:boolean
 UserPreferencesPathAssistantCollapsed = boolean = xsd:boolean
 UserPreferencesCacheDiagnostics = boolean = xsd:boolean
 UserPreferencesShowEmailToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowManagerToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowWorkPhoneToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowMobilePhoneToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowFaxToGuestUsers = boolean = xsd:boolean
 UserPreferencesShowStreetAddressToGuestUsers = boolean = xsd:boolean
 UserPreferencesLightningExperiencePreferred = boolean = xsd:boolean
 UserPreferencesPreviewLightning = boolean = xsd:boolean
 UserPreferencesHideEndUserOnboardingAssistantModal = boolean = xsd:boolean
 UserPreferencesHideLightningMigrationModal = boolean = xsd:boolean
 UserPreferencesHideSfxWelcomeMat = boolean = xsd:boolean
 UserPreferencesHideBiggerPhotoCallout = boolean = xsd:boolean
 UserPreferencesGlobalNavBarWTShown = boolean = xsd:boolean
 UserPreferencesGlobalNavGridMenuWTShown = boolean = xsd:boolean
 UserPreferencesCreateLEXAppsWTShown = boolean = xsd:boolean
 UserPreferencesFavoritesWTShown = boolean = xsd:boolean
 ContactId = reference = tns:ID
 Contact
 AccountId = reference = tns:ID
 Account
 CallCenterId = reference = tns:ID
 CallCenter
 Extension = phone = xsd:string
 FederationIdentifier = string = xsd:string
 AboutMe = textarea = xsd:string
 FullPhotoUrl = url = xsd:string
 SmallPhotoUrl = url = xsd:string
 MediumPhotoUrl = url = xsd:string
 DigestFrequency = picklist = xsd:string
 DefaultGroupNotificationFrequency = picklist = xsd:string
 JigsawImportLimitOverride = int = xsd:int
 LastViewedDate = datetime = xsd:dateTime
 LastReferencedDate = datetime = xsd:dateTime
 BannerPhotoUrl = url = xsd:string
 SmallBannerPhotoUrl = url = xsd:string
 MediumBannerPhotoUrl = url = xsd:string
 IsProfilePhotoActive = boolean = xsd:boolean
 * */
@JsonIgnoreProperties(ignoreUnknown=true)
public class User {
    @JsonProperty(value="Id")
    private String id;

    @JsonProperty(value="Username")
    private String username;

    @JsonProperty(value="LastName")
    private String lastName;

    @JsonProperty(value="FirstName")
    private String firstName;

    @JsonProperty(value="Name")
    private String name;

    @JsonProperty(value="CompanyName")
    private String companyName;

    @JsonProperty(value="Division")
    private String division;

    @JsonProperty(value="Department")
    private String department;

    @JsonProperty(value="Title")
    private String title;

    @JsonProperty(value="Street")
    private String street;

    @JsonProperty(value="City")
    private String city;

    @JsonProperty(value="State")
    private String state;

    @JsonProperty(value="PostalCode")
    private String postalCode;

    @JsonProperty(value="Country")
    private String country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id='").append(id).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", lastName='").append(lastName).append('\'');
        sb.append(", firstName='").append(firstName).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", companyName='").append(companyName).append('\'');
        sb.append(", division='").append(division).append('\'');
        sb.append(", department='").append(department).append('\'');
        sb.append(", title='").append(title).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", state='").append(state).append('\'');
        sb.append(", postalCode='").append(postalCode).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
