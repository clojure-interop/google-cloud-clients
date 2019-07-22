(ns com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInstanceTemplateResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalInstanceTemplateResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder []
    (ProjectGlobalInstanceTemplateResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalInstanceTemplateResourceName/of project resource)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalInstanceTemplateResourceName/format project resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalInstanceTemplateResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName [^java.lang.String formatted-string]
    (ProjectGlobalInstanceTemplateResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalInstanceTemplateResourceName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateResourceName$Builder [^ProjectGlobalInstanceTemplateResourceName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateResourceName this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateResourceName this]
    (-> this (.getResource))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalInstanceTemplateResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateResourceName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalInstanceTemplateResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalInstanceTemplateResourceName this]
    (-> this (.hashCode))))

