(ns com.google.cloud.compute.v1.ProjectGlobalRouteName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalRouteName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalRouteName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder []
    (ProjectGlobalRouteName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  route - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName [^java.lang.String project ^java.lang.String route]
    (ProjectGlobalRouteName/of project route)))

(defn *format
  "project - `java.lang.String`
  route - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String route]
    (ProjectGlobalRouteName/format project route)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalRouteName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalRouteName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName [^java.lang.String formatted-string]
    (ProjectGlobalRouteName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalRouteName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalRouteName$Builder [^ProjectGlobalRouteName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalRouteName this]
    (-> this (.getProject))))

(defn get-route
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalRouteName this]
    (-> this (.getRoute))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalRouteName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalRouteName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalRouteName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalRouteName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalRouteName this]
    (-> this (.hashCode))))

