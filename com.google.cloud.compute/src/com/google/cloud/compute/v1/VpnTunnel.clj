(ns com.google.cloud.compute.v1.VpnTunnel
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnel]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.VpnTunnel`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^com.google.cloud.compute.v1.VpnTunnel prototype]
    (VpnTunnel/newBuilder prototype))
  (^com.google.cloud.compute.v1.VpnTunnel$Builder []
    (VpnTunnel/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.VpnTunnel`"
  (^com.google.cloud.compute.v1.VpnTunnel []
    (VpnTunnel/getDefaultInstance )))

(defn get-kind
  "[Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getKind))))

(defn get-detailed-status
  "[Output Only] Detailed status message for the VPN tunnel.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getDetailedStatus))))

(defn get-status
  "[Output Only] The status of the VPN tunnel, which can be one of the following: - PROVISIONING:
   Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG: Waiting to receive
   all VPN-related configs from the user. Network, TargetVpnGateway, VpnTunnel, ForwardingRule,
   and Route resources are needed to setup the VPN tunnel. - FIRST_HANDSHAKE: Successful first
   handshake with the peer VPN. - ESTABLISHED: Secure session is successfully established with the
   peer VPN. - NETWORK_ERROR: Deprecated, replaced by NO_INCOMING_PACKETS - AUTHORIZATION_ERROR:
   Auth error (for example, bad shared secret). - NEGOTIATION_FAILURE: Handshake failed. -
   DEPROVISIONING: Resources are being deallocated for the VPN tunnel. - FAILED: Tunnel creation
   has failed and the tunnel is not ready to be used.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getStatus))))

(defn get-local-traffic-selector-list
  "Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The
   value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be
   disjoint. Only IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VpnTunnel this]
    (-> this (.getLocalTrafficSelectorList))))

(defn get-target-vpn-gateway
  "URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the client
   when the VPN tunnel is created.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getTargetVpnGateway))))

(defn get-peer-ip
  "IP address of the peer VPN gateway. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getPeerIp))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VpnTunnel this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^VpnTunnel this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getName))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getDescription))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the server.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getId))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^VpnTunnel this]
    (-> this (.getApiMessageRequestBody))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getSelfLink))))

(defn get-shared-secret
  "Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN
   gateway.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getSharedSecret))))

(defn get-ike-version
  "IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway.
   Acceptable IKE versions are 1 or 2. The default version is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^VpnTunnel this]
    (-> this (.getIkeVersion))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VpnTunnel this]
    (-> this (.hashCode))))

(defn get-shared-secret-hash
  "Hash of the shared secret.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getSharedSecretHash))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getCreationTimestamp))))

(defn get-router
  "URL of the router resource to be used for dynamic routing.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getRouter))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VpnTunnel this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "[Output Only] URL of the region where the VPN tunnel resides. You must specify this field as
   part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel this]
    (-> this (.toBuilder))))

(defn get-remote-traffic-selector-list
  "Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway. The
   value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should be
   disjoint. Only IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VpnTunnel this]
    (-> this (.getRemoteTrafficSelectorList))))

