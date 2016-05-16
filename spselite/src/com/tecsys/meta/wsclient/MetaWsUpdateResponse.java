/**
 * MetaWsUpdateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.tecsys.meta.wsclient;

public class MetaWsUpdateResponse  implements java.io.Serializable {
    private com.tecsys.meta.wsclient.MetaWsResponseStatus status;

    private com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse[] transactions;

    public MetaWsUpdateResponse() {
    }

    public MetaWsUpdateResponse(
           com.tecsys.meta.wsclient.MetaWsResponseStatus status,
           com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse[] transactions) {
           this.status = status;
           this.transactions = transactions;
    }


    /**
     * Gets the status value for this MetaWsUpdateResponse.
     * 
     * @return status
     */
    public com.tecsys.meta.wsclient.MetaWsResponseStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this MetaWsUpdateResponse.
     * 
     * @param status
     */
    public void setStatus(com.tecsys.meta.wsclient.MetaWsResponseStatus status) {
        this.status = status;
    }


    /**
     * Gets the transactions value for this MetaWsUpdateResponse.
     * 
     * @return transactions
     */
    public com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse[] getTransactions() {
        return transactions;
    }


    /**
     * Sets the transactions value for this MetaWsUpdateResponse.
     * 
     * @param transactions
     */
    public void setTransactions(com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse[] transactions) {
        this.transactions = transactions;
    }

    public com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse getTransactions(int i) {
        return this.transactions[i];
    }

    public void setTransactions(int i, com.tecsys.meta.wsclient.MetaWsUpdateTransactionResponse _value) {
        this.transactions[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetaWsUpdateResponse)) return false;
        MetaWsUpdateResponse other = (MetaWsUpdateResponse) obj;
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
            ((this.transactions==null && other.getTransactions()==null) || 
             (this.transactions!=null &&
              java.util.Arrays.equals(this.transactions, other.getTransactions())));
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
        if (getTransactions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTransactions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTransactions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetaWsUpdateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsUpdateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsResponseStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactions");
        elemField.setXmlName(new javax.xml.namespace.QName("", "transactions"));
        elemField.setXmlType(new javax.xml.namespace.QName("wsclient.meta.tecsys.com", "metaWsUpdateTransactionResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
