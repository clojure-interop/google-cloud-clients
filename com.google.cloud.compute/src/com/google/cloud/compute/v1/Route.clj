(ns com.google.cloud.compute.v1.Route
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Route]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Route`

  returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^com.google.cloud.compute.v1.Route prototype]
    (Route/newBuilder prototype))
  (^com.google.cloud.compute.v1.Route$Builder []
    (Route/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Route`"
  (^com.google.cloud.compute.v1.Route []
    (Route/getDefaultInstance )))

(defn get-next-hop-vpn-tunnel
  "The URL to a VpnTunnel that should handle matching packets.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNextHopVpnTunnel))))

(defn get-tags-list
  "A list of instance tags to which this route applies.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Route this]
    (-> this (.getTagsList))))

(defn get-kind
  "[Output Only] Type of this resource. Always compute#routes for Route resources.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Route this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Route this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-next-hop-network
  "The URL of the local network if it should handle matching packets.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNextHopNetwork))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getDescription))))

(defn get-dest-range
  "The destination range of outgoing packets that this route applies to. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getDestRange))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getId))))

(defn get-next-hop-peering
  "[Output Only] The network peering name that should handle matching packets, which should
   conform to RFC1035.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNextHopPeering))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Route this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined fully-qualified URL for this resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getSelfLink))))

(defn get-warnings-list
  "[Output Only] If potential misconfigurations are detected for this route, this field will be
   populated with warning messages.

  returns: `java.util.List<com.google.cloud.compute.v1.Warnings>`"
  (^java.util.List [^Route this]
    (-> this (.getWarningsList))))

(defn get-next-hop-instance
  "The URL to an instance that should handle matching packets. You can specify this as a full or
   partial URL. For example:
   https://www.googleapis.com/compute/v1/projects/project/zones/zone/instances/

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNextHopInstance))))

(defn get-next-hop-gateway
  "The URL to a gateway that should handle matching packets. You can only specify the internet
   gateway using a full or partial valid URL:
   projects/<project-id>/global/gateways/default-internet-gateway

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNextHopGateway))))

(defn get-network
  "Fully-qualified URL of the network that this route applies to.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Route this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getCreationTimestamp))))

(defn get-next-hop-ip
  "The network IP address of an instance that should handle matching packets. Only IPv4 is
   supported.

  returns: `java.lang.String`"
  (^java.lang.String [^Route this]
    (-> this (.getNextHopIp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Route this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-priority
  "The priority of this route. Priority is used to break ties in cases where there is more than
   one matching route of equal prefix length. In the case of two routes with equal prefix length,
   the one with the lowest-numbered priority value wins. Default value is 1000. Valid range is 0
   through 65535.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^Route this]
    (-> this (.getPriority))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Route$Builder`"
  (^com.google.cloud.compute.v1.Route$Builder [^Route this]
    (-> this (.toBuilder))))

