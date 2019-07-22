(ns com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetTcpProxyName]))

(def *-service-address
  "Static Constant.

  type: java.lang.String"
  ProjectGlobalTargetTcpProxyName/SERVICE_ADDRESS)

(defn *new-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder []
    (ProjectGlobalTargetTcpProxyName/newBuilder )))

(defn *of
  "project - `java.lang.String`
  target-tcp-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName [^java.lang.String project ^java.lang.String target-tcp-proxy]
    (ProjectGlobalTargetTcpProxyName/of project target-tcp-proxy)))

(defn *format
  "project - `java.lang.String`
  target-tcp-proxy - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^java.lang.String project ^java.lang.String target-tcp-proxy]
    (ProjectGlobalTargetTcpProxyName/format project target-tcp-proxy)))

(defn *new-factory
  "returns: `com.google.api.resourcenames.ResourceNameFactory<com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName>`"
  (^com.google.api.resourcenames.ResourceNameFactory []
    (ProjectGlobalTargetTcpProxyName/newFactory )))

(defn *parse
  "formatted-string - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName [^java.lang.String formatted-string]
    (ProjectGlobalTargetTcpProxyName/parse formatted-string)))

(defn *parsable-from?
  "formatted-string - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String formatted-string]
    (ProjectGlobalTargetTcpProxyName/isParsableFrom formatted-string)))

(defn to-builder
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder [^ProjectGlobalTargetTcpProxyName this]
    (-> this (.toBuilder))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetTcpProxyName this]
    (-> this (.getProject))))

(defn get-target-tcp-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetTcpProxyName this]
    (-> this (.getTargetTcpProxy))))

(defn get-field-values-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^ProjectGlobalTargetTcpProxyName this]
    (-> this (.getFieldValuesMap))))

(defn get-field-value
  "field-name - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetTcpProxyName this ^java.lang.String field-name]
    (-> this (.getFieldValue field-name))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetTcpProxyName this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ProjectGlobalTargetTcpProxyName this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ProjectGlobalTargetTcpProxyName this]
    (-> this (.hashCode))))

