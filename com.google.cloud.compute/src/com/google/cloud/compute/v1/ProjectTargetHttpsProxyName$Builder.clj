(ns com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectTargetHttpsProxyName$Builder]))

(defn ->builder
  "Constructor.

  project-target-https-proxy-name - `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName`"
  (^ProjectTargetHttpsProxyName$Builder [^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName project-target-https-proxy-name]
    (new ProjectTargetHttpsProxyName$Builder project-target-https-proxy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpsProxyName$Builder this]
    (-> this (.getProject))))

(defn get-target-https-proxy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectTargetHttpsProxyName$Builder this]
    (-> this (.getTargetHttpsProxy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder [^ProjectTargetHttpsProxyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-target-https-proxy
  "target-https-proxy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName$Builder [^ProjectTargetHttpsProxyName$Builder this ^java.lang.String target-https-proxy]
    (-> this (.setTargetHttpsProxy target-https-proxy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectTargetHttpsProxyName`"
  (^com.google.cloud.compute.v1.ProjectTargetHttpsProxyName [^ProjectTargetHttpsProxyName$Builder this]
    (-> this (.build))))

