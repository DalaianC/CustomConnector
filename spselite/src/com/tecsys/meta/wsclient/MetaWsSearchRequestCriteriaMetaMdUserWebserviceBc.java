/**
 * MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public class MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc  implements java.io.Serializable {
    private java.lang.String[] errors;

    private java.lang.String userName;

    private java.lang.String firstName;

    private java.lang.String lastName;

    private java.lang.String emailAddress;

    private java.lang.String userMasterRoleRoleName;

    private java.lang.String isActive;

    public MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc() {
    }

    public MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc(
           java.lang.String[] errors,
           java.lang.String userName,
           java.lang.String firstName,
           java.lang.String lastName,
           java.lang.String emailAddress,
           java.lang.String userMasterRoleRoleName,
           java.lang.String isActive) {
           this.errors = errors;
           this.userName = userName;
           this.firstName = firstName;
           this.lastName = lastName;
           this.emailAddress = emailAddress;
           this.userMasterRoleRoleName = userMasterRoleRoleName;
           this.isActive = isActive;
    }


    /**
     * Gets the errors value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return errors
     */
    public java.lang.String[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param errors
     */
    public void setErrors(java.lang.String[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the userName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return userName
     */
    public java.lang.String getUserName() {
        return userName;
    }


    /**
     * Sets the userName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param userName
     */
    public void setUserName(java.lang.String userName) {
        this.userName = userName;
    }


    /**
     * Gets the firstName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the lastName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the emailAddress value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return emailAddress
     */
    public java.lang.String getEmailAddress() {
        return emailAddress;
    }


    /**
     * Sets the emailAddress value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param emailAddress
     */
    public void setEmailAddress(java.lang.String emailAddress) {
        this.emailAddress = emailAddress;
    }


    /**
     * Gets the userMasterRoleRoleName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return userMasterRoleRoleName
     */
    public java.lang.String getUserMasterRoleRoleName() {
        return userMasterRoleRoleName;
    }


    /**
     * Sets the userMasterRoleRoleName value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param userMasterRoleRoleName
     */
    public void setUserMasterRoleRoleName(java.lang.String userMasterRoleRoleName) {
        this.userMasterRoleRoleName = userMasterRoleRoleName;
    }


    /**
     * Gets the isActive value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @return isActive
     */
    public java.lang.String getIsActive() {
        return isActive;
    }


    /**
     * Sets the isActive value for this MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.
     * 
     * @param isActive
     */
    public void setIsActive(java.lang.String isActive) {
        this.isActive = isActive;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc)) return false;
        MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc other = (MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc) obj;
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
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.emailAddress==null && other.getEmailAddress()==null) || 
             (this.emailAddress!=null &&
              this.emailAddress.equals(other.getEmailAddress()))) &&
            ((this.userMasterRoleRoleName==null && other.getUserMasterRoleRoleName()==null) || 
             (this.userMasterRoleRoleName!=null &&
              this.userMasterRoleRoleName.equals(other.getUserMasterRoleRoleName()))) &&
            ((this.isActive==null && other.getIsActive()==null) || 
             (this.isActive!=null &&
              this.isActive.equals(other.getIsActive())));
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
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getEmailAddress() != null) {
            _hashCode += getEmailAddress().hashCode();
        }
        if (getUserMasterRoleRoleName() != null) {
            _hashCode += getUserMasterRoleRoleName().hashCode();
        }
        if (getIsActive() != null) {
            _hashCode += getIsActive().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", ">metaWsSearchRequestCriteria>MetaMdUser-WebserviceBc"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "FirstName"));
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
        elemField.setFieldName("emailAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "EmailAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userMasterRoleRoleName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "UserMasterRole-RoleName"));
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
