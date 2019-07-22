(ns com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSslPolicyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-ssl-policy-name - `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`"
  (^ProjectGlobalSslPolicyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName project-global-ssl-policy-name]
    (new ProjectGlobalSslPolicyName$Builder project-global-ssl-policy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslPolicyName$Builder this]
    (-> this (.getProject))))

(defn get-ssl-policy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSslPolicyName$Builder this]
    (-> this (.getSslPolicy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder [^ProjectGlobalSslPolicyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-ssl-policy
  "ssl-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName$Builder [^ProjectGlobalSslPolicyName$Builder this ^java.lang.String ssl-policy]
    (-> this (.setSslPolicy ssl-policy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSslPolicyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSslPolicyName [^ProjectGlobalSslPolicyName$Builder this]
    (-> this (.build))))

