(ns com.google.cloud.compute.v1.ProjectGlobalImageFamilyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalImageFamilyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalImageFamilyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder []
    (ProjectGlobalImageFamilyName/newBuilder )))

(defn *of
  "family - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName [^java.lang.String family ^java.lang.String project]
    (ProjectGlobalImageFamilyName/of family project)))

(defn *format
  "family - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String family ^java.lang.String project]
    (ProjectGlobalImageFamilyName/format family project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalImageFamilyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalImageFamilyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName [^java.lang.String formatted-string]
    (ProjectGlobalImageFamilyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalImageFamilyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageFamilyName$Builder [^ProjectGlobalImageFamilyName this]
    (-> this (.toBuilder))))

(defn get-family
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageFamilyName this]
    (-> this (.getFamily))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageFamilyName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalImageFamilyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageFamilyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageFamilyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalImageFamilyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalImageFamilyName this]
    (-> this (.hashCode))))

