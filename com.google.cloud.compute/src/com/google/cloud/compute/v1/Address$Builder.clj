(ns com.google.cloud.compute.v1.Address$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Address$Builder]))

(defn set-address-type
  "The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to
   EXTERNAL.

  address-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String address-type]
    (-> this (.setAddressType address-type))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn get-subnetwork
  "The URL of the subnetwork in which to reserve the address. If an IP address is specified, it
   must be within the subnetwork's IP range. This field can only be used with INTERNAL type with
   GCE_ENDPOINT/DNS_RESOLVER purposes.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getSubnetwork))))

(defn set-region
  "[Output Only] URL of the region where the regional address resides. This field is not
   applicable to global addresses. You must specify this field as part of the HTTP request URL.
   You cannot set this field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#address for addresses.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getKind))))

(defn get-status
  "[Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE.
   An address that is RESERVING is currently in the process of being reserved. A RESERVED
   address is currently reserved and available to use. An IN_USE address is currently being used
   by another resource and is not available.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getStatus))))

(defn set-network
  "The URL of the network in which to reserve the address. This field can only be used with
   INTERNAL type with VPC_PEERING purpose.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn get-purpose
  "The purpose of resource, only used with INTERNAL type.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getPurpose))))

(defn get-users-list
  "[Output Only] The URLs of the resources that are using this address.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Address$Builder this]
    (-> this (.getUsersList))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-all-users
  "[Output Only] The URLs of the resources that are using this address.

  users - `java.util.List`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.util.List users]
    (-> this (.addAllUsers users))))

(defn get-address
  "The static IP address represented by this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getAddress))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#address for addresses.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-address
  "The static IP address represented by this resource.

  address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String address]
    (-> this (.setAddress address))))

(defn get-address-type
  "The type of address to reserve, either INTERNAL or EXTERNAL. If unspecified, defaults to
   EXTERNAL.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getAddressType))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-ip-version
  "The IP Version that will be used by this address. Valid options are IPV4 or IPV6. This can
   only be specified for a global address.

  ip-version - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String ip-version]
    (-> this (.setIpVersion ip-version))))

(defn set-network-tier
  "This signifies the networking tier used for configuring this Address and can only take the
   following values: PREMIUM, STANDARD. Global forwarding rules can only be Premium Tier.
   Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses
   applied to regional forwarding rules can be used with any external load balancer. Regional
   forwarding rules in Premium Tier can only be used with a Network load balancer.

   If this field is not specified, it is assumed to be PREMIUM.

  network-tier - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String network-tier]
    (-> this (.setNetworkTier network-tier))))

(defn build
  "returns: `com.google.cloud.compute.v1.Address`"
  (^com.google.cloud.compute.v1.Address [^Address$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Address`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^com.google.cloud.compute.v1.Address other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getSelfLink))))

(defn add-users
  "[Output Only] The URLs of the resources that are using this address.

  users - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String users]
    (-> this (.addUsers users))))

(defn get-network
  "The URL of the network in which to reserve the address. This field can only be used with
   INTERNAL type with VPC_PEERING purpose.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this]
    (-> this (.clone))))

(defn get-network-tier
  "This signifies the networking tier used for configuring this Address and can only take the
   following values: PREMIUM, STANDARD. Global forwarding rules can only be Premium Tier.
   Regional forwarding rules can be either Premium or Standard Tier. Standard Tier addresses
   applied to regional forwarding rules can be used with any external load balancer. Regional
   forwarding rules in Premium Tier can only be used with a Network load balancer.

   If this field is not specified, it is assumed to be PREMIUM.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getNetworkTier))))

(defn get-prefix-length
  "The prefix length if the resource reprensents an IP range.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Address$Builder this]
    (-> this (.getPrefixLength))))

(defn set-prefix-length
  "The prefix length if the resource reprensents an IP range.

  prefix-length - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.Integer prefix-length]
    (-> this (.setPrefixLength prefix-length))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-ip-version
  "The IP Version that will be used by this address. Valid options are IPV4 or IPV6. This can
   only be specified for a global address.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getIpVersion))))

(defn set-purpose
  "The purpose of resource, only used with INTERNAL type.

  purpose - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String purpose]
    (-> this (.setPurpose purpose))))

(defn set-subnetwork
  "The URL of the subnetwork in which to reserve the address. If an IP address is specified, it
   must be within the subnetwork's IP range. This field can only be used with INTERNAL type with
   GCE_ENDPOINT/DNS_RESOLVER purposes.

  subnetwork - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String subnetwork]
    (-> this (.setSubnetwork subnetwork))))

(defn set-status
  "[Output Only] The status of the address, which can be one of RESERVING, RESERVED, or IN_USE.
   An address that is RESERVING is currently in the process of being reserved. A RESERVED
   address is currently reserved and available to use. An IN_USE address is currently being used
   by another resource and is not available.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Address$Builder`"
  (^com.google.cloud.compute.v1.Address$Builder [^Address$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] URL of the region where the regional address resides. This field is not
   applicable to global addresses. You must specify this field as part of the HTTP request URL.
   You cannot set this field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Address$Builder this]
    (-> this (.getRegion))))

