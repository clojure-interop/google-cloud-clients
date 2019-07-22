(ns com.google.cloud.compute.v1.ProjectGlobalImageName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalImageName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalImageName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName$Builder []
    (ProjectGlobalImageName/newBuilder )))

(defn *of
  "image - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName [^java.lang.String image ^java.lang.String project]
    (ProjectGlobalImageName/of image project)))

(defn *format
  "image - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String image ^java.lang.String project]
    (ProjectGlobalImageName/format image project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalImageName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalImageName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalImageName`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName [^java.lang.String formatted-string]
    (ProjectGlobalImageName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalImageName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalImageName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalImageName$Builder [^ProjectGlobalImageName this]
    (-> this (.toBuilder))))

(defn get-image
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageName this]
    (-> this (.getImage))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalImageName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalImageName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalImageName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalImageName this]
    (-> this (.hashCode))))

