(ns com.google.cloud.compute.v1.ProjectGlobalUrlMapName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalUrlMapName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalUrlMapName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder []
    (ProjectGlobalUrlMapName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  url-map - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName [^java.lang.String project ^java.lang.String url-map]
    (ProjectGlobalUrlMapName/of project url-map)))

(defn *format
  "project - `java.lang.String`
  url-map - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String url-map]
    (ProjectGlobalUrlMapName/format project url-map)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalUrlMapName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalUrlMapName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName [^java.lang.String formatted-string]
    (ProjectGlobalUrlMapName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalUrlMapName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalUrlMapName$Builder [^ProjectGlobalUrlMapName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalUrlMapName this]
    (-> this (.getProject))))

(defn get-url-map
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalUrlMapName this]
    (-> this (.getUrlMap))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalUrlMapName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalUrlMapName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalUrlMapName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalUrlMapName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalUrlMapName this]
    (-> this (.hashCode))))

