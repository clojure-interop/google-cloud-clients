(ns com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalNetworkName$Builder]))

(defn ->builder
  "Constructor.

  project-global-network-name - `com.google.cloud.compute.v1.ProjectGlobalNetworkName`"
  (^ProjectGlobalNetworkName$Builder [^com.google.cloud.compute.v1.ProjectGlobalNetworkName project-global-network-name]
    (new ProjectGlobalNetworkName$Builder project-global-network-name)))

(defn get-network
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalNetworkName$Builder this]
    (-> this (.getNetwork))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalNetworkName$Builder this]
    (-> this (.getProject))))

(defn set-network
  "network - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder [^ProjectGlobalNetworkName$Builder this ^java.lang.String network]
    (-> this (.setNetwork network))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName$Builder [^ProjectGlobalNetworkName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalNetworkName`"
  (^com.google.cloud.compute.v1.ProjectGlobalNetworkName [^ProjectGlobalNetworkName$Builder this]
    (-> this (.build))))

