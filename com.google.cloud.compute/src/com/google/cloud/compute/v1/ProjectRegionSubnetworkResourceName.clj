(ns com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionSubnetworkResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionSubnetworkResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder []
    (ProjectRegionSubnetworkResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName [^java.lang.String project ^java.lang.String region ^java.lang.String resource]
    (ProjectRegionSubnetworkResourceName/of project region resource)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String resource]
    (ProjectRegionSubnetworkResourceName/format project region resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionSubnetworkResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName [^java.lang.String formatted-string]
    (ProjectRegionSubnetworkResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionSubnetworkResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionSubnetworkResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionSubnetworkResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionSubnetworkResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkResourceName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkResourceName$Builder [^ProjectRegionSubnetworkResourceName this]
    (-> this (.toBuilder))))

