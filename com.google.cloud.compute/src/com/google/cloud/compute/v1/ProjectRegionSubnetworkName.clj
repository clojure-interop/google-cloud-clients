(ns com.google.cloud.compute.v1.ProjectRegionSubnetworkName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionSubnetworkName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionSubnetworkName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder []
    (ProjectRegionSubnetworkName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  subnetwork - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName [^java.lang.String project ^java.lang.String region ^java.lang.String subnetwork]
    (ProjectRegionSubnetworkName/of project region subnetwork)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  subnetwork - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String subnetwork]
    (ProjectRegionSubnetworkName/format project region subnetwork)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionSubnetworkName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionSubnetworkName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName [^java.lang.String formatted-string]
    (ProjectRegionSubnetworkName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionSubnetworkName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionSubnetworkName this]
    (-> this (.getFieldValuesMap))))

(defn get-subnetwork
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName this]
    (-> this (.getSubnetwork))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionSubnetworkName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionSubnetworkName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionSubnetworkName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionSubnetworkName$Builder [^ProjectRegionSubnetworkName this]
    (-> this (.toBuilder))))

