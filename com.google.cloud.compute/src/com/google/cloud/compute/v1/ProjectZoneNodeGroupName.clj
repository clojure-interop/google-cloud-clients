(ns com.google.cloud.compute.v1.ProjectZoneNodeGroupName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNodeGroupName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneNodeGroupName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder []
    (ProjectZoneNodeGroupName/newBuilder )))

(defn *of
  "node-group - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName [^java.lang.String node-group ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneNodeGroupName/of node-group project zone)))

(defn *format
  "node-group - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String node-group ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneNodeGroupName/format node-group project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneNodeGroupName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneNodeGroupName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName [^java.lang.String formatted-string]
    (ProjectZoneNodeGroupName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneNodeGroupName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneNodeGroupName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-node-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName this]
    (-> this (.getNodeGroup))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneNodeGroupName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneNodeGroupName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupName$Builder [^ProjectZoneNodeGroupName this]
    (-> this (.toBuilder))))

