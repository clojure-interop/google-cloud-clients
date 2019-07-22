(ns com.google.cloud.compute.v1.ProjectZoneAutoscalerName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneAutoscalerName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneAutoscalerName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder []
    (ProjectZoneAutoscalerName/newBuilder )))

(defn *of
  "autoscaler - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName [^java.lang.String autoscaler ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneAutoscalerName/of autoscaler project zone)))

(defn *format
  "autoscaler - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String autoscaler ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneAutoscalerName/format autoscaler project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneAutoscalerName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneAutoscalerName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName [^java.lang.String formatted-string]
    (ProjectZoneAutoscalerName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneAutoscalerName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneAutoscalerName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-autoscaler
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName this]
    (-> this (.getAutoscaler))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneAutoscalerName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneAutoscalerName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneAutoscalerName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneAutoscalerName$Builder [^ProjectZoneAutoscalerName this]
    (-> this (.toBuilder))))

