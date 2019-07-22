(ns com.google.cloud.compute.v1.ProjectGlobalBackendBucketName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalBackendBucketName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalBackendBucketName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder []
    (ProjectGlobalBackendBucketName/newBuilder )))

(defn *of
  "backend-bucket - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName [^java.lang.String backend-bucket ^java.lang.String project]
    (ProjectGlobalBackendBucketName/of backend-bucket project)))

(defn *format
  "backend-bucket - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String backend-bucket ^java.lang.String project]
    (ProjectGlobalBackendBucketName/format backend-bucket project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalBackendBucketName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalBackendBucketName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName [^java.lang.String formatted-string]
    (ProjectGlobalBackendBucketName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalBackendBucketName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalBackendBucketName$Builder [^ProjectGlobalBackendBucketName this]
    (-> this (.toBuilder))))

(defn get-backend-bucket
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendBucketName this]
    (-> this (.getBackendBucket))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendBucketName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalBackendBucketName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendBucketName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalBackendBucketName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalBackendBucketName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalBackendBucketName this]
    (-> this (.hashCode))))

