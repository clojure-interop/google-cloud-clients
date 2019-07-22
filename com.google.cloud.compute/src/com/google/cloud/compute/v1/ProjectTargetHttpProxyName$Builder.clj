(ns com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectTargetHttpProxyName$Builder]))

(defn ->builder
  "Constructor.

  project-target-http-proxy-name - `com.google.cloud.compute.v1.ProjectTargetHttpProxyName`"
  (^ProjectTargetHttpProxyName$Builder [^com.google.cloud.compute.v1.ProjectTargetHttpProxyName project-target-http-proxy-name]
    (new ProjectTargetHttpProxyName$Builder project-target-http-proxy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpProxyName$Builder this]
    (-> this (.getProject))))

(defn get-target-http-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpProxyName$Builder this]
    (-> this (.getTargetHttpProxy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder [^ProjectTargetHttpProxyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-http-proxy
  "target-http-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName$Builder [^ProjectTargetHttpProxyName$Builder this ^java.lang.String target-http-proxy]
    (-> this (.setTargetHttpProxy target-http-proxy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectTargetHttpProxyName`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpProxyName [^ProjectTargetHttpProxyName$Builder this]
    (-> this (.build))))

