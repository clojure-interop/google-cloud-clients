(ns com.google.cloud.compute.v1.SslPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPolicy]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.SslPolicy`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^com.google.cloud.compute.v1.SslPolicy prototype]
    (SslPolicy/newBuilder prototype))
  (^com.google.cloud.compute.v1.SslPolicy$Builder []
    (SslPolicy/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.SslPolicy`"
  (^com.google.cloud.compute.v1.SslPolicy []
    (SslPolicy/getDefaultInstance )))

(defn get-custom-features-list
  "A list of features enabled when the selected profile is CUSTOM. The - method returns the set of
   features that can be specified in this list. This field must be empty if the profile is not
   CUSTOM.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPolicy this]
    (-> this (.getCustomFeaturesList))))

(defn get-kind
  "[Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getKind))))

(defn get-min-tls-version
  "The minimum version of SSL protocol that can be used by the clients to establish a connection
   with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getMinTlsVersion))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   in optimistic locking. This field will be ignored when inserting a SslPolicy. An up-to-date
   fingerprint must be provided in order to update the SslPolicy, otherwise the request will fail
   with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an SslPolicy.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getFingerprint))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPolicy this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^SslPolicy this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   Specifically, the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^SslPolicy this]
    (-> this (.getApiMessageRequestBody))))

(defn get-enabled-features-list
  "[Output Only] The list of features enabled in the SSL policy.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPolicy this]
    (-> this (.getEnabledFeaturesList))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getSelfLink))))

(defn get-warnings-list
  "[Output Only] If potential misconfigurations are detected for this SSL policy, this field will
   be populated with warning messages.

  returns: `java.util.List<com.google.cloud.compute.v1.Warnings>`"
  (^java.util.List [^SslPolicy this]
    (-> this (.getWarningsList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SslPolicy this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getCreationTimestamp))))

(defn get-profile
  "Profile specifies the set of SSL features that can be used by the load balancer when
   negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM. If
   using CUSTOM, the set of SSL features to enable must be specified in the customFeatures field.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy this]
    (-> this (.getProfile))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SslPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy this]
    (-> this (.toBuilder))))

