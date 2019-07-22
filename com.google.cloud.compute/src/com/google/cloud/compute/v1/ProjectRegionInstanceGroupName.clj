(ns com.google.cloud.compute.v1.ProjectRegionInstanceGroupName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionInstanceGroupName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionInstanceGroupName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder []
    (ProjectRegionInstanceGroupName/newBuilder )))

(defn *of
  "instance-group - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName [^java.lang.String instance-group ^java.lang.String project ^java.lang.String region]
    (ProjectRegionInstanceGroupName/of instance-group project region)))

(defn *format
  "instance-group - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instance-group ^java.lang.String project ^java.lang.String region]
    (ProjectRegionInstanceGroupName/format instance-group project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionInstanceGroupName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionInstanceGroupName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName [^java.lang.String formatted-string]
    (ProjectRegionInstanceGroupName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionInstanceGroupName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionInstanceGroupName this]
    (-> this (.getFieldValuesMap))))

(defn get-instance-group
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName this]
    (-> this (.getInstanceGroup))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionInstanceGroupName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionInstanceGroupName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupName$Builder [^ProjectRegionInstanceGroupName this]
    (-> this (.toBuilder))))

