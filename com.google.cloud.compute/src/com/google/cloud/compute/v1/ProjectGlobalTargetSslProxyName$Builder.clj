(ns com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetSslProxyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-target-ssl-proxy-name - `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`"
  (^ProjectGlobalTargetSslProxyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName project-global-target-ssl-proxy-name]
    (new ProjectGlobalTargetSslProxyName$Builder project-global-target-ssl-proxy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetSslProxyName$Builder this]
    (-> this (.getProject))))

(defn get-target-ssl-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetSslProxyName$Builder this]
    (-> this (.getTargetSslProxy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder [^ProjectGlobalTargetSslProxyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-ssl-proxy
  "target-ssl-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName$Builder [^ProjectGlobalTargetSslProxyName$Builder this ^java.lang.String target-ssl-proxy]
    (-> this (.setTargetSslProxy target-ssl-proxy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetSslProxyName [^ProjectGlobalTargetSslProxyName$Builder this]
    (-> this (.build))))

