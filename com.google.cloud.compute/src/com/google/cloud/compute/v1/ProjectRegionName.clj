(ns com.google.cloud.compute.v1.ProjectRegionName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionName$Builder []
    (ProjectRegionName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionName`"
  (^com.google.cloud.compute.v1.ProjectRegionName [^java.lang.String project ^java.lang.String region]
    (ProjectRegionName/of project region)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region]
    (ProjectRegionName/format project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionName`"
  (^com.google.cloud.compute.v1.ProjectRegionName [^java.lang.String formatted-string]
    (ProjectRegionName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionName$Builder [^ProjectRegionName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionName this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionName this]
    (-> this (.getRegion))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionName this]
    (-> this (.hashCode))))

