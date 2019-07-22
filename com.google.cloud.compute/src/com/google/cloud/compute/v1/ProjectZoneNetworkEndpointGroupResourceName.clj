(ns com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNetworkEndpointGroupResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneNetworkEndpointGroupResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder []
    (ProjectZoneNetworkEndpointGroupResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneNetworkEndpointGroupResourceName/of project resource zone)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneNetworkEndpointGroupResourceName/format project resource zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneNetworkEndpointGroupResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName [^java.lang.String formatted-string]
    (ProjectZoneNetworkEndpointGroupResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneNetworkEndpointGroupResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneNetworkEndpointGroupResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNetworkEndpointGroupResourceName$Builder [^ProjectZoneNetworkEndpointGroupResourceName this]
    (-> this (.toBuilder))))

