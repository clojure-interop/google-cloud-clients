(ns com.google.cloud.compute.v1.RouterBgpPeer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterBgpPeer$Builder]))

(defn get-advertise-mode
  "User-specified flag to indicate which mode to use for advertisement.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer$Builder this]
    (-> this (.getAdvertiseMode))))

(defn set-advertise-mode
  "User-specified flag to indicate which mode to use for advertisement.

  advertise-mode - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String advertise-mode]
    (-> this (.setAdvertiseMode advertise-mode))))

(defn get-advertised-ip-ranges-list
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only
   be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in
   the \"bgp\" message). These IP ranges are advertised in addition to any specified groups. Leave
   this field blank to advertise no custom IP ranges.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterAdvertisedIpRange>`"
  (^java.util.List [^RouterBgpPeer$Builder this]
    (-> this (.getAdvertisedIpRangesList))))

(defn set-peer-asn
  "Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.

  peer-asn - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.Integer peer-asn]
    (-> this (.setPeerAsn peer-asn))))

(defn get-ip-address
  "IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer$Builder this]
    (-> this (.getIpAddress))))

(defn add-all-advertised-groups
  "User-specified list of prefix groups to advertise in custom mode, which can take one of the
   following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC
   subnets. - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. - ALL_PEER_VPC_SUBNETS:
   Advertises peer subnets of the router's VPC network. Note that this field can only be
   populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   \"bgp\" message). These groups are advertised in addition to any specified prefixes. Leave this
   field blank to advertise no custom groups.

  advertised-groups - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.util.List advertised-groups]
    (-> this (.addAllAdvertisedGroups advertised-groups))))

(defn set-name
  "Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-advertised-route-priority
  "The priority of routes advertised to this BGP peer. Where there is more than one matching
   route of maximum length, the routes with the lowest priority value win.

  advertised-route-priority - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.Integer advertised-route-priority]
    (-> this (.setAdvertisedRoutePriority advertised-route-priority))))

(defn get-name
  "Name of this BGP peer. The name must be 1-63 characters long and comply with RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer$Builder this]
    (-> this (.getName))))

(defn add-all-advertised-ip-ranges
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only
   be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in
   the \"bgp\" message). These IP ranges are advertised in addition to any specified groups. Leave
   this field blank to advertise no custom IP ranges.

  advertised-ip-ranges - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.util.List advertised-ip-ranges]
    (-> this (.addAllAdvertisedIpRanges advertised-ip-ranges))))

(defn get-advertised-route-priority
  "The priority of routes advertised to this BGP peer. Where there is more than one matching
   route of maximum length, the routes with the lowest priority value win.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterBgpPeer$Builder this]
    (-> this (.getAdvertisedRoutePriority))))

(defn get-peer-asn
  "Peer BGP Autonomous System Number (ASN). Each BGP interface may use a different value.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterBgpPeer$Builder this]
    (-> this (.getPeerAsn))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterBgpPeer`"
  (^com.google.cloud.compute.v1.RouterBgpPeer [^RouterBgpPeer$Builder this]
    (-> this (.build))))

(defn set-ip-address
  "IP address of the interface inside Google Cloud Platform. Only IPv4 is supported.

  ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String ip-address]
    (-> this (.setIpAddress ip-address))))

(defn add-advertised-groups
  "User-specified list of prefix groups to advertise in custom mode, which can take one of the
   following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC
   subnets. - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. - ALL_PEER_VPC_SUBNETS:
   Advertises peer subnets of the router's VPC network. Note that this field can only be
   populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   \"bgp\" message). These groups are advertised in addition to any specified prefixes. Leave this
   field blank to advertise no custom groups.

  advertised-groups - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String advertised-groups]
    (-> this (.addAdvertisedGroups advertised-groups))))

(defn get-management-type
  "[Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is
   the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP
   peer that is configured and managed by Cloud Interconnect, specifically by an
   InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes
   this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or
   deleted.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer$Builder this]
    (-> this (.getManagementType))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterBgpPeer`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^com.google.cloud.compute.v1.RouterBgpPeer other]
    (-> this (.mergeFrom other))))

(defn get-interface-name
  "Name of the interface the BGP peer is associated with.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer$Builder this]
    (-> this (.getInterfaceName))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this]
    (-> this (.clone))))

(defn set-management-type
  "[Output Only] The resource that configures and manages this BGP peer. - MANAGED_BY_USER is
   the default value and can be managed by you or other users - MANAGED_BY_ATTACHMENT is a BGP
   peer that is configured and managed by Cloud Interconnect, specifically by an
   InterconnectAttachment of type PARTNER. Google automatically creates, updates, and deletes
   this type of BGP peer when the PARTNER InterconnectAttachment is created, updated, or
   deleted.

  management-type - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String management-type]
    (-> this (.setManagementType management-type))))

(defn set-interface-name
  "Name of the interface the BGP peer is associated with.

  interface-name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String interface-name]
    (-> this (.setInterfaceName interface-name))))

(defn set-peer-ip-address
  "IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.

  peer-ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^java.lang.String peer-ip-address]
    (-> this (.setPeerIpAddress peer-ip-address))))

(defn add-advertised-ip-ranges
  "User-specified list of individual IP ranges to advertise in custom mode. This field can only
   be populated if advertise_mode is CUSTOM and overrides the list defined for the router (in
   the \"bgp\" message). These IP ranges are advertised in addition to any specified groups. Leave
   this field blank to advertise no custom IP ranges.

  advertised-ip-ranges - `com.google.cloud.compute.v1.RouterAdvertisedIpRange`

  returns: `com.google.cloud.compute.v1.RouterBgpPeer$Builder`"
  (^com.google.cloud.compute.v1.RouterBgpPeer$Builder [^RouterBgpPeer$Builder this ^com.google.cloud.compute.v1.RouterAdvertisedIpRange advertised-ip-ranges]
    (-> this (.addAdvertisedIpRanges advertised-ip-ranges))))

(defn get-peer-ip-address
  "IP address of the BGP interface outside Google Cloud Platform. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterBgpPeer$Builder this]
    (-> this (.getPeerIpAddress))))

(defn get-advertised-groups-list
  "User-specified list of prefix groups to advertise in custom mode, which can take one of the
   following options: - ALL_SUBNETS: Advertises all available subnets, including peer VPC
   subnets. - ALL_VPC_SUBNETS: Advertises the router's own VPC subnets. - ALL_PEER_VPC_SUBNETS:
   Advertises peer subnets of the router's VPC network. Note that this field can only be
   populated if advertise_mode is CUSTOM and overrides the list defined for the router (in the
   \"bgp\" message). These groups are advertised in addition to any specified prefixes. Leave this
   field blank to advertise no custom groups.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterBgpPeer$Builder this]
    (-> this (.getAdvertisedGroupsList))))

