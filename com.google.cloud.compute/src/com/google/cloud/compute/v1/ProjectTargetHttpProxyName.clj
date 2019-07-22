(ns com.google.cloud.compute.v1.ProjectTargetHttpProxyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectTargetHttpProxyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectTargetHttpProxyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder []
    (ProjectTargetHttpProxyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-http-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName [^java.lang.String project ^java.lang.String target-http-proxy]
    (ProjectTargetHttpProxyName/of project target-http-proxy)))

(defn *format
  "project - `java.lang.String`
  target-http-proxy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-http-proxy]
    (ProjectTargetHttpProxyName/format project target-http-proxy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectTargetHttpProxyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectTargetHttpProxyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName [^java.lang.String formatted-string]
    (ProjectTargetHttpProxyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectTargetHttpProxyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder [^ProjectTargetHttpProxyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpProxyName this]
    (-> this (.getProject))))

(defn get-target-http-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpProxyName this]
    (-> this (.getTargetHttpProxy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectTargetHttpProxyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpProxyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpProxyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectTargetHttpProxyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectTargetHttpProxyName this]
    (-> this (.hashCode))))

