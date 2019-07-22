(ns com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionNodeTemplateResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionNodeTemplateResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder []
    (ProjectRegionNodeTemplateResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName [^java.lang.String project ^java.lang.String region ^java.lang.String resource]
    (ProjectRegionNodeTemplateResourceName/of project region resource)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String resource]
    (ProjectRegionNodeTemplateResourceName/format project region resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionNodeTemplateResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName [^java.lang.String formatted-string]
    (ProjectRegionNodeTemplateResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionNodeTemplateResourceName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.getResource))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionNodeTemplateResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionNodeTemplateResourceName$Builder [^ProjectRegionNodeTemplateResourceName this]
    (-> this (.toBuilder))))

