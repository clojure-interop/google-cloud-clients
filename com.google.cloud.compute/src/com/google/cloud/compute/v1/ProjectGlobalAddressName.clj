(ns com.google.cloud.compute.v1.ProjectGlobalAddressName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalAddressName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalAddressName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder []
    (ProjectGlobalAddressName/newBuilder )))

(defn *of
  "address - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName [^java.lang.String address ^java.lang.String project]
    (ProjectGlobalAddressName/of address project)))

(defn *format
  "address - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String address ^java.lang.String project]
    (ProjectGlobalAddressName/format address project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalAddressName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalAddressName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName [^java.lang.String formatted-string]
    (ProjectGlobalAddressName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalAddressName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalAddressName$Builder [^ProjectGlobalAddressName this]
    (-> this (.toBuilder))))

(defn get-address
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalAddressName this]
    (-> this (.getAddress))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalAddressName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalAddressName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalAddressName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalAddressName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalAddressName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalAddressName this]
    (-> this (.hashCode))))

