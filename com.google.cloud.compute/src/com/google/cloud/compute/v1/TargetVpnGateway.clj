(ns com.google.cloud.compute.v1.TargetVpnGateway
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGateway]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetVpnGateway`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^com.google.cloud.compute.v1.TargetVpnGateway prototype]
    (TargetVpnGateway/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder []
    (TargetVpnGateway/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetVpnGateway`"
  (^com.google.cloud.compute.v1.TargetVpnGateway []
    (TargetVpnGateway/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getKind))))

(defn get-forwarding-rules-list
  "[Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created using
   compute.forwardingRules.insert and associated with a VPN gateway.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetVpnGateway this]
    (-> this (.getForwardingRulesList))))

(defn get-status
  "[Output Only] The status of the VPN gateway, which can be one of the following: CREATING,
   READY, FAILED, or DELETING.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getStatus))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetVpnGateway this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetVpnGateway this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetVpnGateway this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getSelfLink))))

(defn get-network
  "URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   gateway is created.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getNetwork))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetVpnGateway this]
    (-> this (.hashCode))))

(defn get-tunnels-list
  "[Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using the
   compute.vpntunnels.insert method and associated with a VPN gateway.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetVpnGateway this]
    (-> this (.getTunnelsList))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getCreationTimestamp))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetVpnGateway this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the target VPN gateway resides. You must specify this
   field as part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway this]
    (-> this (.toBuilder))))

