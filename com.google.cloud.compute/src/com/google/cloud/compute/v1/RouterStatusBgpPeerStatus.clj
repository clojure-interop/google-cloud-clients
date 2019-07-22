(ns com.google.cloud.compute.v1.RouterStatusBgpPeerStatus
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatusBgpPeerStatus]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus prototype]
    (RouterStatusBgpPeerStatus/newBuilder prototype))
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder []
    (RouterStatusBgpPeerStatus/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus []
    (RouterStatusBgpPeerStatus/getDefaultInstance )))

(defn get-status
  "Status of the BGP peer: {UP, DOWN}

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getStatus))))

(defn get-ip-address
  "IP address of the local BGP interface.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getIpAddress))))

(defn get-linked-vpn-tunnel
  "URL of the VPN tunnel that this BGP peer controls.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getLinkedVpnTunnel))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^RouterStatusBgpPeerStatus this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^RouterStatusBgpPeerStatus this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-uptime
  "Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   seconds

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getUptime))))

(defn get-name
  "Name of this BGP peer. Unique within the Routers resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getName))))

(defn get-state
  "BGP state as specified in RFC1771.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getState))))

(defn get-uptime-seconds
  "Time this session has been up, in seconds. Format: 145

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getUptimeSeconds))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^RouterStatusBgpPeerStatus this]
    (-> this (.getApiMessageRequestBody))))

(defn get-num-learned-routes
  "Number of routes learned from the remote BGP Peer.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterStatusBgpPeerStatus this]
    (-> this (.getNumLearnedRoutes))))

(defn get-advertised-routes-list
  "Routes that were advertised to the remote BGP peer

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouterStatusBgpPeerStatus this]
    (-> this (.getAdvertisedRoutesList))))

(defn hash-code
  "returns: `int`"
  (^Integer [^RouterStatusBgpPeerStatus this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^RouterStatusBgpPeerStatus this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-peer-ip-address
  "IP address of the remote BGP interface.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus this]
    (-> this (.getPeerIpAddress))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus this]
    (-> this (.toBuilder))))

