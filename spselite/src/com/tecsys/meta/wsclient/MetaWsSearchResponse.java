/**
 * MetaWsSearchResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public class MetaWsSearchResponse  implements java.io.Serializable {
    private com.tecsys.meta.wsclient.MetaWsResponseStatus status;

    private com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria criteria;

    private java.lang.Integer maxRows;

    private com.tecsys.meta.wsclient.MetaMdUserWebserviceBc[] result;

    private java.lang.String viewName;

    public MetaWsSearchResponse() {
    }

    public MetaWsSearchResponse(
           com.tecsys.meta.wsclient.MetaWsResponseStatus status,
           com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria criteria,
           java.lang.Integer maxRows,
           com.tecsys.meta.wsclient.MetaMdUserWebserviceBc[] result,
           java.lang.String viewName) {
           this.status = status;
           this.criteria = criteria;
           this.maxRows = maxRows;
           this.result = result;
           this.viewName = viewName;
    }


    /**
     * Gets the status value for this MetaWsSearchResponse.
     * 
     * @return status
     */
    public com.tecsys.meta.wsclient.MetaWsResponseStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MetaWsSearchResponse.
     * 
     * @param status
     */
    public void setStatus(com.tecsys.meta.wsclient.MetaWsResponseStatus status) {
        this.status = status;
    }


    /**
     * Gets the criteria value for this MetaWsSearchResponse.
     * 
     * @return criteria
     */
    public com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria getCriteria() {
        return criteria;
    }


    /**
     * Sets the criteria value for this MetaWsSearchResponse.
     * 
     * @param criteria
     */
    public void setCriteria(com.tecsys.meta.wsclient.MetaWsSearchRequestCriteria criteria) {
        this.criteria = criteria;
    }


    /**
     * Gets the maxRows value for this MetaWsSearchResponse.
     * 
     * @return maxRows
     */
    public java.lang.Integer getMaxRows() {
        return maxRows;
    }


    /**
     * Sets the maxRows value for this MetaWsSearchResponse.
     * 
     * @param maxRows
     */
    public void setMaxRows(java.lang.Integer maxRows) {
        this.maxRows = maxRows;
    }


    /**
     * Gets the result value for this MetaWsSearchResponse.
     * 
     * @return result
     */
    public com.tecsys.meta.wsclient.MetaMdUserWebserviceBc[] getResult() {
        return result;
    }


    /**
     * Sets the result value for this MetaWsSearchResponse.
     * 
     * @param result
     */
    public void setResult(com.tecsys.meta.wsclient.MetaMdUserWebserviceBc[] result) {
        this.result = result;
    }


    /**
     * Gets the viewName value for this MetaWsSearchResponse.
     * 
     * @return viewName
     */
    public java.lang.String getViewName() {
        return viewName;
    }


    /**
     * Sets the viewName value for this MetaWsSearchResponse.
     * 
     * @param viewName
     */
    public void setViewName(java.lang.String viewName) {
        this.viewName = viewName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaWsSearchResponse)) return false;
        MetaWsSearchResponse other = (MetaWsSearchResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.criteria==null && other.getCriteria()==null) || 
             (this.criteria!=null &&
              this.criteria.equals(other.getCriteria()))) &&
            ((this.maxRows==null && other.getMaxRows()==null) || 
             (this.maxRows!=null &&
              this.maxRows.equals(other.getMaxRows()))) &&
            ((this.result==null && other.getResult()==null) || 
             (this.result!=null &&
              java.util.Arrays.equals(this.result, other.getResult()))) &&
            ((this.viewName==null && other.getViewName()==null) || 
             (this.viewName!=null &&
              this.viewName.equals(other.getViewName())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getCriteria() != null) {
            _hashCode += getCriteria().hashCode();
        }
        if (getMaxRows() != null) {
            _hashCode += getMaxRows().hashCode();
        }
        if (getResult() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getResult());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getResult(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getViewName() != null) {
            _hashCode += getViewName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaWsSearchResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsSearchResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsResponseStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "criteria"));
        elemField.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsSearchRequestCriteria"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maxRows");
        elemField.setXmlName(new javax.xml.namespace.QName("", "maxRows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("result");
        elemField.setXmlName(new javax.xml.namespace.QName("", "result"));
        elemField.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "MetaMdUser-WebserviceBc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "MetaMdUser-WebserviceBc"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("viewName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "viewName"));
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
