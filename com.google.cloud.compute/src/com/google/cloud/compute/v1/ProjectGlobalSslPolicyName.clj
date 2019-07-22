(ns com.google.cloud.compute.v1.ProjectGlobalSslPolicyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSslPolicyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalSslPolicyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder []
    (ProjectGlobalSslPolicyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  ssl-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName [^java.lang.String project ^java.lang.String ssl-policy]
    (ProjectGlobalSslPolicyName/of project ssl-policy)))

(defn *format
  "project - `java.lang.String`
  ssl-policy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String ssl-policy]
    (ProjectGlobalSslPolicyName/format project ssl-policy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalSslPolicyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalSslPolicyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName [^java.lang.String formatted-string]
    (ProjectGlobalSslPolicyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalSslPolicyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder [^ProjectGlobalSslPolicyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslPolicyName this]
    (-> this (.getProject))))

(defn get-ssl-policy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslPolicyName this]
    (-> this (.getSslPolicy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalSslPolicyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslPolicyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslPolicyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalSslPolicyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalSslPolicyName this]
    (-> this (.hashCode))))

