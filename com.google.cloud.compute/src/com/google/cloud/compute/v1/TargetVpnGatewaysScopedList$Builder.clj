(ns com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGatewaysScopedList$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^TargetVpnGatewaysScopedList$Builder this ^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList other]
    (-> this (.mergeFrom other))))

(defn get-target-vpn-gateways-list
  "[Output Only] A list of target VPN gateways contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^java.util.List [^TargetVpnGatewaysScopedList$Builder this]
    (-> this (.getTargetVpnGatewaysList))))

(defn add-all-target-vpn-gateways
  "[Output Only] A list of target VPN gateways contained in this scope.

  target-vpn-gateways - `java.util.List`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^TargetVpnGatewaysScopedList$Builder this ^java.util.List target-vpn-gateways]
    (-> this (.addAllTargetVpnGateways target-vpn-gateways))))

(defn add-target-vpn-gateways
  "[Output Only] A list of target VPN gateways contained in this scope.

  target-vpn-gateways - `com.google.cloud.compute.v1.TargetVpnGateway`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^TargetVpnGatewaysScopedList$Builder this ^com.google.cloud.compute.v1.TargetVpnGateway target-vpn-gateways]
    (-> this (.addTargetVpnGateways target-vpn-gateways))))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of addresses when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetVpnGatewaysScopedList$Builder this]
    (-> this (.getWarning))))

(defn set-warning
  "[Output Only] Informational warning which replaces the list of addresses when the list is
   empty.

  warning - `com.google.cloud.compute.v1.Warning`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^TargetVpnGatewaysScopedList$Builder this ^com.google.cloud.compute.v1.Warning warning]
    (-> this (.setWarning warning))))

(defn build
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList [^TargetVpnGatewaysScopedList$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^TargetVpnGatewaysScopedList$Builder this]
    (-> this (.clone))))

