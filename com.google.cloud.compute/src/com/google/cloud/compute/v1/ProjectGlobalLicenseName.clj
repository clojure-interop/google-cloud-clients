(ns com.google.cloud.compute.v1.ProjectGlobalLicenseName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalLicenseName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder []
    (ProjectGlobalLicenseName/newBuilder )))

(defn *of
  "license - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName [^java.lang.String license ^java.lang.String project]
    (ProjectGlobalLicenseName/of license project)))

(defn *format
  "license - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String license ^java.lang.String project]
    (ProjectGlobalLicenseName/format license project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalLicenseName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalLicenseName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName [^java.lang.String formatted-string]
    (ProjectGlobalLicenseName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalLicenseName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseName$Builder [^ProjectGlobalLicenseName this]
    (-> this (.toBuilder))))

(defn get-license
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseName this]
    (-> this (.getLicense))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalLicenseName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalLicenseName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalLicenseName this]
    (-> this (.hashCode))))

