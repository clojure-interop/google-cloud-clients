(ns com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxiesSetSslCertificatesRequest]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest`

  returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder [^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest prototype]
    (TargetSslProxiesSetSslCertificatesRequest/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder []
    (TargetSslProxiesSetSslCertificatesRequest/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest []
    (TargetSslProxiesSetSslCertificatesRequest/getDefaultInstance )))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetSslProxiesSetSslCertificatesRequest this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetSslProxiesSetSslCertificatesRequest this]
    (-> this (.getApiMessageRequestBody))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxiesSetSslCertificatesRequest this]
    (-> this (.getFieldMask))))

(defn get-ssl-certificates-list
  "New set of URLs to SslCertificate resources to associate with this TargetSslProxy. Currently
   exactly one ssl certificate must be specified.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxiesSetSslCertificatesRequest this]
    (-> this (.getSslCertificatesList))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxiesSetSslCertificatesRequest$Builder [^TargetSslProxiesSetSslCertificatesRequest this]
    (-> this (.toBuilder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxiesSetSslCertificatesRequest this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetSslProxiesSetSslCertificatesRequest this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetSslProxiesSetSslCertificatesRequest this]
    (-> this (.hashCode))))

