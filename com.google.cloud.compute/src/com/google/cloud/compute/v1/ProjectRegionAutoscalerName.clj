(ns com.google.cloud.compute.v1.ProjectRegionAutoscalerName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionAutoscalerName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionAutoscalerName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder []
    (ProjectRegionAutoscalerName/newBuilder )))

(defn *of
  "autoscaler - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName [^java.lang.String autoscaler ^java.lang.String project ^java.lang.String region]
    (ProjectRegionAutoscalerName/of autoscaler project region)))

(defn *format
  "autoscaler - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String autoscaler ^java.lang.String project ^java.lang.String region]
    (ProjectRegionAutoscalerName/format autoscaler project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionAutoscalerName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionAutoscalerName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName [^java.lang.String formatted-string]
    (ProjectRegionAutoscalerName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionAutoscalerName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionAutoscalerName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-autoscaler
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName this]
    (-> this (.getAutoscaler))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionAutoscalerName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionAutoscalerName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionAutoscalerName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionAutoscalerName$Builder [^ProjectRegionAutoscalerName this]
    (-> this (.toBuilder))))

