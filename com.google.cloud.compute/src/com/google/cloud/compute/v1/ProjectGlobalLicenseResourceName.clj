(ns com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseResourceName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalLicenseResourceName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder []
    (ProjectGlobalLicenseResourceName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalLicenseResourceName/of project resource)))

(defn *format
  "project - `java.lang.String`
  resource - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String resource]
    (ProjectGlobalLicenseResourceName/format project resource)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalLicenseResourceName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName [^java.lang.String formatted-string]
    (ProjectGlobalLicenseResourceName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalLicenseResourceName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseResourceName$Builder [^ProjectGlobalLicenseResourceName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseResourceName this]
    (-> this (.getProject))))

(defn get-resource
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseResourceName this]
    (-> this (.getResource))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalLicenseResourceName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseResourceName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseResourceName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalLicenseResourceName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalLicenseResourceName this]
    (-> this (.hashCode))))

