(ns com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnelsScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.VpnTunnelsScopedList`

  returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^VpnTunnelsScopedList$Builder this ^com.google.cloud.compute.v1.VpnTunnelsScopedList other]
    (-> this (.mergeFrom other))))

(defn get-vpn-tunnels-list
  "A list of VPN tunnels contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.VpnTunnel>`"
  (^java.util.List [^VpnTunnelsScopedList$Builder this]
    (-> this (.getVpnTunnelsList))))

(defn add-all-vpn-tunnels
  "A list of VPN tunnels contained in this scope.

  vpn-tunnels - `java.util.List`

  returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^VpnTunnelsScopedList$Builder this ^java.util.List vpn-tunnels]
    (-> this (.addAllVpnTunnels vpn-tunnels))))

(defn add-vpn-tunnels
  "A list of VPN tunnels contained in this scope.

  vpn-tunnels - `com.google.cloud.compute.v1.VpnTunnel`

  returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^VpnTunnelsScopedList$Builder this ^com.google.cloud.compute.v1.VpnTunnel vpn-tunnels]
    (-> this (.addVpnTunnels vpn-tunnels))))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^VpnTunnelsScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^VpnTunnelsScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList [^VpnTunnelsScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^VpnTunnelsScopedList$Builder this]
    (-> this (.clone))))

