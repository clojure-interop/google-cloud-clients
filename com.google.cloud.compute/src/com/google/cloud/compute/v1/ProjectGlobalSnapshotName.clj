(ns com.google.cloud.compute.v1.ProjectGlobalSnapshotName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSnapshotName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalSnapshotName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder []
    (ProjectGlobalSnapshotName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  snapshot - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName [^java.lang.String project ^java.lang.String snapshot]
    (ProjectGlobalSnapshotName/of project snapshot)))

(defn *format
  "project - `java.lang.String`
  snapshot - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String snapshot]
    (ProjectGlobalSnapshotName/format project snapshot)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalSnapshotName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalSnapshotName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName [^java.lang.String formatted-string]
    (ProjectGlobalSnapshotName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalSnapshotName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSnapshotName$Builder [^ProjectGlobalSnapshotName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotName this]
    (-> this (.getProject))))

(defn get-snapshot
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotName this]
    (-> this (.getSnapshot))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalSnapshotName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSnapshotName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalSnapshotName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalSnapshotName this]
    (-> this (.hashCode))))

