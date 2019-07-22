(ns com.google.cloud.compute.v1.Network$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Network$Builder]))

(defn add-subnetworks
  "[Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.

  subnetworks - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String subnetworks]
    (-> this (.addSubnetworks subnetworks))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-gateway-i-pv-4
  "[Output Only] The gateway address for default routing out of the network. This value is read
   only and is selected by GCP.

  gateway-i-pv-4 - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String gateway-i-pv-4]
    (-> this (.setGatewayIPv4 gateway-i-pv-4))))

(defn get-kind
  "[Output Only] Type of the resource. Always compute#network for networks.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getKind))))

(defn add-peerings
  "[Output Only] A list of network peerings for the resource.

  peerings - `com.google.cloud.compute.v1.NetworkPeering`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^com.google.cloud.compute.v1.NetworkPeering peerings]
    (-> this (.addPeerings peerings))))

(defn get-routing-config
  "The network-level routing configuration for this network. Used by Cloud Router to determine
   what type of network-wide routing behavior to enforce.

  returns: `com.google.cloud.compute.v1.NetworkRoutingConfig`"
  (^com.google.cloud.compute.v1.NetworkRoutingConfig [^Network$Builder this]
    (-> this (.getRoutingConfig))))

(defn set-routing-config
  "The network-level routing configuration for this network. Used by Cloud Router to determine
   what type of network-wide routing behavior to enforce.

  routing-config - `com.google.cloud.compute.v1.NetworkRoutingConfig`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^com.google.cloud.compute.v1.NetworkRoutingConfig routing-config]
    (-> this (.setRoutingConfig routing-config))))

(defn get-peerings-list
  "[Output Only] A list of network peerings for the resource.

  returns: `java.util.List<com.google.cloud.compute.v1.NetworkPeering>`"
  (^java.util.List [^Network$Builder this]
    (-> this (.getPeeringsList))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-auto-create-subnetworks
  "When set to true, the VPC network is created in \"auto\" mode. When set to false, the VPC
   network is created in \"custom\" mode.

   An auto mode VPC network starts with one subnet per region. Each subnet has a
   predetermined range as described in Auto mode VPC network IP ranges.

  auto-create-subnetworks - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.Boolean auto-create-subnetworks]
    (-> this (.setAutoCreateSubnetworks auto-create-subnetworks))))

(defn set-kind
  "[Output Only] Type of the resource. Always compute#network for networks.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-gateway-i-pv-4
  "[Output Only] The gateway address for default routing out of the network. This value is read
   only and is selected by GCP.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getGatewayIPv4))))

(defn get-subnetworks-list
  "[Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Network$Builder this]
    (-> this (.getSubnetworksList))))

(defn set-i-pv-4-range
  "Deprecated in favor of subnet mode networks. The range of internal addresses that are legal
   on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by
   the client when the network is created.

  i-pv-4-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String i-pv-4-range]
    (-> this (.setIPv4Range i-pv-4-range))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.Network`"
  (^com.google.cloud.compute.v1.Network [^Network$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn get-auto-create-subnetworks?
  "When set to true, the VPC network is created in \"auto\" mode. When set to false, the VPC
   network is created in \"custom\" mode.

   An auto mode VPC network starts with one subnet per region. Each subnet has a
   predetermined range as described in Auto mode VPC network IP ranges.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^Network$Builder this]
    (-> this (.getAutoCreateSubnetworks))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Network`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^com.google.cloud.compute.v1.Network other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getSelfLink))))

(defn add-all-subnetworks
  "[Output Only] Server-defined fully-qualified URLs for all subnetworks in this VPC network.

  subnetworks - `java.util.List`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.util.List subnetworks]
    (-> this (.addAllSubnetworks subnetworks))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-i-pv-4-range
  "Deprecated in favor of subnet mode networks. The range of internal addresses that are legal
   on this network. This range is a CIDR specification, for example: 192.168.0.0/16. Provided by
   the client when the network is created.

  returns: `java.lang.String`"
  (^java.lang.String [^Network$Builder this]
    (-> this (.getIPv4Range))))

(defn add-all-peerings
  "[Output Only] A list of network peerings for the resource.

  peerings - `java.util.List`

  returns: `com.google.cloud.compute.v1.Network$Builder`"
  (^com.google.cloud.compute.v1.Network$Builder [^Network$Builder this ^java.util.List peerings]
    (-> this (.addAllPeerings peerings))))

