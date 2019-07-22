(ns com.google.cloud.compute.v1.VpnTunnelsScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 VpnTunnelsScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.VpnTunnelsScopedList`

  returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^com.google.cloud.compute.v1.VpnTunnelsScopedList prototype]
    (VpnTunnelsScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder []
    (VpnTunnelsScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList []
    (VpnTunnelsScopedList/getDefaultInstance )))

(defn get-warning
  "Informational warning which replaces the list of addresses when the list is empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^VpnTunnelsScopedList this]
    (-> this (.getWarning))))

(defn get-vpn-tunnels-list
  "A list of VPN tunnels contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.VpnTunnel>`"
  (^java.util.List [^VpnTunnelsScopedList this]
    (-> this (.getVpnTunnelsList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^VpnTunnelsScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VpnTunnelsScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^VpnTunnelsScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^VpnTunnelsScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^VpnTunnelsScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^VpnTunnelsScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder`"
  (^com.google.cloud.compute.v1.VpnTunnelsScopedList$Builder [^VpnTunnelsScopedList this]
    (-> this (.toBuilder))))

