(ns com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxiesSetSslCertificatesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder [^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest prototype]
    (TargetHttpsProxiesSetSslCertificatesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder []
    (TargetHttpsProxiesSetSslCertificatesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest []
    (TargetHttpsProxiesSetSslCertificatesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetHttpsProxiesSetSslCertificatesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetHttpsProxiesSetSslCertificatesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxiesSetSslCertificatesRequest this]
    (-> this (.getFieldMask))))

(defn get-ssl-certificates-list
  "New set of SslCertificate resources to associate with this TargetHttpsProxy resource. Currently
   exactly one SslCertificate resource must be specified.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxiesSetSslCertificatesRequest this]
    (-> this (.getSslCertificatesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxiesSetSslCertificatesRequest$Builder [^TargetHttpsProxiesSetSslCertificatesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxiesSetSslCertificatesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetHttpsProxiesSetSslCertificatesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetHttpsProxiesSetSslCertificatesRequest this]
    (-> this (.hashCode))))

