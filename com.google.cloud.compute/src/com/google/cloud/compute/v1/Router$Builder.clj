(ns com.google.cloud.compute.v1.Router$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Router$Builder]))

(defn get-bgp-peers-list
  "BGP information that must be configured into the routing stack to establish BGP peering. This
   information must specify the peer ASN and either the interface name, IP address, or peer IP
   address. Please refer to RFC4273.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterBgpPeer>`"
  (^java.util.List [^Router$Builder this]
    (-> this (.getBgpPeersList))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] URI of the region where the router resides. You must specify this field as part
   of the HTTP request URL. It is not settable as a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn add-all-interfaces
  "Router interfaces. Each interface requires either one linked resource, (for example,
   linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.

  interfaces - `java.util.List`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.util.List interfaces]
    (-> this (.addAllInterfaces interfaces))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#router for routers.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getKind))))

(defn set-network
  "URI of the network to which this router belongs.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-interfaces
  "Router interfaces. Each interface requires either one linked resource, (for example,
   linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.

  interfaces - `com.google.cloud.compute.v1.RouterInterface`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^com.google.cloud.compute.v1.RouterInterface interfaces]
    (-> this (.addInterfaces interfaces))))

(defn add-bgp-peers
  "BGP information that must be configured into the routing stack to establish BGP peering. This
   information must specify the peer ASN and either the interface name, IP address, or peer IP
   address. Please refer to RFC4273.

  bgp-peers - `com.google.cloud.compute.v1.RouterBgpPeer`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^com.google.cloud.compute.v1.RouterBgpPeer bgp-peers]
    (-> this (.addBgpPeers bgp-peers))))

(defn add-all-bgp-peers
  "BGP information that must be configured into the routing stack to establish BGP peering. This
   information must specify the peer ASN and either the interface name, IP address, or peer IP
   address. Please refer to RFC4273.

  bgp-peers - `java.util.List`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.util.List bgp-peers]
    (-> this (.addAllBgpPeers bgp-peers))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#router for routers.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-bgp
  "BGP information specific to this router.

  returns: `com.google.cloud.compute.v1.RouterBgp`"
  (^com.google.cloud.compute.v1.RouterBgp [^Router$Builder this]
    (-> this (.getBgp))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.Router`"
  (^com.google.cloud.compute.v1.Router [^Router$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Router`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^com.google.cloud.compute.v1.Router other]
    (-> this (.mergeFrom other))))

(defn add-all-nats
  "A list of NAT services created in this router.

  nats - `java.util.List`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^java.util.List nats]
    (-> this (.addAllNats nats))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getSelfLink))))

(defn get-network
  "URI of the network to which this router belongs.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getNetwork))))

(defn get-interfaces-list
  "Router interfaces. Each interface requires either one linked resource, (for example,
   linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterInterface>`"
  (^java.util.List [^Router$Builder this]
    (-> this (.getInterfacesList))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-bgp
  "BGP information specific to this router.

  bgp - `com.google.cloud.compute.v1.RouterBgp`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^com.google.cloud.compute.v1.RouterBgp bgp]
    (-> this (.setBgp bgp))))

(defn get-nats-list
  "A list of NAT services created in this router.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterNat>`"
  (^java.util.List [^Router$Builder this]
    (-> this (.getNatsList))))

(defn add-nats
  "A list of NAT services created in this router.

  nats - `com.google.cloud.compute.v1.RouterNat`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router$Builder this ^com.google.cloud.compute.v1.RouterNat nats]
    (-> this (.addNats nats))))

(defn get-region
  "[Output Only] URI of the region where the router resides. You must specify this field as part
   of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Router$Builder this]
    (-> this (.getRegion))))

