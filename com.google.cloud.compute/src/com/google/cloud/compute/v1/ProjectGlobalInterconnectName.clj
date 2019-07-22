(ns com.google.cloud.compute.v1.ProjectGlobalInterconnectName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInterconnectName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalInterconnectName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder []
    (ProjectGlobalInterconnectName/newBuilder )))

(defn *of
  "interconnect - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName [^java.lang.String interconnect ^java.lang.String project]
    (ProjectGlobalInterconnectName/of interconnect project)))

(defn *format
  "interconnect - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String interconnect ^java.lang.String project]
    (ProjectGlobalInterconnectName/format interconnect project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalInterconnectName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalInterconnectName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName [^java.lang.String formatted-string]
    (ProjectGlobalInterconnectName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalInterconnectName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectName$Builder [^ProjectGlobalInterconnectName this]
    (-> this (.toBuilder))))

(defn get-interconnect
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectName this]
    (-> this (.getInterconnect))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalInterconnectName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalInterconnectName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalInterconnectName this]
    (-> this (.hashCode))))

