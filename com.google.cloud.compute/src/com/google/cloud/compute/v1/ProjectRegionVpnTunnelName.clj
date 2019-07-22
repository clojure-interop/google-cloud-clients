(ns com.google.cloud.compute.v1.ProjectRegionVpnTunnelName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionVpnTunnelName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionVpnTunnelName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder []
    (ProjectRegionVpnTunnelName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  vpn-tunnel - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName [^java.lang.String project ^java.lang.String region ^java.lang.String vpn-tunnel]
    (ProjectRegionVpnTunnelName/of project region vpn-tunnel)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  vpn-tunnel - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String vpn-tunnel]
    (ProjectRegionVpnTunnelName/format project region vpn-tunnel)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionVpnTunnelName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionVpnTunnelName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName [^java.lang.String formatted-string]
    (ProjectRegionVpnTunnelName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionVpnTunnelName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionVpnTunnelName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionVpnTunnelName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionVpnTunnelName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-vpn-tunnel
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName this]
    (-> this (.getVpnTunnel))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionVpnTunnelName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionVpnTunnelName$Builder [^ProjectRegionVpnTunnelName this]
    (-> this (.toBuilder))))

