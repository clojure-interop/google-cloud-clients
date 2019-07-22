(ns com.google.cloud.compute.v1.ProjectZoneOperationName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneOperationName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneOperationName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName$Builder []
    (ProjectZoneOperationName/newBuilder )))

(defn *of
  "operation - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneOperationName`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName [^java.lang.String operation ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneOperationName/of operation project zone)))

(defn *format
  "operation - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String operation ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneOperationName/format operation project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneOperationName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneOperationName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneOperationName`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName [^java.lang.String formatted-string]
    (ProjectZoneOperationName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneOperationName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneOperationName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneOperationName this]
    (-> this (.hashCode))))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneOperationName this]
    (-> this (.getOperation))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneOperationName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneOperationName$Builder [^ProjectZoneOperationName this]
    (-> this (.toBuilder))))

