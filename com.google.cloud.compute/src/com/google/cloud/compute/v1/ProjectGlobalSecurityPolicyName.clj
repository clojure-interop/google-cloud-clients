(ns com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSecurityPolicyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalSecurityPolicyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder []
    (ProjectGlobalSecurityPolicyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  security-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName [^java.lang.String project ^java.lang.String security-policy]
    (ProjectGlobalSecurityPolicyName/of project security-policy)))

(defn *format
  "project - `java.lang.String`
  security-policy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String security-policy]
    (ProjectGlobalSecurityPolicyName/format project security-policy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalSecurityPolicyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName [^java.lang.String formatted-string]
    (ProjectGlobalSecurityPolicyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalSecurityPolicyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder [^ProjectGlobalSecurityPolicyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSecurityPolicyName this]
    (-> this (.getProject))))

(defn get-security-policy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSecurityPolicyName this]
    (-> this (.getSecurityPolicy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalSecurityPolicyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSecurityPolicyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSecurityPolicyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalSecurityPolicyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalSecurityPolicyName this]
    (-> this (.hashCode))))

