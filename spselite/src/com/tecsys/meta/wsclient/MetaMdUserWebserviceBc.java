/**
 * MetaMdUserWebserviceBc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public class MetaMdUserWebserviceBc  implements java.io.Serializable {
    public java.lang.String[] errors;

    public java.lang.String userName;

    public java.lang.String fullName;

    public java.lang.String firstName;

    public java.lang.String middleName;

    public java.lang.String lastName;

    public java.lang.String honor;

    public java.lang.String emailAddress;

    public java.lang.String phoneNumber;

    public java.lang.String mobilePhoneNumber;

    public java.lang.String isActive;

    public java.lang.String isInternal;

    public java.lang.String promptForSessionParametersAtLogin;

    public java.lang.String userType;

    public java.lang.String isSsoEnabled;

    public java.lang.String umsAuthenticationMethod;

    public java.lang.String ldapUserName;

    public java.lang.String ldapInstanceName;

    public java.lang.String password;

    public java.lang.String passwordHint;

    public java.lang.String umsMaximumLoginAttempts;

    public java.lang.String userLoginAttempts;

    public java.lang.String company;

    public java.lang.String department;

    public java.lang.String jobTitle;

    public java.lang.String supervisor;

    public java.lang.String supervisorPhone;

    public java.lang.String locale;

    public java.lang.String theme;

    public java.lang.String homeResourceName;

    public java.lang.String mobileHomeResourceName;

    public java.lang.String portalResourceFilter;

    public java.lang.String portalMinimumNumberOfResourcesPerColumn;

    public java.lang.String startingInterval;

    public java.lang.String portalLaunchInSeparateWindow;

    public java.lang.String automaticallyDiscardChanges;

    public java.lang.String automaticallyFormatPhoneNumbers;

    public java.lang.String proceedWithWarnings;

    public java.lang.String validateAtTheFieldLevel;

    public java.lang.String validateForeignKeys;

    public java.lang.String confirmReportCriteria;

    public java.lang.String searchResultsRecordsPerPage;

    public java.lang.String maximumSearchResultsRecordsToDisplay;

    public java.lang.String startingPage;

    public java.lang.String startingActionOnArrays;

    public java.lang.String formLabelFormat;

    public MetaMdUserWebserviceBc() {
    }

    public MetaMdUserWebserviceBc(
           java.lang.String[] errors,
           java.lang.String userName,
           java.lang.String fullName,
           java.lang.String firstName,
           java.lang.String middleName,
           java.lang.String lastName,
           java.lang.String honor,
           java.lang.String emailAddress,
           java.lang.String phoneNumber,
           java.lang.String mobilePhoneNumber,
           java.lang.String isActive,
           java.lang.String isInternal,
           java.lang.String promptForSessionParametersAtLogin,
           java.lang.String userType,
           java.lang.String isSsoEnabled,
           java.lang.String umsAuthenticationMethod,
           java.lang.String ldapUserName,
           java.lang.String ldapInstanceName,
           java.lang.String password,
           java.lang.String passwordHint,
           java.lang.String umsMaximumLoginAttempts,
           java.lang.String userLoginAttempts,
           java.lang.String company,
           java.lang.String department,
           java.lang.String jobTitle,
           java.lang.String supervisor,
           java.lang.String supervisorPhone,
           java.lang.String locale,
           java.lang.String theme,
           java.lang.String homeResourceName,
           java.lang.String mobileHomeResourceName,
           java.lang.String portalResourceFilter,
           java.lang.String portalMinimumNumberOfResourcesPerColumn,
           java.lang.String startingInterval,
           java.lang.String portalLaunchInSeparateWindow,
           java.lang.String automaticallyDiscardChanges,
           java.lang.String automaticallyFormatPhoneNumbers,
           java.lang.String proceedWithWarnings,
           java.lang.String validateAtTheFieldLevel,
           java.lang.String validateForeignKeys,
           java.lang.String confirmReportCriteria,
           java.lang.String searchResultsRecordsPerPage,
           java.lang.String maximumSearchResultsRecordsToDisplay,
           java.lang.String startingPage,
           java.lang.String startingActionOnArrays,
           java.lang.String formLabelFormat) {
           this.errors = errors;
           this.userName = userName;
           this.fullName = fullName;
           this.firstName = firstName;
           this.middleName = middleName;
           this.lastName = lastName;
           this.honor = honor;
           this.emailAddress = emailAddress;
           this.phoneNumber = phoneNumber;
           this.mobilePhoneNumber = mobilePhoneNumber;
           this.isActive = isActive;
           this.isInternal = isInternal;
           this.promptForSessionParametersAtLogin = promptForSessionParametersAtLogin;
           this.userType = userType;
           this.isSsoEnabled = isSsoEnabled;
           this.umsAuthenticationMethod = umsAuthenticationMethod;
           this.ldapUserName = ldapUserName;
           this.ldapInstanceName = ldapInstanceName;
           this.password = password;
           this.passwordHint = passwordHint;
           this.umsMaximumLoginAttempts = umsMaximumLoginAttempts;
           this.userLoginAttempts = userLoginAttempts;
           this.company = company;
           this.department = department;
           this.jobTitle = jobTitle;
           this.supervisor = supervisor;
           this.supervisorPhone = supervisorPhone;
           this.locale = locale;
           this.theme = theme;
           this.homeResourceName = homeResourceName;
           this.mobileHomeResourceName = mobileHomeResourceName;
           this.portalResourceFilter = portalResourceFilter;
           this.portalMinimumNumberOfResourcesPerColumn = portalMinimumNumberOfResourcesPerColumn;
           this.startingInterval = startingInterval;
           this.portalLaunchInSeparateWindow = portalLaunchInSeparateWindow;
           this.automaticallyDiscardChanges = automaticallyDiscardChanges;
           this.automaticallyFormatPhoneNumbers = automaticallyFormatPhoneNumbers;
           this.proceedWithWarnings = proceedWithWarnings;
           this.validateAtTheFieldLevel = validateAtTheFieldLevel;
           this.validateForeignKeys = validateForeignKeys;
           this.confirmReportCriteria = confirmReportCriteria;
           this.searchResultsRecordsPerPage = searchResultsRecordsPerPage;
           this.maximumSearchResultsRecordsToDisplay = maximumSearchResultsRecordsToDisplay;
           this.startingPage = startingPage;
           this.startingActionOnArrays = startingActionOnArrays;
           this.formLabelFormat = formLabelFormat;
    }


    /**
     * Gets the errors value for this MetaMdUserWebserviceBc.
     * 
     * @return errors
     */
    public java.lang.String[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this MetaMdUserWebserviceBc.
     * 
     * @param errors
     */
    public void setErrors(java.lang.String[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the userName value for this MetaMdUserWebserviceBc.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName.toLowerCase();
    }


    /**
     * Sets the userName value for this MetaMdUserWebserviceBc.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName.toLowerCase();
    }


    /**
     * Gets the fullName value for this MetaMdUserWebserviceBc.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this MetaMdUserWebserviceBc.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the firstName value for this MetaMdUserWebserviceBc.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this MetaMdUserWebserviceBc.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the middleName value for this MetaMdUserWebserviceBc.
     * 
     * @return middleName
     */
    public java.lang.String getMiddleName() {
        return middleName;
    }


    /**
     * Sets the middleName value for this MetaMdUserWebserviceBc.
     * 
     * @param middleName
     */
    public void setMiddleName(java.lang.String middleName) {
        this.middleName = middleName;
    }


    /**
     * Gets the lastName value for this MetaMdUserWebserviceBc.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this MetaMdUserWebserviceBc.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the honor value for this MetaMdUserWebserviceBc.
     * 
     * @return honor
     */
    public java.lang.String getHonor() {
        return honor;
    }


    /**
     * Sets the honor value for this MetaMdUserWebserviceBc.
     * 
     * @param honor
     */
    public void setHonor(java.lang.String honor) {
        this.honor = honor;
    }


    /**
     * Gets the emailAddress value for this MetaMdUserWebserviceBc.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this MetaMdUserWebserviceBc.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the phoneNumber value for this MetaMdUserWebserviceBc.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this MetaMdUserWebserviceBc.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the mobilePhoneNumber value for this MetaMdUserWebserviceBc.
     * 
     * @return mobilePhoneNumber
     */
    public java.lang.String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }


    /**
     * Sets the mobilePhoneNumber value for this MetaMdUserWebserviceBc.
     * 
     * @param mobilePhoneNumber
     */
    public void setMobilePhoneNumber(java.lang.String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }


    /**
     * Gets the isActive value for this MetaMdUserWebserviceBc.
     * 
     * @return isActive
     */
    public java.lang.String getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this MetaMdUserWebserviceBc.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.String isActive) {
        this.isActive = isActive;
    }


    /**
     * Gets the isInternal value for this MetaMdUserWebserviceBc.
     * 
     * @return isInternal
     */
    public java.lang.String getIsInternal() {
        return isInternal;
    }


    /**
     * Sets the isInternal value for this MetaMdUserWebserviceBc.
     * 
     * @param isInternal
     */
    public void setIsInternal(java.lang.String isInternal) {
        this.isInternal = isInternal;
    }


    /**
     * Gets the promptForSessionParametersAtLogin value for this MetaMdUserWebserviceBc.
     * 
     * @return promptForSessionParametersAtLogin
     */
    public java.lang.String getPromptForSessionParametersAtLogin() {
        return promptForSessionParametersAtLogin;
    }


    /**
     * Sets the promptForSessionParametersAtLogin value for this MetaMdUserWebserviceBc.
     * 
     * @param promptForSessionParametersAtLogin
     */
    public void setPromptForSessionParametersAtLogin(java.lang.String promptForSessionParametersAtLogin) {
        this.promptForSessionParametersAtLogin = promptForSessionParametersAtLogin;
    }


    /**
     * Gets the userType value for this MetaMdUserWebserviceBc.
     * 
     * @return userType
     */
    public java.lang.String getUserType() {
        return userType;
    }


    /**
     * Sets the userType value for this MetaMdUserWebserviceBc.
     * 
     * @param userType
     */
    public void setUserType(java.lang.String userType) {
        this.userType = userType;
    }


    /**
     * Gets the isSsoEnabled value for this MetaMdUserWebserviceBc.
     * 
     * @return isSsoEnabled
     */
    public java.lang.String getIsSsoEnabled() {
        return isSsoEnabled;
    }


    /**
     * Sets the isSsoEnabled value for this MetaMdUserWebserviceBc.
     * 
     * @param isSsoEnabled
     */
    public void setIsSsoEnabled(java.lang.String isSsoEnabled) {
        this.isSsoEnabled = isSsoEnabled;
    }


    /**
     * Gets the umsAuthenticationMethod value for this MetaMdUserWebserviceBc.
     * 
     * @return umsAuthenticationMethod
     */
    public java.lang.String getUmsAuthenticationMethod() {
        return umsAuthenticationMethod;
    }


    /**
     * Sets the umsAuthenticationMethod value for this MetaMdUserWebserviceBc.
     * 
     * @param umsAuthenticationMethod
     */
    public void setUmsAuthenticationMethod(java.lang.String umsAuthenticationMethod) {
        this.umsAuthenticationMethod = umsAuthenticationMethod;
    }


    /**
     * Gets the ldapUserName value for this MetaMdUserWebserviceBc.
     * 
     * @return ldapUserName
     */
    public java.lang.String getLdapUserName() {
        return ldapUserName;
    }


    /**
     * Sets the ldapUserName value for this MetaMdUserWebserviceBc.
     * 
     * @param ldapUserName
     */
    public void setLdapUserName(java.lang.String ldapUserName) {
        this.ldapUserName = ldapUserName;
    }


    /**
     * Gets the ldapInstanceName value for this MetaMdUserWebserviceBc.
     * 
     * @return ldapInstanceName
     */
    public java.lang.String getLdapInstanceName() {
        return ldapInstanceName;
    }


    /**
     * Sets the ldapInstanceName value for this MetaMdUserWebserviceBc.
     * 
     * @param ldapInstanceName
     */
    public void setLdapInstanceName(java.lang.String ldapInstanceName) {
        this.ldapInstanceName = ldapInstanceName;
    }


    /**
     * Gets the password value for this MetaMdUserWebserviceBc.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this MetaMdUserWebserviceBc.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }


    /**
     * Gets the passwordHint value for this MetaMdUserWebserviceBc.
     * 
     * @return passwordHint
     */
    public java.lang.String getPasswordHint() {
        return passwordHint;
    }


    /**
     * Sets the passwordHint value for this MetaMdUserWebserviceBc.
     * 
     * @param passwordHint
     */
    public void setPasswordHint(java.lang.String passwordHint) {
        this.passwordHint = passwordHint;
    }


    /**
     * Gets the umsMaximumLoginAttempts value for this MetaMdUserWebserviceBc.
     * 
     * @return umsMaximumLoginAttempts
     */
    public java.lang.String getUmsMaximumLoginAttempts() {
        return umsMaximumLoginAttempts;
    }


    /**
     * Sets the umsMaximumLoginAttempts value for this MetaMdUserWebserviceBc.
     * 
     * @param umsMaximumLoginAttempts
     */
    public void setUmsMaximumLoginAttempts(java.lang.String umsMaximumLoginAttempts) {
        this.umsMaximumLoginAttempts = umsMaximumLoginAttempts;
    }


    /**
     * Gets the userLoginAttempts value for this MetaMdUserWebserviceBc.
     * 
     * @return userLoginAttempts
     */
    public java.lang.String getUserLoginAttempts() {
        return userLoginAttempts;
    }


    /**
     * Sets the userLoginAttempts value for this MetaMdUserWebserviceBc.
     * 
     * @param userLoginAttempts
     */
    public void setUserLoginAttempts(java.lang.String userLoginAttempts) {
        this.userLoginAttempts = userLoginAttempts;
    }


    /**
     * Gets the company value for this MetaMdUserWebserviceBc.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this MetaMdUserWebserviceBc.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the department value for this MetaMdUserWebserviceBc.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this MetaMdUserWebserviceBc.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the jobTitle value for this MetaMdUserWebserviceBc.
     * 
     * @return jobTitle
     */
    public java.lang.String getJobTitle() {
        return jobTitle;
    }


    /**
     * Sets the jobTitle value for this MetaMdUserWebserviceBc.
     * 
     * @param jobTitle
     */
    public void setJobTitle(java.lang.String jobTitle) {
        this.jobTitle = jobTitle;
    }


    /**
     * Gets the supervisor value for this MetaMdUserWebserviceBc.
     * 
     * @return supervisor
     */
    public java.lang.String getSupervisor() {
        return supervisor;
    }


    /**
     * Sets the supervisor value for this MetaMdUserWebserviceBc.
     * 
     * @param supervisor
     */
    public void setSupervisor(java.lang.String supervisor) {
        this.supervisor = supervisor;
    }


    /**
     * Gets the supervisorPhone value for this MetaMdUserWebserviceBc.
     * 
     * @return supervisorPhone
     */
    public java.lang.String getSupervisorPhone() {
        return supervisorPhone;
    }


    /**
     * Sets the supervisorPhone value for this MetaMdUserWebserviceBc.
     * 
     * @param supervisorPhone
     */
    public void setSupervisorPhone(java.lang.String supervisorPhone) {
        this.supervisorPhone = supervisorPhone;
    }


    /**
     * Gets the locale value for this MetaMdUserWebserviceBc.
     * 
     * @return locale
     */
    public java.lang.String getLocale() {
        return locale;
    }


    /**
     * Sets the locale value for this MetaMdUserWebserviceBc.
     * 
     * @param locale
     */
    public void setLocale(java.lang.String locale) {
        this.locale = locale;
    }


    /**
     * Gets the theme value for this MetaMdUserWebserviceBc.
     * 
     * @return theme
     */
    public java.lang.String getTheme() {
        return theme;
    }


    /**
     * Sets the theme value for this MetaMdUserWebserviceBc.
     * 
     * @param theme
     */
    public void setTheme(java.lang.String theme) {
        this.theme = theme;
    }


    /**
     * Gets the homeResourceName value for this MetaMdUserWebserviceBc.
     * 
     * @return homeResourceName
     */
    public java.lang.String getHomeResourceName() {
        return homeResourceName;
    }


    /**
     * Sets the homeResourceName value for this MetaMdUserWebserviceBc.
     * 
     * @param homeResourceName
     */
    public void setHomeResourceName(java.lang.String homeResourceName) {
        this.homeResourceName = homeResourceName;
    }


    /**
     * Gets the mobileHomeResourceName value for this MetaMdUserWebserviceBc.
     * 
     * @return mobileHomeResourceName
     */
    public java.lang.String getMobileHomeResourceName() {
        return mobileHomeResourceName;
    }


    /**
     * Sets the mobileHomeResourceName value for this MetaMdUserWebserviceBc.
     * 
     * @param mobileHomeResourceName
     */
    public void setMobileHomeResourceName(java.lang.String mobileHomeResourceName) {
        this.mobileHomeResourceName = mobileHomeResourceName;
    }


    /**
     * Gets the portalResourceFilter value for this MetaMdUserWebserviceBc.
     * 
     * @return portalResourceFilter
     */
    public java.lang.String getPortalResourceFilter() {
        return portalResourceFilter;
    }


    /**
     * Sets the portalResourceFilter value for this MetaMdUserWebserviceBc.
     * 
     * @param portalResourceFilter
     */
    public void setPortalResourceFilter(java.lang.String portalResourceFilter) {
        this.portalResourceFilter = portalResourceFilter;
    }


    /**
     * Gets the portalMinimumNumberOfResourcesPerColumn value for this MetaMdUserWebserviceBc.
     * 
     * @return portalMinimumNumberOfResourcesPerColumn
     */
    public java.lang.String getPortalMinimumNumberOfResourcesPerColumn() {
        return portalMinimumNumberOfResourcesPerColumn;
    }


    /**
     * Sets the portalMinimumNumberOfResourcesPerColumn value for this MetaMdUserWebserviceBc.
     * 
     * @param portalMinimumNumberOfResourcesPerColumn
     */
    public void setPortalMinimumNumberOfResourcesPerColumn(java.lang.String portalMinimumNumberOfResourcesPerColumn) {
        this.portalMinimumNumberOfResourcesPerColumn = portalMinimumNumberOfResourcesPerColumn;
    }


    /**
     * Gets the startingInterval value for this MetaMdUserWebserviceBc.
     * 
     * @return startingInterval
     */
    public java.lang.String getStartingInterval() {
        return startingInterval;
    }


    /**
     * Sets the startingInterval value for this MetaMdUserWebserviceBc.
     * 
     * @param startingInterval
     */
    public void setStartingInterval(java.lang.String startingInterval) {
        this.startingInterval = startingInterval;
    }


    /**
     * Gets the portalLaunchInSeparateWindow value for this MetaMdUserWebserviceBc.
     * 
     * @return portalLaunchInSeparateWindow
     */
    public java.lang.String getPortalLaunchInSeparateWindow() {
        return portalLaunchInSeparateWindow;
    }


    /**
     * Sets the portalLaunchInSeparateWindow value for this MetaMdUserWebserviceBc.
     * 
     * @param portalLaunchInSeparateWindow
     */
    public void setPortalLaunchInSeparateWindow(java.lang.String portalLaunchInSeparateWindow) {
        this.portalLaunchInSeparateWindow = portalLaunchInSeparateWindow;
    }


    /**
     * Gets the automaticallyDiscardChanges value for this MetaMdUserWebserviceBc.
     * 
     * @return automaticallyDiscardChanges
     */
    public java.lang.String getAutomaticallyDiscardChanges() {
        return automaticallyDiscardChanges;
    }


    /**
     * Sets the automaticallyDiscardChanges value for this MetaMdUserWebserviceBc.
     * 
     * @param automaticallyDiscardChanges
     */
    public void setAutomaticallyDiscardChanges(java.lang.String automaticallyDiscardChanges) {
        this.automaticallyDiscardChanges = automaticallyDiscardChanges;
    }


    /**
     * Gets the automaticallyFormatPhoneNumbers value for this MetaMdUserWebserviceBc.
     * 
     * @return automaticallyFormatPhoneNumbers
     */
    public java.lang.String getAutomaticallyFormatPhoneNumbers() {
        return automaticallyFormatPhoneNumbers;
    }


    /**
     * Sets the automaticallyFormatPhoneNumbers value for this MetaMdUserWebserviceBc.
     * 
     * @param automaticallyFormatPhoneNumbers
     */
    public void setAutomaticallyFormatPhoneNumbers(java.lang.String automaticallyFormatPhoneNumbers) {
        this.automaticallyFormatPhoneNumbers = automaticallyFormatPhoneNumbers;
    }


    /**
     * Gets the proceedWithWarnings value for this MetaMdUserWebserviceBc.
     * 
     * @return proceedWithWarnings
     */
    public java.lang.String getProceedWithWarnings() {
        return proceedWithWarnings;
    }


    /**
     * Sets the proceedWithWarnings value for this MetaMdUserWebserviceBc.
     * 
     * @param proceedWithWarnings
     */
    public void setProceedWithWarnings(java.lang.String proceedWithWarnings) {
        this.proceedWithWarnings = proceedWithWarnings;
    }


    /**
     * Gets the validateAtTheFieldLevel value for this MetaMdUserWebserviceBc.
     * 
     * @return validateAtTheFieldLevel
     */
    public java.lang.String getValidateAtTheFieldLevel() {
        return validateAtTheFieldLevel;
    }


    /**
     * Sets the validateAtTheFieldLevel value for this MetaMdUserWebserviceBc.
     * 
     * @param validateAtTheFieldLevel
     */
    public void setValidateAtTheFieldLevel(java.lang.String validateAtTheFieldLevel) {
        this.validateAtTheFieldLevel = validateAtTheFieldLevel;
    }


    /**
     * Gets the validateForeignKeys value for this MetaMdUserWebserviceBc.
     * 
     * @return validateForeignKeys
     */
    public java.lang.String getValidateForeignKeys() {
        return validateForeignKeys;
    }


    /**
     * Sets the validateForeignKeys value for this MetaMdUserWebserviceBc.
     * 
     * @param validateForeignKeys
     */
    public void setValidateForeignKeys(java.lang.String validateForeignKeys) {
        this.validateForeignKeys = validateForeignKeys;
    }


    /**
     * Gets the confirmReportCriteria value for this MetaMdUserWebserviceBc.
     * 
     * @return confirmReportCriteria
     */
    public java.lang.String getConfirmReportCriteria() {
        return confirmReportCriteria;
    }


    /**
     * Sets the confirmReportCriteria value for this MetaMdUserWebserviceBc.
     * 
     * @param confirmReportCriteria
     */
    public void setConfirmReportCriteria(java.lang.String confirmReportCriteria) {
        this.confirmReportCriteria = confirmReportCriteria;
    }


    /**
     * Gets the searchResultsRecordsPerPage value for this MetaMdUserWebserviceBc.
     * 
     * @return searchResultsRecordsPerPage
     */
    public java.lang.String getSearchResultsRecordsPerPage() {
        return searchResultsRecordsPerPage;
    }


    /**
     * Sets the searchResultsRecordsPerPage value for this MetaMdUserWebserviceBc.
     * 
     * @param searchResultsRecordsPerPage
     */
    public void setSearchResultsRecordsPerPage(java.lang.String searchResultsRecordsPerPage) {
        this.searchResultsRecordsPerPage = searchResultsRecordsPerPage;
    }


    /**
     * Gets the maximumSearchResultsRecordsToDisplay value for this MetaMdUserWebserviceBc.
     * 
     * @return maximumSearchResultsRecordsToDisplay
     */
    public java.lang.String getMaximumSearchResultsRecordsToDisplay() {
        return maximumSearchResultsRecordsToDisplay;
    }


    /**
     * Sets the maximumSearchResultsRecordsToDisplay value for this MetaMdUserWebserviceBc.
     * 
     * @param maximumSearchResultsRecordsToDisplay
     */
    public void setMaximumSearchResultsRecordsToDisplay(java.lang.String maximumSearchResultsRecordsToDisplay) {
        this.maximumSearchResultsRecordsToDisplay = maximumSearchResultsRecordsToDisplay;
    }


    /**
     * Gets the startingPage value for this MetaMdUserWebserviceBc.
     * 
     * @return startingPage
     */
    public java.lang.String getStartingPage() {
        return startingPage;
    }


    /**
     * Sets the startingPage value for this MetaMdUserWebserviceBc.
     * 
     * @param startingPage
     */
    public void setStartingPage(java.lang.String startingPage) {
        this.startingPage = startingPage;
    }


    /**
     * Gets the startingActionOnArrays value for this MetaMdUserWebserviceBc.
     * 
     * @return startingActionOnArrays
     */
    public java.lang.String getStartingActionOnArrays() {
        return startingActionOnArrays;
    }


    /**
     * Sets the startingActionOnArrays value for this MetaMdUserWebserviceBc.
     * 
     * @param startingActionOnArrays
     */
    public void setStartingActionOnArrays(java.lang.String startingActionOnArrays) {
        this.startingActionOnArrays = startingActionOnArrays;
    }


    /**
     * Gets the formLabelFormat value for this MetaMdUserWebserviceBc.
     * 
     * @return formLabelFormat
     */
    public java.lang.String getFormLabelFormat() {
        return formLabelFormat;
    }


    /**
     * Sets the formLabelFormat value for this MetaMdUserWebserviceBc.
     * 
     * @param formLabelFormat
     */
    public void setFormLabelFormat(java.lang.String formLabelFormat) {
        this.formLabelFormat = formLabelFormat;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaMdUserWebserviceBc)) return false;
        MetaMdUserWebserviceBc other = (MetaMdUserWebserviceBc) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.userName==null && other.getUserName()==null) || 
             (this.userName!=null &&
              this.userName.equals(other.getUserName()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.middleName==null && other.getMiddleName()==null) || 
             (this.middleName!=null &&
              this.middleName.equals(other.getMiddleName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.honor==null && other.getHonor()==null) || 
             (this.honor!=null &&
              this.honor.equals(other.getHonor()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.mobilePhoneNumber==null && other.getMobilePhoneNumber()==null) || 
             (this.mobilePhoneNumber!=null &&
              this.mobilePhoneNumber.equals(other.getMobilePhoneNumber()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive()))) &&
            ((this.isInternal==null && other.getIsInternal()==null) || 
             (this.isInternal!=null &&
              this.isInternal.equals(other.getIsInternal()))) &&
            ((this.promptForSessionParametersAtLogin==null && other.getPromptForSessionParametersAtLogin()==null) || 
             (this.promptForSessionParametersAtLogin!=null &&
              this.promptForSessionParametersAtLogin.equals(other.getPromptForSessionParametersAtLogin()))) &&
            ((this.userType==null && other.getUserType()==null) || 
             (this.userType!=null &&
              this.userType.equals(other.getUserType()))) &&
            ((this.isSsoEnabled==null && other.getIsSsoEnabled()==null) || 
             (this.isSsoEnabled!=null &&
              this.isSsoEnabled.equals(other.getIsSsoEnabled()))) &&
            ((this.umsAuthenticationMethod==null && other.getUmsAuthenticationMethod()==null) || 
             (this.umsAuthenticationMethod!=null &&
              this.umsAuthenticationMethod.equals(other.getUmsAuthenticationMethod()))) &&
            ((this.ldapUserName==null && other.getLdapUserName()==null) || 
             (this.ldapUserName!=null &&
              this.ldapUserName.equals(other.getLdapUserName()))) &&
            ((this.ldapInstanceName==null && other.getLdapInstanceName()==null) || 
             (this.ldapInstanceName!=null &&
              this.ldapInstanceName.equals(other.getLdapInstanceName()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword()))) &&
            ((this.passwordHint==null && other.getPasswordHint()==null) || 
             (this.passwordHint!=null &&
              this.passwordHint.equals(other.getPasswordHint()))) &&
            ((this.umsMaximumLoginAttempts==null && other.getUmsMaximumLoginAttempts()==null) || 
             (this.umsMaximumLoginAttempts!=null &&
              this.umsMaximumLoginAttempts.equals(other.getUmsMaximumLoginAttempts()))) &&
            ((this.userLoginAttempts==null && other.getUserLoginAttempts()==null) || 
             (this.userLoginAttempts!=null &&
              this.userLoginAttempts.equals(other.getUserLoginAttempts()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.jobTitle==null && other.getJobTitle()==null) || 
             (this.jobTitle!=null &&
              this.jobTitle.equals(other.getJobTitle()))) &&
            ((this.supervisor==null && other.getSupervisor()==null) || 
             (this.supervisor!=null &&
              this.supervisor.equals(other.getSupervisor()))) &&
            ((this.supervisorPhone==null && other.getSupervisorPhone()==null) || 
             (this.supervisorPhone!=null &&
              this.supervisorPhone.equals(other.getSupervisorPhone()))) &&
            ((this.locale==null && other.getLocale()==null) || 
             (this.locale!=null &&
              this.locale.equals(other.getLocale()))) &&
            ((this.theme==null && other.getTheme()==null) || 
             (this.theme!=null &&
              this.theme.equals(other.getTheme()))) &&
            ((this.homeResourceName==null && other.getHomeResourceName()==null) || 
             (this.homeResourceName!=null &&
              this.homeResourceName.equals(other.getHomeResourceName()))) &&
            ((this.mobileHomeResourceName==null && other.getMobileHomeResourceName()==null) || 
             (this.mobileHomeResourceName!=null &&
              this.mobileHomeResourceName.equals(other.getMobileHomeResourceName()))) &&
            ((this.portalResourceFilter==null && other.getPortalResourceFilter()==null) || 
             (this.portalResourceFilter!=null &&
              this.portalResourceFilter.equals(other.getPortalResourceFilter()))) &&
            ((this.portalMinimumNumberOfResourcesPerColumn==null && other.getPortalMinimumNumberOfResourcesPerColumn()==null) || 
             (this.portalMinimumNumberOfResourcesPerColumn!=null &&
              this.portalMinimumNumberOfResourcesPerColumn.equals(other.getPortalMinimumNumberOfResourcesPerColumn()))) &&
            ((this.startingInterval==null && other.getStartingInterval()==null) || 
             (this.startingInterval!=null &&
              this.startingInterval.equals(other.getStartingInterval()))) &&
            ((this.portalLaunchInSeparateWindow==null && other.getPortalLaunchInSeparateWindow()==null) || 
             (this.portalLaunchInSeparateWindow!=null &&
              this.portalLaunchInSeparateWindow.equals(other.getPortalLaunchInSeparateWindow()))) &&
            ((this.automaticallyDiscardChanges==null && other.getAutomaticallyDiscardChanges()==null) || 
             (this.automaticallyDiscardChanges!=null &&
              this.automaticallyDiscardChanges.equals(other.getAutomaticallyDiscardChanges()))) &&
            ((this.automaticallyFormatPhoneNumbers==null && other.getAutomaticallyFormatPhoneNumbers()==null) || 
             (this.automaticallyFormatPhoneNumbers!=null &&
              this.automaticallyFormatPhoneNumbers.equals(other.getAutomaticallyFormatPhoneNumbers()))) &&
            ((this.proceedWithWarnings==null && other.getProceedWithWarnings()==null) || 
             (this.proceedWithWarnings!=null &&
              this.proceedWithWarnings.equals(other.getProceedWithWarnings()))) &&
            ((this.validateAtTheFieldLevel==null && other.getValidateAtTheFieldLevel()==null) || 
             (this.validateAtTheFieldLevel!=null &&
              this.validateAtTheFieldLevel.equals(other.getValidateAtTheFieldLevel()))) &&
            ((this.validateForeignKeys==null && other.getValidateForeignKeys()==null) || 
             (this.validateForeignKeys!=null &&
              this.validateForeignKeys.equals(other.getValidateForeignKeys()))) &&
            ((this.confirmReportCriteria==null && other.getConfirmReportCriteria()==null) || 
             (this.confirmReportCriteria!=null &&
              this.confirmReportCriteria.equals(other.getConfirmReportCriteria()))) &&
            ((this.searchResultsRecordsPerPage==null && other.getSearchResultsRecordsPerPage()==null) || 
             (this.searchResultsRecordsPerPage!=null &&
              this.searchResultsRecordsPerPage.equals(other.getSearchResultsRecordsPerPage()))) &&
            ((this.maximumSearchResultsRecordsToDisplay==null && other.getMaximumSearchResultsRecordsToDisplay()==null) || 
             (this.maximumSearchResultsRecordsToDisplay!=null &&
              this.maximumSearchResultsRecordsToDisplay.equals(other.getMaximumSearchResultsRecordsToDisplay()))) &&
            ((this.startingPage==null && other.getStartingPage()==null) || 
             (this.startingPage!=null &&
              this.startingPage.equals(other.getStartingPage()))) &&
            ((this.startingActionOnArrays==null && other.getStartingActionOnArrays()==null) || 
             (this.startingActionOnArrays!=null &&
              this.startingActionOnArrays.equals(other.getStartingActionOnArrays()))) &&
            ((this.formLabelFormat==null && other.getFormLabelFormat()==null) || 
             (this.formLabelFormat!=null &&
              this.formLabelFormat.equals(other.getFormLabelFormat())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUserName() != null) {
            _hashCode += getUserName().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getMiddleName() != null) {
            _hashCode += getMiddleName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getHonor() != null) {
            _hashCode += getHonor().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getMobilePhoneNumber() != null) {
            _hashCode += getMobilePhoneNumber().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        if (getIsInternal() != null) {
            _hashCode += getIsInternal().hashCode();
        }
        if (getPromptForSessionParametersAtLogin() != null) {
            _hashCode += getPromptForSessionParametersAtLogin().hashCode();
        }
        if (getUserType() != null) {
            _hashCode += getUserType().hashCode();
        }
        if (getIsSsoEnabled() != null) {
            _hashCode += getIsSsoEnabled().hashCode();
        }
        if (getUmsAuthenticationMethod() != null) {
            _hashCode += getUmsAuthenticationMethod().hashCode();
        }
        if (getLdapUserName() != null) {
            _hashCode += getLdapUserName().hashCode();
        }
        if (getLdapInstanceName() != null) {
            _hashCode += getLdapInstanceName().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        if (getPasswordHint() != null) {
            _hashCode += getPasswordHint().hashCode();
        }
        if (getUmsMaximumLoginAttempts() != null) {
            _hashCode += getUmsMaximumLoginAttempts().hashCode();
        }
        if (getUserLoginAttempts() != null) {
            _hashCode += getUserLoginAttempts().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getJobTitle() != null) {
            _hashCode += getJobTitle().hashCode();
        }
        if (getSupervisor() != null) {
            _hashCode += getSupervisor().hashCode();
        }
        if (getSupervisorPhone() != null) {
            _hashCode += getSupervisorPhone().hashCode();
        }
        if (getLocale() != null) {
            _hashCode += getLocale().hashCode();
        }
        if (getTheme() != null) {
            _hashCode += getTheme().hashCode();
        }
        if (getHomeResourceName() != null) {
            _hashCode += getHomeResourceName().hashCode();
        }
        if (getMobileHomeResourceName() != null) {
            _hashCode += getMobileHomeResourceName().hashCode();
        }
        if (getPortalResourceFilter() != null) {
            _hashCode += getPortalResourceFilter().hashCode();
        }
        if (getPortalMinimumNumberOfResourcesPerColumn() != null) {
            _hashCode += getPortalMinimumNumberOfResourcesPerColumn().hashCode();
        }
        if (getStartingInterval() != null) {
            _hashCode += getStartingInterval().hashCode();
        }
        if (getPortalLaunchInSeparateWindow() != null) {
            _hashCode += getPortalLaunchInSeparateWindow().hashCode();
        }
        if (getAutomaticallyDiscardChanges() != null) {
            _hashCode += getAutomaticallyDiscardChanges().hashCode();
        }
        if (getAutomaticallyFormatPhoneNumbers() != null) {
            _hashCode += getAutomaticallyFormatPhoneNumbers().hashCode();
        }
        if (getProceedWithWarnings() != null) {
            _hashCode += getProceedWithWarnings().hashCode();
        }
        if (getValidateAtTheFieldLevel() != null) {
            _hashCode += getValidateAtTheFieldLevel().hashCode();
        }
        if (getValidateForeignKeys() != null) {
            _hashCode += getValidateForeignKeys().hashCode();
        }
        if (getConfirmReportCriteria() != null) {
            _hashCode += getConfirmReportCriteria().hashCode();
        }
        if (getSearchResultsRecordsPerPage() != null) {
            _hashCode += getSearchResultsRecordsPerPage().hashCode();
        }
        if (getMaximumSearchResultsRecordsToDisplay() != null) {
            _hashCode += getMaximumSearchResultsRecordsToDisplay().hashCode();
        }
        if (getStartingPage() != null) {
            _hashCode += getStartingPage().hashCode();
        }
        if (getStartingActionOnArrays() != null) {
            _hashCode += getStartingActionOnArrays().hashCode();
        }
        if (getFormLabelFormat() != null) {
            _hashCode += getFormLabelFormat().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaMdUserWebserviceBc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "MetaMdUser-WebserviceBc"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "Error"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MiddleName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("honor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Honor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobilePhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MobilePhoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInternal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsInternal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promptForSessionParametersAtLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PromptForSessionParametersAtLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSsoEnabled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "IsSsoEnabled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("umsAuthenticationMethod");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UmsAuthenticationMethod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapUserName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LdapUserName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ldapInstanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "LdapInstanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Password"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passwordHint");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PasswordHint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("umsMaximumLoginAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UmsMaximumLoginAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLoginAttempts");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserLoginAttempts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("jobTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("", "JobTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Supervisor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("supervisorPhone");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SupervisorPhone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Locale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("theme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Theme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeResourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "HomeResourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileHomeResourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MobileHomeResourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalResourceFilter");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortalResourceFilter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalMinimumNumberOfResourcesPerColumn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortalMinimumNumberOfResourcesPerColumn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingInterval");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartingInterval"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("portalLaunchInSeparateWindow");
        elemField.setXmlName(new javax.xml.namespace.QName("", "PortalLaunchInSeparateWindow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automaticallyDiscardChanges");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutomaticallyDiscardChanges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("automaticallyFormatPhoneNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("", "AutomaticallyFormatPhoneNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proceedWithWarnings");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ProceedWithWarnings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateAtTheFieldLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidateAtTheFieldLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateForeignKeys");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ValidateForeignKeys"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmReportCriteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ConfirmReportCriteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchResultsRecordsPerPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "SearchResultsRecordsPerPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSearchResultsRecordsToDisplay");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MaximumSearchResultsRecordsToDisplay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingPage");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartingPage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startingActionOnArrays");
        elemField.setXmlName(new javax.xml.namespace.QName("", "StartingActionOnArrays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formLabelFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FormLabelFormat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
