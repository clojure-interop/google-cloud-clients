(ns com.google.cloud.compute.v1.ProjectZoneName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneName$Builder []
    (ProjectZoneName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneName`"
  (^com.google.cloud.compute.v1.ProjectZoneName [^java.lang.String project ^java.lang.String zone]
    (ProjectZoneName/of project zone)))

(defn *format
  "project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String zone]
    (ProjectZoneName/format project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneName`"
  (^com.google.cloud.compute.v1.ProjectZoneName [^java.lang.String formatted-string]
    (ProjectZoneName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneName$Builder [^ProjectZoneName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneName this]
    (-> this (.getProject))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneName this]
    (-> this (.getZone))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneName this]
    (-> this (.hashCode))))

