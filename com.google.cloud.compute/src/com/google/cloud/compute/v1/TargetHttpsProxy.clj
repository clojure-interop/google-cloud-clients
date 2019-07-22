(ns com.google.cloud.compute.v1.TargetHttpsProxy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetHttpsProxy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetHttpsProxy`

  returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^com.google.cloud.compute.v1.TargetHttpsProxy prototype]
    (TargetHttpsProxy/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder []
    (TargetHttpsProxy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxy`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy []
    (TargetHttpsProxy/getDefaultInstance )))

(defn get-ssl-policy
  "URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not
   set, the TargetHttpsProxy resource will not have any SSL policy configured.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getSslPolicy))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getKind))))

(defn get-quic-override
  "Specifies the QUIC override policy for this TargetHttpsProxy resource. This determines whether
   the load balancer will attempt to negotiate QUIC with clients or not. Can specify one of NONE,
   ENABLE, or DISABLE. Specify ENABLE to always enable QUIC, Enables QUIC when set to ENABLE, and
   disables QUIC when set to DISABLE. If NONE is specified, uses the QUIC policy with no user
   overrides, which is equivalent to DISABLE. Not specifying this field is equivalent to
   specifying NONE.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getQuicOverride))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetHttpsProxy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getName))))

(defn get-url-map
  "A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL
   to the BackendService. For example, the following are all valid URLs for specifying a URL map:
   - https://www.googleapis.compute/v1/projects/project/global/urlMaps/url-map -
   projects/project/global/urlMaps/url-map - global/urlMaps/url-map

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getUrlMap))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getId))))

(defn get-ssl-certificates-list
  "URLs to SslCertificate resources that are used to authenticate connections between users and
   the load balancer. At least one SSL certificate must be specified. Currently, you may specify
   up to 15 SSL certificates.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetHttpsProxy this]
    (-> this (.getSslCertificatesList))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetHttpsProxy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getSelfLink))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetHttpsProxy this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetHttpsProxy this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetHttpsProxy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetHttpsProxy$Builder`"
  (^com.google.cloud.compute.v1.TargetHttpsProxy$Builder [^TargetHttpsProxy this]
    (-> this (.toBuilder))))

