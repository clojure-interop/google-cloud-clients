(ns com.google.cloud.compute.v1.Router
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 Router]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.Router`

  returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^com.google.cloud.compute.v1.Router prototype]
    (Router/newBuilder prototype))
  (^com.google.cloud.compute.v1.Router$Builder []
    (Router/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.Router`"
  (^com.google.cloud.compute.v1.Router []
    (Router/getDefaultInstance )))

(defn get-bgp-peers-list
  "BGP information that must be configured into the routing stack to establish BGP peering. This
   information must specify the peer ASN and either the interface name, IP address, or peer IP
   address. Please refer to RFC4273.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterBgpPeer>`"
  (^java.util.List [^Router this]
    (-> this (.getBgpPeersList))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#router for routers.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getKind))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^Router this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^Router this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-bgp
  "BGP information specific to this router.

  returns: `com.google.cloud.compute.v1.RouterBgp`"
  (^com.google.cloud.compute.v1.RouterBgp [^Router this]
    (-> this (.getBgp))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^Router this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getSelfLink))))

(defn get-network
  "URI of the network to which this router belongs.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getNetwork))))

(defn get-interfaces-list
  "Router interfaces. Each interface requires either one linked resource, (for example,
   linkedVpnTunnel), or IP address and IP address range (for example, ipRange), or both.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterInterface>`"
  (^java.util.List [^Router this]
    (-> this (.getInterfacesList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Router this]
    (-> this (.hashCode))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Router this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-nats-list
  "A list of NAT services created in this router.

  returns: `java.util.List<com.google.cloud.compute.v1.RouterNat>`"
  (^java.util.List [^Router this]
    (-> this (.getNatsList))))

(defn get-region
  "[Output Only] URI of the region where the router resides. You must specify this field as part
   of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^Router this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.Router$Builder`"
  (^com.google.cloud.compute.v1.Router$Builder [^Router this]
    (-> this (.toBuilder))))

