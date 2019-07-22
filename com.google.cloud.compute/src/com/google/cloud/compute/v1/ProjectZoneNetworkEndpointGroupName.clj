(ns com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNetworkEndpointGroupName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneNetworkEndpointGroupName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder []
    (ProjectZoneNetworkEndpointGroupName/newBuilder )))

(defn *of
  "network-endpoint-group - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName [^java.lang.String network-endpoint-group ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneNetworkEndpointGroupName/of network-endpoint-group project zone)))

(defn *format
  "network-endpoint-group - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String network-endpoint-group ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneNetworkEndpointGroupName/format network-endpoint-group project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneNetworkEndpointGroupName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName [^java.lang.String formatted-string]
    (ProjectZoneNetworkEndpointGroupName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneNetworkEndpointGroupName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-network-endpoint-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.getNetworkEndpointGroup))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneNetworkEndpointGroupName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupName$Builder [^ProjectZoneNetworkEndpointGroupName this]
    (-> this (.toBuilder))))

