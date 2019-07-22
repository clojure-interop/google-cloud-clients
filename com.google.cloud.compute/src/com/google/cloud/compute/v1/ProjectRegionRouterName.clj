(ns com.google.cloud.compute.v1.ProjectRegionRouterName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionRouterName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectRegionRouterName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionRouterName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName$Builder []
    (ProjectRegionRouterName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  region - `java.lang.String`
  router - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionRouterName`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName [^java.lang.String project ^java.lang.String region ^java.lang.String router]
    (ProjectRegionRouterName/of project region router)))

(defn *format
  "project - `java.lang.String`
  region - `java.lang.String`
  router - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String region ^java.lang.String router]
    (ProjectRegionRouterName/format project region router)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectRegionRouterName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectRegionRouterName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionRouterName`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName [^java.lang.String formatted-string]
    (ProjectRegionRouterName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectRegionRouterName/isParsableFrom formatted-string)))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectRegionRouterName this]
    (-> this (.getFieldValuesMap))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName this]
    (-> this (.getProject))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName this]
    (-> this (.toString))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectRegionRouterName this]
    (-> this (.hashCode))))

(defn get-router
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName this]
    (-> this (.getRouter))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectRegionRouterName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionRouterName this]
    (-> this (.getRegion))))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectRegionRouterName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionRouterName$Builder [^ProjectRegionRouterName this]
    (-> this (.toBuilder))))

