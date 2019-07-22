(ns com.google.cloud.compute.v1.ProjectZoneTargetInstanceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneTargetInstanceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneTargetInstanceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder []
    (ProjectZoneTargetInstanceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-instance - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName [^java.lang.String project ^java.lang.String target-instance ^java.lang.String zone]
    (ProjectZoneTargetInstanceName/of project target-instance zone)))

(defn *format
  "project - `java.lang.String`
  target-instance - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-instance ^java.lang.String zone]
    (ProjectZoneTargetInstanceName/format project target-instance zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneTargetInstanceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneTargetInstanceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName [^java.lang.String formatted-string]
    (ProjectZoneTargetInstanceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneTargetInstanceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneTargetInstanceName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-target-instance
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName this]
    (-> this (.getTargetInstance))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneTargetInstanceName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneTargetInstanceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneTargetInstanceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneTargetInstanceName$Builder [^ProjectZoneTargetInstanceName this]
    (-> this (.toBuilder))))

