(ns com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 RouterStatusBgpPeerStatus$Builder]))

(defn set-uptime
  "Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   seconds

  uptime - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String uptime]
    (-> this (.setUptime uptime))))

(defn get-status
  "Status of the BGP peer: {UP, DOWN}

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getStatus))))

(defn get-ip-address
  "IP address of the local BGP interface.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getIpAddress))))

(defn get-linked-vpn-tunnel
  "URL of the VPN tunnel that this BGP peer controls.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getLinkedVpnTunnel))))

(defn add-advertised-routes
  "Routes that were advertised to the remote BGP peer

  advertised-routes - `com.google.cloud.compute.v1.Route`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^com.google.cloud.compute.v1.Route advertised-routes]
    (-> this (.addAdvertisedRoutes advertised-routes))))

(defn set-name
  "Name of this BGP peer. Unique within the Routers resource.

  name - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String name]
    (-> this (.setName name))))

(defn get-uptime
  "Time this session has been up. Format: 14 years, 51 weeks, 6 days, 23 hours, 59 minutes, 59
   seconds

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getUptime))))

(defn set-state
  "BGP state as specified in RFC1771.

  state - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String state]
    (-> this (.setState state))))

(defn get-name
  "Name of this BGP peer. Unique within the Routers resource.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getName))))

(defn get-state
  "BGP state as specified in RFC1771.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getState))))

(defn set-num-learned-routes
  "Number of routes learned from the remote BGP Peer.

  num-learned-routes - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.Integer num-learned-routes]
    (-> this (.setNumLearnedRoutes num-learned-routes))))

(defn get-uptime-seconds
  "Time this session has been up, in seconds. Format: 145

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getUptimeSeconds))))

(defn build
  "returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.build))))

(defn set-ip-address
  "IP address of the local BGP interface.

  ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String ip-address]
    (-> this (.setIpAddress ip-address))))

(defn merge-from
  "other - `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus other]
    (-> this (.mergeFrom other))))

(defn get-num-learned-routes
  "Number of routes learned from the remote BGP Peer.

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getNumLearnedRoutes))))

(defn clone
  "returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.clone))))

(defn get-advertised-routes-list
  "Routes that were advertised to the remote BGP peer

  returns: `java.util.List<com.google.cloud.compute.v1.Route>`"
  (^java.util.List [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getAdvertisedRoutesList))))

(defn set-uptime-seconds
  "Time this session has been up, in seconds. Format: 145

  uptime-seconds - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String uptime-seconds]
    (-> this (.setUptimeSeconds uptime-seconds))))

(defn set-peer-ip-address
  "IP address of the remote BGP interface.

  peer-ip-address - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String peer-ip-address]
    (-> this (.setPeerIpAddress peer-ip-address))))

(defn set-status
  "Status of the BGP peer: {UP, DOWN}

  status - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String status]
    (-> this (.setStatus status))))

(defn get-peer-ip-address
  "IP address of the remote BGP interface.

  returns: `java.lang.String`"
  (^java.lang.String [^RouterStatusBgpPeerStatus$Builder this]
    (-> this (.getPeerIpAddress))))

(defn add-all-advertised-routes
  "Routes that were advertised to the remote BGP peer

  advertised-routes - `java.util.List`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.util.List advertised-routes]
    (-> this (.addAllAdvertisedRoutes advertised-routes))))

(defn set-linked-vpn-tunnel
  "URL of the VPN tunnel that this BGP peer controls.

  linked-vpn-tunnel - `java.lang.String`

  returns: `com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder`"
  (^com.google.cloud.compute.v1.RouterStatusBgpPeerStatus$Builder [^RouterStatusBgpPeerStatus$Builder this ^java.lang.String linked-vpn-tunnel]
    (-> this (.setLinkedVpnTunnel linked-vpn-tunnel))))

