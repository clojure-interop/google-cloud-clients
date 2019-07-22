(ns com.google.cloud.compute.v1.ProjectRegionDiskTypeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionDiskTypeName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionDiskTypeName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder []
    (ProjectRegionDiskTypeName/newBuilder )))

(defn *of
  "disk-type - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName [^java.lang.String disk-type ^java.lang.String project ^java.lang.String region]
    (ProjectRegionDiskTypeName/of disk-type project region)))

(defn *format
  "disk-type - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String disk-type ^java.lang.String project ^java.lang.String region]
    (ProjectRegionDiskTypeName/format disk-type project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionDiskTypeName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionDiskTypeName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName [^java.lang.String formatted-string]
    (ProjectRegionDiskTypeName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionDiskTypeName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionDiskTypeName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName this]
    (-> this (.getProject))))

(defn get-disk-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName this]
    (-> this (.getDiskType))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionDiskTypeName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionDiskTypeName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskTypeName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskTypeName$Builder [^ProjectRegionDiskTypeName this]
    (-> this (.toBuilder))))

