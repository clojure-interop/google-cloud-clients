(ns com.google.cloud.compute.v1.ProjectZoneInstanceGroupName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceGroupName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneInstanceGroupName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder []
    (ProjectZoneInstanceGroupName/newBuilder )))

(defn *of
  "instance-group - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName [^java.lang.String instance-group ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneInstanceGroupName/of instance-group project zone)))

(defn *format
  "instance-group - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instance-group ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneInstanceGroupName/format instance-group project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneInstanceGroupName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneInstanceGroupName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName [^java.lang.String formatted-string]
    (ProjectZoneInstanceGroupName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneInstanceGroupName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneInstanceGroupName this]
    (-> this (.getFieldValuesMap))))

(defn get-instance-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName this]
    (-> this (.getInstanceGroup))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneInstanceGroupName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneInstanceGroupName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupName$Builder [^ProjectZoneInstanceGroupName this]
    (-> this (.toBuilder))))

