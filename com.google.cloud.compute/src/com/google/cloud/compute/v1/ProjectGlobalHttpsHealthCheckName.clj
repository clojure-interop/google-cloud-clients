(ns com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalHttpsHealthCheckName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalHttpsHealthCheckName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder []
    (ProjectGlobalHttpsHealthCheckName/newBuilder )))

(defn *of
  "https-health-check - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName [^java.lang.String https-health-check ^java.lang.String project]
    (ProjectGlobalHttpsHealthCheckName/of https-health-check project)))

(defn *format
  "https-health-check - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String https-health-check ^java.lang.String project]
    (ProjectGlobalHttpsHealthCheckName/format https-health-check project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalHttpsHealthCheckName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName [^java.lang.String formatted-string]
    (ProjectGlobalHttpsHealthCheckName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalHttpsHealthCheckName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalHttpsHealthCheckName$Builder [^ProjectGlobalHttpsHealthCheckName this]
    (-> this (.toBuilder))))

(defn get-https-health-check
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpsHealthCheckName this]
    (-> this (.getHttpsHealthCheck))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpsHealthCheckName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalHttpsHealthCheckName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpsHealthCheckName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalHttpsHealthCheckName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalHttpsHealthCheckName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalHttpsHealthCheckName this]
    (-> this (.hashCode))))

