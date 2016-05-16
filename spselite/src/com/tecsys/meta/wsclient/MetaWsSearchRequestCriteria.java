/**
 * MetaWsSearchRequestCriteria.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public class MetaWsSearchRequestCriteria  implements java.io.Serializable {
    private com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc metaMdUserWebserviceBc;

    public MetaWsSearchRequestCriteria() {
    }

    public MetaWsSearchRequestCriteria(
           com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc metaMdUserWebserviceBc) {
           this.metaMdUserWebserviceBc = metaMdUserWebserviceBc;
    }


    /**
     * Gets the metaMdUserWebserviceBc value for this MetaWsSearchRequestCriteria.
     * 
     * @return metaMdUserWebserviceBc
     */
    public com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc getMetaMdUserWebserviceBc() {
        return metaMdUserWebserviceBc;
    }


    /**
     * Sets the metaMdUserWebserviceBc value for this MetaWsSearchRequestCriteria.
     * 
     * @param metaMdUserWebserviceBc
     */
    public void setMetaMdUserWebserviceBc(com.tecsys.meta.wsclient.MetaWsSearchRequestCriteriaMetaMdUserWebserviceBc metaMdUserWebserviceBc) {
        this.metaMdUserWebserviceBc = metaMdUserWebserviceBc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaWsSearchRequestCriteria)) return false;
        MetaWsSearchRequestCriteria other = (MetaWsSearchRequestCriteria) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metaMdUserWebserviceBc==null && other.getMetaMdUserWebserviceBc()==null) || 
             (this.metaMdUserWebserviceBc!=null &&
              this.metaMdUserWebserviceBc.equals(other.getMetaMdUserWebserviceBc())));
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
        if (getMetaMdUserWebserviceBc() != null) {
            _hashCode += getMetaMdUserWebserviceBc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaWsSearchRequestCriteria.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsSearchRequestCriteria"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metaMdUserWebserviceBc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MetaMdUser-WebserviceBc"));
        elemField.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", ">metaWsSearchRequestCriteria>MetaMdUser-WebserviceBc"));
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
