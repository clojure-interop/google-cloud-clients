(ns com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalForwardingRuleName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalForwardingRuleName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder []
    (ProjectGlobalForwardingRuleName/newBuilder )))

(defn *of
  "forwarding-rule - `java.lang.String`
  project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName [^java.lang.String forwarding-rule ^java.lang.String project]
    (ProjectGlobalForwardingRuleName/of forwarding-rule project)))

(defn *format
  "forwarding-rule - `java.lang.String`
  project - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String forwarding-rule ^java.lang.String project]
    (ProjectGlobalForwardingRuleName/format forwarding-rule project)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalForwardingRuleName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName [^java.lang.String formatted-string]
    (ProjectGlobalForwardingRuleName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalForwardingRuleName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder [^ProjectGlobalForwardingRuleName this]
    (-> this (.toBuilder))))

(defn get-forwarding-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalForwardingRuleName this]
    (-> this (.getForwardingRule))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalForwardingRuleName this]
    (-> this (.getProject))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalForwardingRuleName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalForwardingRuleName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalForwardingRuleName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalForwardingRuleName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalForwardingRuleName this]
    (-> this (.hashCode))))

