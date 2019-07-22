(ns com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetHttpProxyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalTargetHttpProxyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder []
    (ProjectGlobalTargetHttpProxyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-http-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName [^java.lang.String project ^java.lang.String target-http-proxy]
    (ProjectGlobalTargetHttpProxyName/of project target-http-proxy)))

(defn *format
  "project - `java.lang.String`
  target-http-proxy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-http-proxy]
    (ProjectGlobalTargetHttpProxyName/format project target-http-proxy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalTargetHttpProxyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName [^java.lang.String formatted-string]
    (ProjectGlobalTargetHttpProxyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalTargetHttpProxyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder [^ProjectGlobalTargetHttpProxyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpProxyName this]
    (-> this (.getProject))))

(defn get-target-http-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpProxyName this]
    (-> this (.getTargetHttpProxy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalTargetHttpProxyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpProxyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpProxyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalTargetHttpProxyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalTargetHttpProxyName this]
    (-> this (.hashCode))))

