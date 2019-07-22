(ns com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetSslProxyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalTargetSslProxyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder []
    (ProjectGlobalTargetSslProxyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-ssl-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName [^java.lang.String project ^java.lang.String target-ssl-proxy]
    (ProjectGlobalTargetSslProxyName/of project target-ssl-proxy)))

(defn *format
  "project - `java.lang.String`
  target-ssl-proxy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-ssl-proxy]
    (ProjectGlobalTargetSslProxyName/format project target-ssl-proxy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalTargetSslProxyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName [^java.lang.String formatted-string]
    (ProjectGlobalTargetSslProxyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalTargetSslProxyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder [^ProjectGlobalTargetSslProxyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetSslProxyName this]
    (-> this (.getProject))))

(defn get-target-ssl-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetSslProxyName this]
    (-> this (.getTargetSslProxy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalTargetSslProxyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetSslProxyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetSslProxyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalTargetSslProxyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalTargetSslProxyName this]
    (-> this (.hashCode))))

