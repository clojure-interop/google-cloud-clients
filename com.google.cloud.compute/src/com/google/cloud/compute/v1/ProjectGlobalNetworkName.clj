(ns com.google.cloud.compute.v1.ProjectGlobalNetworkName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalNetworkName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalNetworkName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder []
    (ProjectGlobalNetworkName/newBuilder )))

(defn *of
  "network - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName [^java.lang.String network ^java.lang.String project]
    (ProjectGlobalNetworkName/of network project)))

(defn *format
  "network - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String network ^java.lang.String project]
    (ProjectGlobalNetworkName/format network project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalNetworkName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalNetworkName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName [^java.lang.String formatted-string]
    (ProjectGlobalNetworkName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalNetworkName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder [^ProjectGlobalNetworkName this]
    (-> this (.toBuilder))))

(defn get-network
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalNetworkName this]
    (-> this (.getNetwork))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalNetworkName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalNetworkName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalNetworkName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalNetworkName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalNetworkName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalNetworkName this]
    (-> this (.hashCode))))

