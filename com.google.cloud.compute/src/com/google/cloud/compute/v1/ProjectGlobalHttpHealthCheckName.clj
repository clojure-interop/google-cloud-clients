(ns com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalHttpHealthCheckName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalHttpHealthCheckName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder []
    (ProjectGlobalHttpHealthCheckName/newBuilder )))

(defn *of
  "http-health-check - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName [^java.lang.String http-health-check ^java.lang.String project]
    (ProjectGlobalHttpHealthCheckName/of http-health-check project)))

(defn *format
  "http-health-check - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String http-health-check ^java.lang.String project]
    (ProjectGlobalHttpHealthCheckName/format http-health-check project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalHttpHealthCheckName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName [^java.lang.String formatted-string]
    (ProjectGlobalHttpHealthCheckName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalHttpHealthCheckName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpHealthCheckName$Builder [^ProjectGlobalHttpHealthCheckName this]
    (-> this (.toBuilder))))

(defn get-http-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpHealthCheckName this]
    (-> this (.getHttpHealthCheck))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpHealthCheckName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalHttpHealthCheckName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpHealthCheckName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpHealthCheckName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalHttpHealthCheckName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalHttpHealthCheckName this]
    (-> this (.hashCode))))

