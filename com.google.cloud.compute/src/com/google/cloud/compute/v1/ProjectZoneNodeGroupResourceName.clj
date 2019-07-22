(ns com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneNodeGroupResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneNodeGroupResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder []
    (ProjectZoneNodeGroupResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneNodeGroupResourceName/of project resource zone)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneNodeGroupResourceName/format project resource zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneNodeGroupResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName [^java.lang.String formatted-string]
    (ProjectZoneNodeGroupResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneNodeGroupResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneNodeGroupResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneNodeGroupResourceName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneNodeGroupResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneNodeGroupResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneNodeGroupResourceName$Builder [^ProjectZoneNodeGroupResourceName this]
    (-> this (.toBuilder))))

