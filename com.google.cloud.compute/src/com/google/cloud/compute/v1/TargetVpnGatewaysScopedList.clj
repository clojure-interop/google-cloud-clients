(ns com.google.cloud.compute.v1.TargetVpnGatewaysScopedList
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 TargetVpnGatewaysScopedList]))

(defn *new-builder
  "prototype - `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList`

  returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList prototype]
    (TargetVpnGatewaysScopedList/newBuilder prototype))
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder []
    (TargetVpnGatewaysScopedList/newBuilder )))

(defn *get-default-instance
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList []
    (TargetVpnGatewaysScopedList/getDefaultInstance )))

(defn get-warning
  "[Output Only] Informational warning which replaces the list of addresses when the list is
   empty.

  returns: `com.google.cloud.compute.v1.Warning`"
  (^com.google.cloud.compute.v1.Warning [^TargetVpnGatewaysScopedList this]
    (-> this (.getWarning))))

(defn get-target-vpn-gateways-list
  "[Output Only] A list of target VPN gateways contained in this scope.

  returns: `java.util.List<com.google.cloud.compute.v1.TargetVpnGateway>`"
  (^java.util.List [^TargetVpnGatewaysScopedList this]
    (-> this (.getTargetVpnGatewaysList))))

(defn get-field-mask
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^TargetVpnGatewaysScopedList this]
    (-> this (.getFieldMask))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TargetVpnGatewaysScopedList this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.Object`"
  (^java.lang.Object [^TargetVpnGatewaysScopedList this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-api-message-request-body
  "returns: `com.google.api.gax.httpjson.ApiMessage`"
  (^com.google.api.gax.httpjson.ApiMessage [^TargetVpnGatewaysScopedList this]
    (-> this (.getApiMessageRequestBody))))

(defn hash-code
  "returns: `int`"
  (^Integer [^TargetVpnGatewaysScopedList this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^TargetVpnGatewaysScopedList this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder`"
  (^com.google.cloud.compute.v1.TargetVpnGatewaysScopedList$Builder [^TargetVpnGatewaysScopedList this]
    (-> this (.toBuilder))))

