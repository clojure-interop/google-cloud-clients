(ns com.google.cloud.compute.v1.ProjectZoneDiskName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneDiskName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneDiskName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName$Builder []
    (ProjectZoneDiskName/newBuilder )))

(defn *of
  "disk - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName [^java.lang.String disk ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneDiskName/of disk project zone)))

(defn *format
  "disk - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String disk ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneDiskName/format disk project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneDiskName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneDiskName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName [^java.lang.String formatted-string]
    (ProjectZoneDiskName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneDiskName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneDiskName this]
    (-> this (.getFieldValuesMap))))

(defn get-disk
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName this]
    (-> this (.getDisk))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneDiskName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneDiskName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskName$Builder [^ProjectZoneDiskName this]
    (-> this (.toBuilder))))

