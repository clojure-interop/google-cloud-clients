(ns com.google.cloud.compute.v1.RouterBgpPeer
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterBgpPeer]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterBgpPeer`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^com.google.cloud.compute.v1.RouterBgpPeer prototype]
    (RouterBgpPeer/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder []
    (RouterBgpPeer/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterBgpPeer`"
  (^com.google.cloud.compute.v1.RouterBgpPeer []
    (RouterBgpPeer/getDefaultInstance )))

(defn get-advertise-mode
  "User-specified flag to indicate which mode to use for advertisement.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.getAdvertiseMode))))

(defn get-advertised-ip-ranges-list
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only be
   populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   \"bgp\" message). These IP ranges are advertised in addition to any specified groups. Leave this
   field blank to advertise no custom IP ranges.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterAdvertisedIpRange>`"
  (^java.util.List [^RouterBgpPeer this]
    (-> this (.getAdvertisedIpRangesList))))

(defn get-ip-address
  "IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.getIpAddress))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterBgpPeer this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterBgpPeer this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.getName))))

(defn get-advertised-route-priority
  "The priority of routes advertised to this BGP peer. Where there is more than one matching route
   of maximum length, the routes with the lowest priority value win.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterBgpPeer this]
    (-> this (.getAdvertisedRoutePriority))))

(defn get-peer-asn
  "Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterBgpPeer this]
    (-> this (.getPeerAsn))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterBgpPeer this]
    (-> this (.getApiMessageRequestBody))))

(defn get-management-type
  "[Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is the
   default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP peer
   that is configured and managed by Cloud Interconnect, specifically by an InterconnectAttachment
   of type PARTNER. Google automatically creates, updates, and deletes this type of BGP peer when
   the PARTNER InterconnectAttachment is created, updated, or deleted.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.getManagementType))))

(defn get-interface-name
  "Name of the interface the BGP peer is associated with.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.getInterfaceName))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterBgpPeer this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterBgpPeer this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-peer-ip-address
  "IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer this]
    (-> this (.getPeerIpAddress))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer this]
    (-> this (.toBuilder))))

(defn get-advertised-groups-list
  "User-specified list of prefix groups to advertise in custom mode, which can take one of the
   following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC subnets.
   - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. - ALL_PEER_VPC_SUBNETS: Advertises
   peer subnets of the router's VPC network. Note that this field can only be populated if
   advertise_mode is CUSTOM and overrides the list defined for the router (in the \"bgp\" message).
   These groups are advertised in addition to any specified prefixes. Leave this field blank to
   advertise no custom groups.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterBgpPeer this]
    (-> this (.getAdvertisedGroupsList))))

