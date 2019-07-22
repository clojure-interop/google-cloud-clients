(ns com.google.cloud.compute.v1.VpnTunnel$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnel$Builder]))

(defn set-description
  "An optional description of this resource. Provide this property when you create the resource.

  description - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String description]
    (-> this (.setDescription description))))

(defn set-region
  "[Output Only] URL of the region where the VPN tunnel resides. You must specify this field as
   part of the HTTP request URL. It is not settable as a field in the request body.

  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn set-shared-secret
  "Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN
   gateway.

  shared-secret - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String shared-secret]
    (-> this (.setSharedSecret shared-secret))))

(defn set-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  creation-timestamp - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String creation-timestamp]
    (-> this (.setCreationTimestamp creation-timestamp))))

(defn get-kind
  "[Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getKind))))

(defn add-all-remote-traffic-selector
  "Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway.
   The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should
   be disjoint. Only IPv4 is supported.

  remote-traffic-selector - `java.util.List`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.util.List remote-traffic-selector]
    (-> this (.addAllRemoteTrafficSelector remote-traffic-selector))))

(defn get-detailed-status
  "[Output Only] Detailed status message for the VPN tunnel.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getDetailedStatus))))

(defn get-status
  "[Output Only] The status of the VPN tunnel, which can be one of the following: -
   PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG:
   Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway,
   VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. -
   FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session
   is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by
   NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). -
   NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for
   the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getStatus))))

(defn get-local-traffic-selector-list
  "Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The
   value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be
   disjoint. Only IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VpnTunnel$Builder this]
    (-> this (.getLocalTrafficSelectorList))))

(defn get-target-vpn-gateway
  "URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the
   client when the VPN tunnel is created.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getTargetVpnGateway))))

(defn get-peer-ip
  "IP address of the peer VPN gateway. Only IPv4 is supported.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getPeerIp))))

(defn set-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn set-kind
  "[Output Only] Type of resource. Always compute#vpnTunnel for VPN tunnels.

  kind - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String kind]
    (-> this (.setKind kind))))

(defn set-target-vpn-gateway
  "URL of the Target VPN gateway with which this VPN tunnel is associated. Provided by the
   client when the VPN tunnel is created.

  target-vpn-gateway - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String target-vpn-gateway]
    (-> this (.setTargetVpnGateway target-vpn-gateway))))

(defn get-name
  "Name of the resource. Provided by the client when the resource is created. The name must be
   1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters
   long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first
   character must be a lowercase letter, and all following characters must be a dash, lowercase
   letter, or digit, except the last character, which cannot be a dash.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getName))))

(defn set-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  id - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String id]
    (-> this (.setId id))))

(defn build
  "returns: `com.google.cloud.compute.v1.VpnTunnel`"
  (^com.google.cloud.compute.v1.VpnTunnel [^VpnTunnel$Builder this]
    (-> this (.build))))

(defn get-description
  "An optional description of this resource. Provide this property when you create the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getDescription))))

(defn add-remote-traffic-selector
  "Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway.
   The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should
   be disjoint. Only IPv4 is supported.

  remote-traffic-selector - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String remote-traffic-selector]
    (-> this (.addRemoteTrafficSelector remote-traffic-selector))))

(defn get-id
  "[Output Only] The unique identifier for the resource. This identifier is defined by the
   server.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getId))))

(defn set-self-link
  "[Output Only] Server-defined URL for the resource.

  self-link - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String self-link]
    (-> this (.setSelfLink self-link))))

(defn set-shared-secret-hash
  "Hash of the shared secret.

  shared-secret-hash - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String shared-secret-hash]
    (-> this (.setSharedSecretHash shared-secret-hash))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.VpnTunnel`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^com.google.cloud.compute.v1.VpnTunnel other]
    (-> this (.mergeFrom other))))

(defn set-peer-ip
  "IP address of the peer VPN gateway. Only IPv4 is supported.

  peer-ip - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String peer-ip]
    (-> this (.setPeerIp peer-ip))))

(defn get-self-link
  "[Output Only] Server-defined URL for the resource.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getSelfLink))))

(defn set-ike-version
  "IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway.
   Acceptable IKE versions are 1 or 2. The default version is 2.

  ike-version - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.Integer ike-version]
    (-> this (.setIkeVersion ike-version))))

(defn clone
  "returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this]
    (-> this (.clone))))

(defn get-shared-secret
  "Shared secret used to set the secure session between the Cloud VPN gateway and the peer VPN
   gateway.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getSharedSecret))))

(defn get-ike-version
  "IKE protocol version to use when establishing the VPN tunnel with the peer VPN gateway.
   Acceptable IKE versions are 1 or 2. The default version is 2.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^VpnTunnel$Builder this]
    (-> this (.getIkeVersion))))

(defn get-shared-secret-hash
  "Hash of the shared secret.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getSharedSecretHash))))

(defn get-creation-timestamp
  "[Output Only] Creation timestamp in RFC3339 text format.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getCreationTimestamp))))

(defn get-router
  "URL of the router resource to be used for dynamic routing.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getRouter))))

(defn set-detailed-status
  "[Output Only] Detailed status message for the VPN tunnel.

  detailed-status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String detailed-status]
    (-> this (.setDetailedStatus detailed-status))))

(defn add-local-traffic-selector
  "Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The
   value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be
   disjoint. Only IPv4 is supported.

  local-traffic-selector - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String local-traffic-selector]
    (-> this (.addLocalTrafficSelector local-traffic-selector))))

(defn set-status
  "[Output Only] The status of the VPN tunnel, which can be one of the following: -
   PROVISIONING: Resource is being allocated for the VPN tunnel. - WAITING_FOR_FULL_CONFIG:
   Waiting to receive all VPN-related configs from the user. Network, TargetVpnGateway,
   VpnTunnel, ForwardingRule, and Route resources are needed to setup the VPN tunnel. -
   FIRST_HANDSHAKE: Successful first handshake with the peer VPN. - ESTABLISHED: Secure session
   is successfully established with the peer VPN. - NETWORK_ERROR: Deprecated, replaced by
   NO_INCOMING_PACKETS - AUTHORIZATION_ERROR: Auth error (for example, bad shared secret). -
   NEGOTIATION_FAILURE: Handshake failed. - DEPROVISIONING: Resources are being deallocated for
   the VPN tunnel. - FAILED: Tunnel creation has failed and the tunnel is not ready to be used.

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-region
  "[Output Only] URL of the region where the VPN tunnel resides. You must specify this field as
   part of the HTTP request URL. It is not settable as a field in the request body.

  returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnel$Builder this]
    (-> this (.getRegion))))

(defn add-all-local-traffic-selector
  "Local traffic selector to use when establishing the VPN tunnel with the peer VPN gateway. The
   value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges must be
   disjoint. Only IPv4 is supported.

  local-traffic-selector - `java.util.List`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.util.List local-traffic-selector]
    (-> this (.addAllLocalTrafficSelector local-traffic-selector))))

(defn set-router
  "URL of the router resource to be used for dynamic routing.

  router - `java.lang.String`

  returns: `com.google.cloud.compute.v1.VpnTunnel$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnel$Builder [^VpnTunnel$Builder this ^java.lang.String router]
    (-> this (.setRouter router))))

(defn get-remote-traffic-selector-list
  "Remote traffic selectors to use when establishing the VPN tunnel with the peer VPN gateway.
   The value should be a CIDR formatted string, for example: 192.168.0.0/16. The ranges should
   be disjoint. Only IPv4 is supported.

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VpnTunnel$Builder this]
    (-> this (.getRemoteTrafficSelectorList))))

