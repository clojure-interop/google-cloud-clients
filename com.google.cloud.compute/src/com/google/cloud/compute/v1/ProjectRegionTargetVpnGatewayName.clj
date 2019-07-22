(ns com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionTargetVpnGatewayName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionTargetVpnGatewayName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder []
    (ProjectRegionTargetVpnGatewayName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  target-vpn-gateway - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName [^java.lang.String project ^java.lang.String region ^java.lang.String target-vpn-gateway]
    (ProjectRegionTargetVpnGatewayName/of project region target-vpn-gateway)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  target-vpn-gateway - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String target-vpn-gateway]
    (ProjectRegionTargetVpnGatewayName/format project region target-vpn-gateway)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionTargetVpnGatewayName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName [^java.lang.String formatted-string]
    (ProjectRegionTargetVpnGatewayName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionTargetVpnGatewayName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.getProject))))

(defn get-target-vpn-gateway
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.getTargetVpnGateway))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionTargetVpnGatewayName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetVpnGatewayName$Builder [^ProjectRegionTargetVpnGatewayName this]
    (-> this (.toBuilder))))

