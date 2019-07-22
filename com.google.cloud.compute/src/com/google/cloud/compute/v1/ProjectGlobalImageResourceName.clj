(ns com.google.cloud.compute.v1.ProjectGlobalImageResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalImageResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalImageResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder []
    (ProjectGlobalImageResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalImageResourceName/of project resource)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalImageResourceName/format project resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalImageResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalImageResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName [^java.lang.String formatted-string]
    (ProjectGlobalImageResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalImageResourceName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageResourceName$Builder [^ProjectGlobalImageResourceName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageResourceName this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageResourceName this]
    (-> this (.getResource))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalImageResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageResourceName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalImageResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalImageResourceName this]
    (-> this (.hashCode))))

