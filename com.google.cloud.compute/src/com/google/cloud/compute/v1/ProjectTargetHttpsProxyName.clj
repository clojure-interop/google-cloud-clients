(ns com.google.cloud.compute.v1.ProjectTargetHttpsProxyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectTargetHttpsProxyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectTargetHttpsProxyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder []
    (ProjectTargetHttpsProxyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-https-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName [^java.lang.String project ^java.lang.String target-https-proxy]
    (ProjectTargetHttpsProxyName/of project target-https-proxy)))

(defn *format
  "project - `java.lang.String`
  target-https-proxy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-https-proxy]
    (ProjectTargetHttpsProxyName/format project target-https-proxy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectTargetHttpsProxyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectTargetHttpsProxyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName [^java.lang.String formatted-string]
    (ProjectTargetHttpsProxyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectTargetHttpsProxyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder [^ProjectTargetHttpsProxyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpsProxyName this]
    (-> this (.getProject))))

(defn get-target-https-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpsProxyName this]
    (-> this (.getTargetHttpsProxy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectTargetHttpsProxyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpsProxyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpsProxyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectTargetHttpsProxyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectTargetHttpsProxyName this]
    (-> this (.hashCode))))

