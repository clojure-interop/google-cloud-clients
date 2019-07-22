(ns com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSnapshotResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalSnapshotResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder []
    (ProjectGlobalSnapshotResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalSnapshotResourceName/of project resource)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalSnapshotResourceName/format project resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalSnapshotResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName [^java.lang.String formatted-string]
    (ProjectGlobalSnapshotResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalSnapshotResourceName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotResourceName$Builder [^ProjectGlobalSnapshotResourceName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotResourceName this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotResourceName this]
    (-> this (.getResource))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalSnapshotResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotResourceName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalSnapshotResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalSnapshotResourceName this]
    (-> this (.hashCode))))

