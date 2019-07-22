(ns com.google.cloud.compute.v1.ProjectZoneMachineTypeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneMachineTypeName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneMachineTypeName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder []
    (ProjectZoneMachineTypeName/newBuilder )))

(defn *of
  "machine-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName [^java.lang.String machine-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneMachineTypeName/of machine-type project zone)))

(defn *format
  "machine-type - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String machine-type ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneMachineTypeName/format machine-type project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneMachineTypeName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneMachineTypeName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName [^java.lang.String formatted-string]
    (ProjectZoneMachineTypeName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneMachineTypeName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneMachineTypeName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-machine-type
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName this]
    (-> this (.getMachineType))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneMachineTypeName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneMachineTypeName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneMachineTypeName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneMachineTypeName$Builder [^ProjectZoneMachineTypeName this]
    (-> this (.toBuilder))))

