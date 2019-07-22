(ns com.google.cloud.compute.v1.Address
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Address]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Address`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^com.google.cloud.compute.v1.Address prototype]
    (Address/newBuilder prototype))
  (^com.google.cloud.compute.v1.Address$Builder []
    (Address/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Address`"
  (^com.google.cloud.compute.v1.Address []
    (Address/getDefaultInstance )))

(defn get-subnetwork
  "The URL of the subnetwork in which to reserve the address. If an IP address is specified, it
   must be within the subnetwork's IP range. This field can only be used with INTERNAL type with
   GCE_ENDPOINT/DNS_RESOLVER purposes.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getSubnetwork))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#address for addresses.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE. An
   address that is RESERVING is currently in the process of being reserved. A RESERVED address is
   currently reserved and available to use. An IN_USE address is currently being used by another
   resource and is not available.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getStatus))))

(defn get-purpose
  "The purpose of resource, only used with INTERNAL type.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getPurpose))))

(defn get-users-list
  "[Output Only] The URLs of the resources that are using this address.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Address this]
    (-> this (.getUsersList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Address this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.toString))))

(defn get-address
  "The static IP address represented by this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getAddress))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Address this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-address-type
  "The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to
   EXTERNAL.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getAddressType))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Address this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getSelfLink))))

(defn get-network
  "The URL of the network in which to reserve the address. This field can only be used with
   INTERNAL type with VPC_PEERING purpose.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getNetwork))))

(defn get-network-tier
  "This signifies the networking tier used for configuring this Address and can only take the
   following values: PREMIUM, STANDARD. Global forwarding rules can only be Premium Tier. Regional
   forwarding rules can be either Premium or Standard Tier. Standard Tier addresses applied to
   regional forwarding rules can be used with any external load balancer. Regional forwarding
   rules in Premium Tier can only be used with a Network load balancer.

   If this field is not specified, it is assumed to be PREMIUM.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getNetworkTier))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Address this]
    (-> this (.hashCode))))

(defn get-prefix-length
  "The prefix length if the resource reprensents an IP range.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Address this]
    (-> this (.getPrefixLength))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getCreationTimestamp))))

(defn get-ip-version
  "The IP Version that will be used by this address. Valid options are IPV4 or IPV6. This can only
   be specified for a global address.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getIpVersion))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Address this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the regional address resides. This field is not
   applicable to global addresses. You must specify this field as part of the HTTP request URL.
   You cannot set this field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Address this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address this]
    (-> this (.toBuilder))))

