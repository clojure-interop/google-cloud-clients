(ns com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneAcceleratorTypeName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneAcceleratorTypeName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder []
    (ProjectZoneAcceleratorTypeName/newBuilder )))

(defn *of
  "accelerator-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName [^java.lang.String accelerator-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneAcceleratorTypeName/of accelerator-type project zone)))

(defn *format
  "accelerator-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String accelerator-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneAcceleratorTypeName/format accelerator-type project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneAcceleratorTypeName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName [^java.lang.String formatted-string]
    (ProjectZoneAcceleratorTypeName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneAcceleratorTypeName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneAcceleratorTypeName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneAcceleratorTypeName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneAcceleratorTypeName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-accelerator-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAcceleratorTypeName this]
    (-> this (.getAcceleratorType))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAcceleratorTypeName$Builder [^ProjectZoneAcceleratorTypeName this]
    (-> this (.toBuilder))))

