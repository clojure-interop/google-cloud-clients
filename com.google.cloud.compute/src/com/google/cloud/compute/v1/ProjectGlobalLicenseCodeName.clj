(ns com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalLicenseCodeName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalLicenseCodeName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder []
    (ProjectGlobalLicenseCodeName/newBuilder )))

(defn *of
  "license-code - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName [^java.lang.String license-code ^java.lang.String project]
    (ProjectGlobalLicenseCodeName/of license-code project)))

(defn *format
  "license-code - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String license-code ^java.lang.String project]
    (ProjectGlobalLicenseCodeName/format license-code project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalLicenseCodeName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName [^java.lang.String formatted-string]
    (ProjectGlobalLicenseCodeName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalLicenseCodeName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalLicenseCodeName$Builder [^ProjectGlobalLicenseCodeName this]
    (-> this (.toBuilder))))

(defn get-license-code
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeName this]
    (-> this (.getLicenseCode))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalLicenseCodeName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalLicenseCodeName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalLicenseCodeName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalLicenseCodeName this]
    (-> this (.hashCode))))

