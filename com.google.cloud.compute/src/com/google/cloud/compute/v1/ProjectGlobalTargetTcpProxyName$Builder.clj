(ns com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetTcpProxyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-target-tcp-proxy-name - `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`"
  (^ProjectGlobalTargetTcpProxyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName project-global-target-tcp-proxy-name]
    (new ProjectGlobalTargetTcpProxyName$Builder project-global-target-tcp-proxy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetTcpProxyName$Builder this]
    (-> this (.getProject))))

(defn get-target-tcp-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetTcpProxyName$Builder this]
    (-> this (.getTargetTcpProxy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder [^ProjectGlobalTargetTcpProxyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-tcp-proxy
  "target-tcp-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName$Builder [^ProjectGlobalTargetTcpProxyName$Builder this ^java.lang.String target-tcp-proxy]
    (-> this (.setTargetTcpProxy target-tcp-proxy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetTcpProxyName [^ProjectGlobalTargetTcpProxyName$Builder this]
    (-> this (.build))))

