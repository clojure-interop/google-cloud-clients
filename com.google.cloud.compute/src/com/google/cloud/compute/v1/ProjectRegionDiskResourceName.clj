(ns com.google.cloud.compute.v1.ProjectRegionDiskResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionDiskResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionDiskResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder []
    (ProjectRegionDiskResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName [^java.lang.String project ^java.lang.String region ^java.lang.String resource]
    (ProjectRegionDiskResourceName/of project region resource)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String resource]
    (ProjectRegionDiskResourceName/format project region resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionDiskResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionDiskResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName [^java.lang.String formatted-string]
    (ProjectRegionDiskResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionDiskResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionDiskResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionDiskResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionDiskResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionDiskResourceName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionDiskResourceName$Builder [^ProjectRegionDiskResourceName this]
    (-> this (.toBuilder))))

