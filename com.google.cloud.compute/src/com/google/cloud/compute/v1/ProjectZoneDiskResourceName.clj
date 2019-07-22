(ns com.google.cloud.compute.v1.ProjectZoneDiskResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneDiskResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneDiskResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder []
    (ProjectZoneDiskResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneDiskResourceName/of project resource zone)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneDiskResourceName/format project resource zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneDiskResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneDiskResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName [^java.lang.String formatted-string]
    (ProjectZoneDiskResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneDiskResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneDiskResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneDiskResourceName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneDiskResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneDiskResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneDiskResourceName$Builder [^ProjectZoneDiskResourceName this]
    (-> this (.toBuilder))))

