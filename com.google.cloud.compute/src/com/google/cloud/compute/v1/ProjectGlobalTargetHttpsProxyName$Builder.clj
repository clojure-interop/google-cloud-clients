(ns com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetHttpsProxyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-target-https-proxy-name - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`"
  (^ProjectGlobalTargetHttpsProxyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName project-global-target-https-proxy-name]
    (new ProjectGlobalTargetHttpsProxyName$Builder project-global-target-https-proxy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpsProxyName$Builder this]
    (-> this (.getProject))))

(defn get-target-https-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpsProxyName$Builder this]
    (-> this (.getTargetHttpsProxy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder [^ProjectGlobalTargetHttpsProxyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-https-proxy
  "target-https-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName$Builder [^ProjectGlobalTargetHttpsProxyName$Builder this ^java.lang.String target-https-proxy]
    (-> this (.setTargetHttpsProxy target-https-proxy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpsProxyName [^ProjectGlobalTargetHttpsProxyName$Builder this]
    (-> this (.build))))

