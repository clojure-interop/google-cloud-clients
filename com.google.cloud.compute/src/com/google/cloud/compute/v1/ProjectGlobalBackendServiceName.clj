(ns com.google.cloud.compute.v1.ProjectGlobalBackendServiceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalBackendServiceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalBackendServiceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder []
    (ProjectGlobalBackendServiceName/newBuilder )))

(defn *of
  "backend-service - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName [^java.lang.String backend-service ^java.lang.String project]
    (ProjectGlobalBackendServiceName/of backend-service project)))

(defn *format
  "backend-service - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String backend-service ^java.lang.String project]
    (ProjectGlobalBackendServiceName/format backend-service project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalBackendServiceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalBackendServiceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName [^java.lang.String formatted-string]
    (ProjectGlobalBackendServiceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalBackendServiceName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendServiceName$Builder [^ProjectGlobalBackendServiceName this]
    (-> this (.toBuilder))))

(defn get-backend-service
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendServiceName this]
    (-> this (.getBackendService))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendServiceName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalBackendServiceName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendServiceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendServiceName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalBackendServiceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalBackendServiceName this]
    (-> this (.hashCode))))

