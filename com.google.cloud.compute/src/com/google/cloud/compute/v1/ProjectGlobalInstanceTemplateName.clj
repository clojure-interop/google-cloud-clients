(ns com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInstanceTemplateName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalInstanceTemplateName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder []
    (ProjectGlobalInstanceTemplateName/newBuilder )))

(defn *of
  "instance-template - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName [^java.lang.String instance-template ^java.lang.String project]
    (ProjectGlobalInstanceTemplateName/of instance-template project)))

(defn *format
  "instance-template - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String instance-template ^java.lang.String project]
    (ProjectGlobalInstanceTemplateName/format instance-template project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalInstanceTemplateName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName [^java.lang.String formatted-string]
    (ProjectGlobalInstanceTemplateName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalInstanceTemplateName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInstanceTemplateName$Builder [^ProjectGlobalInstanceTemplateName this]
    (-> this (.toBuilder))))

(defn get-instance-template
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateName this]
    (-> this (.getInstanceTemplate))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalInstanceTemplateName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInstanceTemplateName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalInstanceTemplateName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalInstanceTemplateName this]
    (-> this (.hashCode))))

