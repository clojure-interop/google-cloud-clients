(ns com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalTargetHttpProxyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-target-http-proxy-name - `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName`"
  (^ProjectGlobalTargetHttpProxyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName project-global-target-http-proxy-name]
    (new ProjectGlobalTargetHttpProxyName$Builder project-global-target-http-proxy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpProxyName$Builder this]
    (-> this (.getProject))))

(defn get-target-http-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalTargetHttpProxyName$Builder this]
    (-> this (.getTargetHttpProxy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder [^ProjectGlobalTargetHttpProxyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-http-proxy
  "target-http-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName$Builder [^ProjectGlobalTargetHttpProxyName$Builder this ^java.lang.String target-http-proxy]
    (-> this (.setTargetHttpProxy target-http-proxy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalTargetHttpProxyName [^ProjectGlobalTargetHttpProxyName$Builder this]
    (-> this (.build))))

