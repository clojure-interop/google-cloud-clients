(ns com.google.cloud.compute.v1.TargetVpnGateway$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGateway$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn add-all-forwarding-rules
  "[Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created
   using compute.forwardingRules.insert and associated with a VPN gateway.

  forwarding-rules - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.util.List forwarding-rules]
    (-> this (.addAllForwardingRules forwarding-rules))))

(defn set-region
  "[Output Only] URL of the region where the target VPN gateway resides. You must specify this
   field as part of the HTTP request URL. It is not settable as a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getKind))))

(defn get-forwarding-rules-list
  "[Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created
   using compute.forwardingRules.insert and associated with a VPN gateway.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetVpnGateway$Builder this]
    (-> this (.getForwardingRulesList))))

(defn get-status
  "[Output Only] The status of the VPN gateway, which can be one of the following: CREATING,
   READY, FAILED, or DELETING.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getStatus))))

(defn set-network
  "URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   gateway is created.

  network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#targetVpnGateway for target VPN gateways.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetVpnGateway`"
  (^com.google.cloud.compute.v1.TargetVpnGateway [^TargetVpnGateway$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getDescription))))

(defn add-tunnels
  "[Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using the
   compute.vpntunnels.insert method and associated with a VPN gateway.

  tunnels - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String tunnels]
    (-> this (.addTunnels tunnels))))

(defn add-forwarding-rules
  "[Output Only] A list of URLs to the ForwardingRule resources. ForwardingRules are created
   using compute.forwardingRules.insert and associated with a VPN gateway.

  forwarding-rules - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String forwarding-rules]
    (-> this (.addForwardingRules forwarding-rules))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetVpnGateway`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^com.google.cloud.compute.v1.TargetVpnGateway other]
    (-> this (.mergeFrom other))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getSelfLink))))

(defn get-network
  "URL of the network to which this VPN gateway is attached. Provided by the client when the VPN
   gateway is created.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getNetwork))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this]
    (-> this (.clone))))

(defn get-tunnels-list
  "[Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using the
   compute.vpntunnels.insert method and associated with a VPN gateway.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetVpnGateway$Builder this]
    (-> this (.getTunnelsList))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getCreationTimestamp))))

(defn add-all-tunnels
  "[Output Only] A list of URLs to VpnTunnel resources. VpnTunnels are created using the
   compute.vpntunnels.insert method and associated with a VPN gateway.

  tunnels - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.util.List tunnels]
    (-> this (.addAllTunnels tunnels))))

(defn set-status
  "[Output Only] The status of the VPN gateway, which can be one of the following: CREATING,
   READY, FAILED, or DELETING.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.TargetVpnGateway$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGateway$Builder [^TargetVpnGateway$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] URL of the region where the target VPN gateway resides. You must specify this
   field as part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGateway$Builder this]
    (-> this (.getRegion))))

