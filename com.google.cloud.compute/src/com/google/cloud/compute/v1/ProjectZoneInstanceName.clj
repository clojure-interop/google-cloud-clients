(ns com.google.cloud.compute.v1.ProjectZoneInstanceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneInstanceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder []
    (ProjectZoneInstanceName/newBuilder )))

(defn *of
  "instance - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName [^java.lang.String instance ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneInstanceName/of instance project zone)))

(defn *format
  "instance - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instance ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneInstanceName/format instance project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneInstanceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneInstanceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName [^java.lang.String formatted-string]
    (ProjectZoneInstanceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneInstanceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneInstanceName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-instance
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName this]
    (-> this (.getInstance))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneInstanceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneInstanceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceName$Builder [^ProjectZoneInstanceName this]
    (-> this (.toBuilder))))

