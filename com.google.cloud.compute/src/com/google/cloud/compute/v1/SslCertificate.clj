(ns com.google.cloud.compute.v1.SslCertificate
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslCertificate]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SslCertificate`

  returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^com.google.cloud.compute.v1.SslCertificate prototype]
    (SslCertificate/newBuilder prototype))
  (^com.google.cloud.compute.v1.SslCertificate$Builder []
    (SslCertificate/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SslCertificate`"
  (^com.google.cloud.compute.v1.SslCertificate []
    (SslCertificate/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#sslCertificate for SSL certificates.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslCertificate this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SslCertificate this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SslCertificate this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getSelfLink))))

(defn get-private-key
  "A write-only private key in PEM format. Only insert requests will include this field.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getPrivateKey))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SslCertificate this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getCreationTimestamp))))

(defn get-certificate
  "A local certificate file. The certificate must be in PEM format. The certificate chain must be
   no greater than 5 certs long. The chain must include at least one intermediate cert.

  returns: `java.lang.String`"
  (^java.lang.String [^SslCertificate this]
    (-> this (.getCertificate))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SslCertificate this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SslCertificate$Builder`"
  (^com.google.cloud.compute.v1.SslCertificate$Builder [^SslCertificate this]
    (-> this (.toBuilder))))

