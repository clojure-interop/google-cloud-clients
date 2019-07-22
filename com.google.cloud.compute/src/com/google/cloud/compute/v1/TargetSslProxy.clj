(ns com.google.cloud.compute.v1.TargetSslProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetSslProxy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetSslProxy`

  returns: `com.google.cloud.compute.v1.TargetSslProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxy$Builder [^com.google.cloud.compute.v1.TargetSslProxy prototype]
    (TargetSslProxy/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetSslProxy$Builder []
    (TargetSslProxy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetSslProxy`"
  (^com.google.cloud.compute.v1.TargetSslProxy []
    (TargetSslProxy/getDefaultInstance )))

(defn get-ssl-policy
  "URL of SslPolicy resource that will be associated with the TargetSslProxy resource. If not set,
   the TargetSslProxy resource will not have any SSL policy configured.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getSslPolicy))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#targetSslProxy for target SSL proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetSslProxy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getName))))

(defn get-service
  "URL to the BackendService resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getService))))

(defn get-proxy-header
  "Specifies the type of proxy header to append before sending data to the backend, either NONE or
   PROXY_V1. The default is NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getProxyHeader))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getId))))

(defn get-ssl-certificates-list
  "URLs to SslCertificate resources that are used to authenticate connections to Backends. At
   least one SSL certificate must be specified. Currently, you may specify up to 15 SSL
   certificates.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetSslProxy this]
    (-> this (.getSslCertificatesList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetSslProxy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetSslProxy this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetSslProxy this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetSslProxy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetSslProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetSslProxy$Builder [^TargetSslProxy this]
    (-> this (.toBuilder))))

