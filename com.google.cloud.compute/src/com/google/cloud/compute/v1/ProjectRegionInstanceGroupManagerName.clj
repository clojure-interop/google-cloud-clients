(ns com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionInstanceGroupManagerName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionInstanceGroupManagerName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder []
    (ProjectRegionInstanceGroupManagerName/newBuilder )))

(defn *of
  "instance-group-manager - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName [^java.lang.String instance-group-manager ^java.lang.String project ^java.lang.String region]
    (ProjectRegionInstanceGroupManagerName/of instance-group-manager project region)))

(defn *format
  "instance-group-manager - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instance-group-manager ^java.lang.String project ^java.lang.String region]
    (ProjectRegionInstanceGroupManagerName/format instance-group-manager project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionInstanceGroupManagerName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName [^java.lang.String formatted-string]
    (ProjectRegionInstanceGroupManagerName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionInstanceGroupManagerName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.getFieldValuesMap))))

(defn get-instance-group-manager
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.getInstanceGroupManager))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionInstanceGroupManagerName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionInstanceGroupManagerName$Builder [^ProjectRegionInstanceGroupManagerName this]
    (-> this (.toBuilder))))

