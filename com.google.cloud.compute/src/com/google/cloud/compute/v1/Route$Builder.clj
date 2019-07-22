(ns com.google.cloud.compute.v1.Route$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Route$Builder]))

(defn set-dest-range
  "The destination range of outgoing packets that this route applies to. Only IPv4 is supported.

  dest-range - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String dest-range]
    (-> this (.setDestRange dest-range))))

(defn add-tags
  "A list of instance tags to which this route applies.

  tags - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String tags]
    (-> this (.addTags tags))))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn set-next-hop-peering
  "[Output Only] The network peering name that should handle matching packets, which should
   conform to RFC1035.

  next-hop-peering - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String next-hop-peering]
    (-> this (.setNextHopPeering next-hop-peering))))

(defn get-next-hop-vpn-tunnel
  "The URL to a VpnTunnel that should handle matching packets.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNextHopVpnTunnel))))

(defn get-tags-list
  "A list of instance tags to which this route applies.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Route$Builder this]
    (-> this (.getTagsList))))

(defn get-kind
  "[Output Only] Type of this resource. Always compute#routes for Route resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getKind))))

(defn add-all-warnings
  "[Output Only] If potential misconfigurations are detected for this route, this field will be
   populated with warning messages.

  warnings - `java.util.List`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.util.List warnings]
    (-> this (.addAllWarnings warnings))))

(defn set-network
  "Fully-qualified URL of the network that this route applies to.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn add-all-tags
  "A list of instance tags to which this route applies.

  tags - `java.util.List`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.util.List tags]
    (-> this (.addAllTags tags))))

(defn set-kind
  "[Output Only] Type of this resource. Always compute#routes for Route resources.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-next-hop-network
  "The URL of the local network if it should handle matching packets.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNextHopNetwork))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn set-next-hop-ip
  "The network IP address of an instance that should handle matching packets. Only IPv4 is
   supported.

  next-hop-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String next-hop-ip]
    (-> this (.setNextHopIp next-hop-ip))))

(defn set-next-hop-gateway
  "The URL to a gateway that should handle matching packets. You can only specify the internet
   gateway using a full or partial valid URL:
   projects/<project-id>/global/gateways/default-internet-gateway

  next-hop-gateway - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String next-hop-gateway]
    (-> this (.setNextHopGateway next-hop-gateway))))

(defn build
  "returns: `com.google.cloud.compute.v1.Route`"
  (^com.google.cloud.compute.v1.Route [^Route$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getDescription))))

(defn set-next-hop-vpn-tunnel
  "The URL to a VpnTunnel that should handle matching packets.

  next-hop-vpn-tunnel - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String next-hop-vpn-tunnel]
    (-> this (.setNextHopVpnTunnel next-hop-vpn-tunnel))))

(defn set-next-hop-network
  "The URL of the local network if it should handle matching packets.

  next-hop-network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String next-hop-network]
    (-> this (.setNextHopNetwork next-hop-network))))

(defn set-priority
  "The priority of this route. Priority is used to break ties in cases where there is more than
   one matching route of equal prefix length. In the case of two routes with equal prefix
   length, the one with the lowest-numbered priority value wins. Default value is 1000. Valid
   range is 0 through 65535.

  priority - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.Integer priority]
    (-> this (.setPriority priority))))

(defn get-dest-range
  "The destination range of outgoing packets that this route applies to. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getDestRange))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn add-warnings
  "[Output Only] If potential misconfigurations are detected for this route, this field will be
   populated with warning messages.

  warnings - `com.google.cloud.compute.v1.Warnings`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^com.google.cloud.compute.v1.Warnings warnings]
    (-> this (.addWarnings warnings))))

(defn get-next-hop-peering
  "[Output Only] The network peering name that should handle matching packets, which should
   conform to RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNextHopPeering))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.Route`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^com.google.cloud.compute.v1.Route other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getSelfLink))))

(defn get-warnings-list
  "[Output Only] If potential misconfigurations are detected for this route, this field will be
   populated with warning messages.

  returns: `java.util.List<com.google.cloud.compute.v1.Warnings>`"
  (^java.util.List [^Route$Builder this]
    (-> this (.getWarningsList))))

(defn get-next-hop-instance
  "The URL to an instance that should handle matching packets. You can specify this as a full or
   partial URL. For example:
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNextHopInstance))))

(defn get-next-hop-gateway
  "The URL to a gateway that should handle matching packets. You can only specify the internet
   gateway using a full or partial valid URL:
   projects/<project-id>/global/gateways/default-internet-gateway

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNextHopGateway))))

(defn get-network
  "Fully-qualified URL of the network that this route applies to.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this]
    (-> this (.clone))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getCreationTimestamp))))

(defn set-next-hop-instance
  "The URL to an instance that should handle matching packets. You can specify this as a full or
   partial URL. For example:
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/

  next-hop-instance - `java.lang.String`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route$Builder this ^java.lang.String next-hop-instance]
    (-> this (.setNextHopInstance next-hop-instance))))

(defn get-next-hop-ip
  "The network IP address of an instance that should handle matching packets. Only IPv4 is
   supported.

  returns: `java.lang.String`"
  (^java.lang.String [^Route$Builder this]
    (-> this (.getNextHopIp))))

(defn get-priority
  "The priority of this route. Priority is used to break ties in cases where there is more than
   one matching route of equal prefix length. In the case of two routes with equal prefix
   length, the one with the lowest-numbered priority value wins. Default value is 1000. Valid
   range is 0 through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Route$Builder this]
    (-> this (.getPriority))))

