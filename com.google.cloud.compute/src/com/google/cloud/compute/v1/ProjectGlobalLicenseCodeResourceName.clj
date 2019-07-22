(ns com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseCodeResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalLicenseCodeResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder []
    (ProjectGlobalLicenseCodeResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalLicenseCodeResourceName/of project resource)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalLicenseCodeResourceName/format project resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalLicenseCodeResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName [^java.lang.String formatted-string]
    (ProjectGlobalLicenseCodeResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalLicenseCodeResourceName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeResourceName$Builder [^ProjectGlobalLicenseCodeResourceName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeResourceName this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeResourceName this]
    (-> this (.getResource))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalLicenseCodeResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeResourceName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalLicenseCodeResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalLicenseCodeResourceName this]
    (-> this (.hashCode))))

