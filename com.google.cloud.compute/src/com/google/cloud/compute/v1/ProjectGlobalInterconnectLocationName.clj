(ns com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalInterconnectLocationName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalInterconnectLocationName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder []
    (ProjectGlobalInterconnectLocationName/newBuilder )))

(defn *of
  "interconnect-location - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName [^java.lang.String interconnect-location ^java.lang.String project]
    (ProjectGlobalInterconnectLocationName/of interconnect-location project)))

(defn *format
  "interconnect-location - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String interconnect-location ^java.lang.String project]
    (ProjectGlobalInterconnectLocationName/format interconnect-location project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalInterconnectLocationName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName [^java.lang.String formatted-string]
    (ProjectGlobalInterconnectLocationName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalInterconnectLocationName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalInterconnectLocationName$Builder [^ProjectGlobalInterconnectLocationName this]
    (-> this (.toBuilder))))

(defn get-interconnect-location
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectLocationName this]
    (-> this (.getInterconnectLocation))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectLocationName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalInterconnectLocationName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectLocationName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalInterconnectLocationName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalInterconnectLocationName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalInterconnectLocationName this]
    (-> this (.hashCode))))

