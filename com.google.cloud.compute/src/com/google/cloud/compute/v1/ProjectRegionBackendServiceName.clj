(ns com.google.cloud.compute.v1.ProjectRegionBackendServiceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionBackendServiceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionBackendServiceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder []
    (ProjectRegionBackendServiceName/newBuilder )))

(defn *of
  "backend-service - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName [^java.lang.String backend-service ^java.lang.String project ^java.lang.String region]
    (ProjectRegionBackendServiceName/of backend-service project region)))

(defn *format
  "backend-service - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String backend-service ^java.lang.String project ^java.lang.String region]
    (ProjectRegionBackendServiceName/format backend-service project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionBackendServiceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionBackendServiceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName [^java.lang.String formatted-string]
    (ProjectRegionBackendServiceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionBackendServiceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionBackendServiceName this]
    (-> this (.getFieldValuesMap))))

(defn get-backend-service
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName this]
    (-> this (.getBackendService))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionBackendServiceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionBackendServiceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionBackendServiceName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionBackendServiceName$Builder [^ProjectRegionBackendServiceName this]
    (-> this (.toBuilder))))

