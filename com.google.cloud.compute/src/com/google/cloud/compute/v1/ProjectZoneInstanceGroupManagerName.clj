(ns com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectZoneInstanceGroupManagerName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectZoneInstanceGroupManagerName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder []
    (ProjectZoneInstanceGroupManagerName/newBuilder )))

(defn *of
  "instance-group-manager - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName [^java.lang.String instance-group-manager ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneInstanceGroupManagerName/of instance-group-manager project zone)))

(defn *format
  "instance-group-manager - `java.lang.String`
  project - `java.lang.String`
  zone - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instance-group-manager ^java.lang.String project ^java.lang.String zone]
    (ProjectZoneInstanceGroupManagerName/format instance-group-manager project zone)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectZoneInstanceGroupManagerName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName [^java.lang.String formatted-string]
    (ProjectZoneInstanceGroupManagerName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectZoneInstanceGroupManagerName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.getFieldValuesMap))))

(defn get-instance-group-manager
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.getInstanceGroupManager))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-zone
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.getZone))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectZoneInstanceGroupManagerName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectZoneInstanceGroupManagerName$Builder [^ProjectZoneInstanceGroupManagerName this]
    (-> this (.toBuilder))))

