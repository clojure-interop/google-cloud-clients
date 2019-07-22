(ns com.google.cloud.compute.v1.ProjectRegionForwardingRuleName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionForwardingRuleName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionForwardingRuleName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder []
    (ProjectRegionForwardingRuleName/newBuilder )))

(defn *of
  "forwarding-rule - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName [^java.lang.String forwarding-rule ^java.lang.String project ^java.lang.String region]
    (ProjectRegionForwardingRuleName/of forwarding-rule project region)))

(defn *format
  "forwarding-rule - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String forwarding-rule ^java.lang.String project ^java.lang.String region]
    (ProjectRegionForwardingRuleName/format forwarding-rule project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionForwardingRuleName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionForwardingRuleName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName [^java.lang.String formatted-string]
    (ProjectRegionForwardingRuleName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionForwardingRuleName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionForwardingRuleName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName this]
    (-> this (.toString))))

(defn get-forwarding-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName this]
    (-> this (.getForwardingRule))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionForwardingRuleName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionForwardingRuleName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder [^ProjectRegionForwardingRuleName this]
    (-> this (.toBuilder))))

