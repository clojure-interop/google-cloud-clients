(ns com.google.cloud.compute.v1.SslPolicy$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SslPolicy$Builder]))

(defn get-custom-features-list
  "A list of features enabled when the selected profile is CUSTOM. The - method returns the set
   of features that can be specified in this list. This field must be empty if the profile is
   not CUSTOM.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPolicy$Builder this]
    (-> this (.getCustomFeaturesList))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getKind))))

(defn add-all-enabled-features
  "[Output Only] The list of features enabled in the SSL policy.

  enabled-features - `java.util.List`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.util.List enabled-features]
    (-> this (.addAllEnabledFeatures enabled-features))))

(defn get-min-tls-version
  "The minimum version of SSL protocol that can be used by the clients to establish a connection
   with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getMinTlsVersion))))

(defn set-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a SslPolicy. An
   up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an SslPolicy.

  fingerprint - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String fingerprint]
    (-> this (.setFingerprint fingerprint))))

(defn add-custom-features
  "A list of features enabled when the selected profile is CUSTOM. The - method returns the set
   of features that can be specified in this list. This field must be empty if the profile is
   not CUSTOM.

  custom-features - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String custom-features]
    (-> this (.addCustomFeatures custom-features))))

(defn add-all-warnings
  "[Output Only] If potential misconfigurations are detected for this SSL policy, this field
   will be populated with warning messages.

  warnings - `java.util.List`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.util.List warnings]
    (-> this (.addAllWarnings warnings))))

(defn get-fingerprint
  "Fingerprint of this resource. A hash of the contents stored in this object. This field is
   used in optimistic locking. This field will be ignored when inserting a SslPolicy. An
   up-to-date fingerprint must be provided in order to update the SslPolicy, otherwise the
   request will fail with error 412 conditionNotMet.

   To see the latest fingerprint, make a get() request to retrieve an SslPolicy.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getFingerprint))))

(defn set-name
  "Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   Specifically, the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output only] Type of the resource. Always compute#sslPolicyfor SSL policies.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn add-enabled-features
  "[Output Only] The list of features enabled in the SSL policy.

  enabled-features - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String enabled-features]
    (-> this (.addEnabledFeatures enabled-features))))

(defn get-name
  "Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   Specifically, the name must be 1-63 characters long and match the regular expression
   `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter,
   and all following characters must be a dash, lowercase letter, or digit, except the last
   character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn add-all-custom-features
  "A list of features enabled when the selected profile is CUSTOM. The - method returns the set
   of features that can be specified in this list. This field must be empty if the profile is
   not CUSTOM.

  custom-features - `java.util.List`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.util.List custom-features]
    (-> this (.addAllCustomFeatures custom-features))))

(defn build
  "returns: `com.google.cloud.compute.v1.SslPolicy`"
  (^com.google.cloud.compute.v1.SslPolicy [^SslPolicy$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn add-warnings
  "[Output Only] If potential misconfigurations are detected for this SSL policy, this field
   will be populated with warning messages.

  warnings - `com.google.cloud.compute.v1.Warnings`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^com.google.cloud.compute.v1.Warnings warnings]
    (-> this (.addWarnings warnings))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SslPolicy`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^com.google.cloud.compute.v1.SslPolicy other]
    (-> this (.mergeFrom other))))

(defn get-enabled-features-list
  "[Output Only] The list of features enabled in the SSL policy.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^SslPolicy$Builder this]
    (-> this (.getEnabledFeaturesList))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getSelfLink))))

(defn get-warnings-list
  "[Output Only] If potential misconfigurations are detected for this SSL policy, this field
   will be populated with warning messages.

  returns: `java.util.List<com.google.cloud.compute.v1.Warnings>`"
  (^java.util.List [^SslPolicy$Builder this]
    (-> this (.getWarningsList))))

(defn set-profile
  "Profile specifies the set of SSL features that can be used by the load balancer when
   negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM.
   If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures
   field.

  profile - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String profile]
    (-> this (.setProfile profile))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this]
    (-> this (.clone))))

(defn set-min-tls-version
  "The minimum version of SSL protocol that can be used by the clients to establish a connection
   with the load balancer. This can be one of TLS_1_0, TLS_1_1, TLS_1_2.

  min-tls-version - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SslPolicy$Builder`"
  (^com.google.cloud.compute.v1.SslPolicy$Builder [^SslPolicy$Builder this ^java.lang.String min-tls-version]
    (-> this (.setMinTlsVersion min-tls-version))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-profile
  "Profile specifies the set of SSL features that can be used by the load balancer when
   negotiating SSL with clients. This can be one of COMPATIBLE, MODERN, RESTRICTED, or CUSTOM.
   If using CUSTOM, the set of SSL features to enable must be specified in the customFeatures
   field.

  returns: `java.lang.String`"
  (^java.lang.String [^SslPolicy$Builder this]
    (-> this (.getProfile))))

