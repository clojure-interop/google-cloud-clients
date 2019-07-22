(ns com.google.cloud.compute.v1.ProjectGlobalOperationName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalOperationName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalOperationName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder []
    (ProjectGlobalOperationName/newBuilder )))

(defn *of
  "operation - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName [^java.lang.String operation ^java.lang.String project]
    (ProjectGlobalOperationName/of operation project)))

(defn *format
  "operation - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String operation ^java.lang.String project]
    (ProjectGlobalOperationName/format operation project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalOperationName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalOperationName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName [^java.lang.String formatted-string]
    (ProjectGlobalOperationName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalOperationName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalOperationName$Builder [^ProjectGlobalOperationName this]
    (-> this (.toBuilder))))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalOperationName this]
    (-> this (.getOperation))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalOperationName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalOperationName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalOperationName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalOperationName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalOperationName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalOperationName this]
    (-> this (.hashCode))))

