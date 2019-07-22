(ns com.google.cloud.compute.v1.ProjectZoneNodeTypeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNodeTypeName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneNodeTypeName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder []
    (ProjectZoneNodeTypeName/newBuilder )))

(defn *of
  "node-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName [^java.lang.String node-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneNodeTypeName/of node-type project zone)))

(defn *format
  "node-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String node-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneNodeTypeName/format node-type project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneNodeTypeName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneNodeTypeName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName [^java.lang.String formatted-string]
    (ProjectZoneNodeTypeName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneNodeTypeName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneNodeTypeName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName this]
    (-> this (.getProject))))

(defn get-node-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName this]
    (-> this (.getNodeType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeTypeName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneNodeTypeName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneNodeTypeName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeTypeName$Builder [^ProjectZoneNodeTypeName this]
    (-> this (.toBuilder))))

