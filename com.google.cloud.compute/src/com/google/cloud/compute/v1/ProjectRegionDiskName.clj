(ns com.google.cloud.compute.v1.ProjectRegionDiskName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionDiskName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionDiskName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName$Builder []
    (ProjectRegionDiskName/newBuilder )))

(defn *of
  "disk - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName [^java.lang.String disk ^java.lang.String project ^java.lang.String region]
    (ProjectRegionDiskName/of disk project region)))

(defn *format
  "disk - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String disk ^java.lang.String project ^java.lang.String region]
    (ProjectRegionDiskName/format disk project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionDiskName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionDiskName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName [^java.lang.String formatted-string]
    (ProjectRegionDiskName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionDiskName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionDiskName this]
    (-> this (.getFieldValuesMap))))

(defn get-disk
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName this]
    (-> this (.getDisk))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionDiskName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionDiskName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskName$Builder [^ProjectRegionDiskName this]
    (-> this (.toBuilder))))

