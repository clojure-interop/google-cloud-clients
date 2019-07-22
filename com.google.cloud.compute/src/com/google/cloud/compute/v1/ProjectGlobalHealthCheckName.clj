(ns com.google.cloud.compute.v1.ProjectGlobalHealthCheckName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalHealthCheckName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalHealthCheckName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder []
    (ProjectGlobalHealthCheckName/newBuilder )))

(defn *of
  "health-check - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName [^java.lang.String health-check ^java.lang.String project]
    (ProjectGlobalHealthCheckName/of health-check project)))

(defn *format
  "health-check - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String health-check ^java.lang.String project]
    (ProjectGlobalHealthCheckName/format health-check project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalHealthCheckName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalHealthCheckName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName [^java.lang.String formatted-string]
    (ProjectGlobalHealthCheckName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalHealthCheckName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHealthCheckName$Builder [^ProjectGlobalHealthCheckName this]
    (-> this (.toBuilder))))

(defn get-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHealthCheckName this]
    (-> this (.getHealthCheck))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHealthCheckName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalHealthCheckName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHealthCheckName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHealthCheckName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalHealthCheckName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalHealthCheckName this]
    (-> this (.hashCode))))

