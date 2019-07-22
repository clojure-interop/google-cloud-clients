(ns com.google.cloud.compute.v1.AccessConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 AccessConfig]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.AccessConfig`

  returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^com.google.cloud.compute.v1.AccessConfig prototype]
    (AccessConfig/newBuilder prototype))
  (^com.google.cloud.compute.v1.AccessConfig$Builder []
    (AccessConfig/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.AccessConfig`"
  (^com.google.cloud.compute.v1.AccessConfig []
    (AccessConfig/getDefaultInstance )))

(defn get-public-ptr-domain-name
  "The DNS domain name for the public PTR record. This field can only be set when the
   set_public_ptr field is enabled.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.getPublicPtrDomainName))))

(defn get-type
  "The type of configuration. The default and only option is ONE_TO_ONE_NAT.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.getType))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#accessConfig for access configs.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^AccessConfig this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^AccessConfig this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "The name of this access configuration. The default and recommended name is External NAT but you
   can use any arbitrary string you would like. For example, My external IP or Network Access.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.getName))))

(defn get-set-public-ptr?
  "Specifies whether a public DNS ?PTR? record should be created to map the external IP address of
   the instance to a DNS domain name.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^AccessConfig this]
    (-> this (.getSetPublicPtr))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^AccessConfig this]
    (-> this (.getApiMessageRequestBody))))

(defn get-nat-ip
  "An external IP address associated with this instance. Specify an unused static external IP
   address available to the project or leave this field undefined to use an IP from a shared
   ephemeral IP address pool. If you specify a static external IP address, it must live in the
   same region as the zone of the instance.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.getNatIP))))

(defn get-network-tier
  "This signifies the networking tier used for configuring this access configuration and can only
   take the following values: PREMIUM, STANDARD.

   If an AccessConfig is specified without a valid external IP address, an ephemeral IP will be
   created with this networkTier.

   If an AccessConfig with a valid external IP address is specified, it must match that of the
   networkTier associated with the Address resource owning that IP.

  returns: `java.lang.String`"
  (^java.lang.String [^AccessConfig this]
    (-> this (.getNetworkTier))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AccessConfig this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AccessConfig this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.AccessConfig$Builder`"
  (^com.google.cloud.compute.v1.AccessConfig$Builder [^AccessConfig this]
    (-> this (.toBuilder))))

