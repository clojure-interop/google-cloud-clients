(ns com.google.cloud.compute.v1.ProjectZoneDiskTypeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneDiskTypeName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneDiskTypeName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder []
    (ProjectZoneDiskTypeName/newBuilder )))

(defn *of
  "disk-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName [^java.lang.String disk-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneDiskTypeName/of disk-type project zone)))

(defn *format
  "disk-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String disk-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneDiskTypeName/format disk-type project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneDiskTypeName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneDiskTypeName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName [^java.lang.String formatted-string]
    (ProjectZoneDiskTypeName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneDiskTypeName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneDiskTypeName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName this]
    (-> this (.getProject))))

(defn get-disk-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName this]
    (-> this (.getDiskType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskTypeName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneDiskTypeName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneDiskTypeName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskTypeName$Builder [^ProjectZoneDiskTypeName this]
    (-> this (.toBuilder))))

