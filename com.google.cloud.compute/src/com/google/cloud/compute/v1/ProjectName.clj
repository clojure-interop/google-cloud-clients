(ns com.google.cloud.compute.v1.ProjectName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectName$Builder []
    (ProjectName/newBuilder )))

(defn *of
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectName`"
  (^com.google.cloud.compute.v1.ProjectName [^java.lang.String project]
    (ProjectName/of project)))

(defn *format
  "project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project]
    (ProjectName/format project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectName`"
  (^com.google.cloud.compute.v1.ProjectName [^java.lang.String formatted-string]
    (ProjectName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectName$Builder [^ProjectName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectName this]
    (-> this (.hashCode))))

