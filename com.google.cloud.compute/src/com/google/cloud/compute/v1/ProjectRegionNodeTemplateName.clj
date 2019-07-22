(ns com.google.cloud.compute.v1.ProjectRegionNodeTemplateName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionNodeTemplateName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionNodeTemplateName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder []
    (ProjectRegionNodeTemplateName/newBuilder )))

(defn *of
  "node-template - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName [^java.lang.String node-template ^java.lang.String project ^java.lang.String region]
    (ProjectRegionNodeTemplateName/of node-template project region)))

(defn *format
  "node-template - `java.lang.String`
  project - `java.lang.String`
  region - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String node-template ^java.lang.String project ^java.lang.String region]
    (ProjectRegionNodeTemplateName/format node-template project region)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionNodeTemplateName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionNodeTemplateName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName [^java.lang.String formatted-string]
    (ProjectRegionNodeTemplateName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionNodeTemplateName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionNodeTemplateName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn get-node-template
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName this]
    (-> this (.getNodeTemplate))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionNodeTemplateName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionNodeTemplateName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateName$Builder [^ProjectRegionNodeTemplateName this]
    (-> this (.toBuilder))))

