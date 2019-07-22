(ns com.google.cloud.compute.v1.ProjectRegionOperationName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionOperationName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionOperationName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName$Builder []
    (ProjectRegionOperationName/newBuilder )))

(defn *of
  "operation - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionOperationName`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName [^java.lang.String operation ^java.lang.String project ^java.lang.String region]
    (ProjectRegionOperationName/of operation project region)))

(defn *format
  "operation - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String operation ^java.lang.String project ^java.lang.String region]
    (ProjectRegionOperationName/format operation project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionOperationName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionOperationName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionOperationName`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName [^java.lang.String formatted-string]
    (ProjectRegionOperationName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionOperationName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionOperationName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionOperationName this]
    (-> this (.hashCode))))

(defn get-operation
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName this]
    (-> this (.getOperation))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionOperationName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionOperationName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionOperationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionOperationName$Builder [^ProjectRegionOperationName this]
    (-> this (.toBuilder))))

