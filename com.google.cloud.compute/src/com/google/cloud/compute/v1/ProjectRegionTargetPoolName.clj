(ns com.google.cloud.compute.v1.ProjectRegionTargetPoolName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionTargetPoolName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionTargetPoolName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder []
    (ProjectRegionTargetPoolName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  target-pool - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName [^java.lang.String project ^java.lang.String region ^java.lang.String target-pool]
    (ProjectRegionTargetPoolName/of project region target-pool)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  target-pool - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String target-pool]
    (ProjectRegionTargetPoolName/format project region target-pool)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionTargetPoolName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionTargetPoolName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName [^java.lang.String formatted-string]
    (ProjectRegionTargetPoolName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionTargetPoolName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionTargetPoolName this]
    (-> this (.getFieldValuesMap))))

(defn get-target-pool
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName this]
    (-> this (.getTargetPool))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionTargetPoolName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionTargetPoolName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionTargetPoolName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionTargetPoolName$Builder [^ProjectRegionTargetPoolName this]
    (-> this (.toBuilder))))

