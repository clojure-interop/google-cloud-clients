(ns com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetHttpsProxyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalTargetHttpsProxyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder []
    (ProjectGlobalTargetHttpsProxyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-https-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName [^java.lang.String project ^java.lang.String target-https-proxy]
    (ProjectGlobalTargetHttpsProxyName/of project target-https-proxy)))

(defn *format
  "project - `java.lang.String`
  target-https-proxy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-https-proxy]
    (ProjectGlobalTargetHttpsProxyName/format project target-https-proxy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalTargetHttpsProxyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName [^java.lang.String formatted-string]
    (ProjectGlobalTargetHttpsProxyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalTargetHttpsProxyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder [^ProjectGlobalTargetHttpsProxyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpsProxyName this]
    (-> this (.getProject))))

(defn get-target-https-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpsProxyName this]
    (-> this (.getTargetHttpsProxy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalTargetHttpsProxyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpsProxyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpsProxyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalTargetHttpsProxyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalTargetHttpsProxyName this]
    (-> this (.hashCode))))

