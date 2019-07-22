(ns com.google.cloud.compute.v1.ProjectZoneInstanceResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneInstanceResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder []
    (ProjectZoneInstanceResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneInstanceResourceName/of project resource zone)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource ^java.lang.String zone]
    (ProjectZoneInstanceResourceName/format project resource zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneInstanceResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneInstanceResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName [^java.lang.String formatted-string]
    (ProjectZoneInstanceResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneInstanceResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneInstanceResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceResourceName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneInstanceResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneInstanceResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceResourceName$Builder [^ProjectZoneInstanceResourceName this]
    (-> this (.toBuilder))))

