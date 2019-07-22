(ns com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalSecurityPolicyName$Builder]))

(defn ->builder
  "Constructor.

  project-global-security-policy-name - `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`"
  (^ProjectGlobalSecurityPolicyName$Builder [^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName project-global-security-policy-name]
    (new ProjectGlobalSecurityPolicyName$Builder project-global-security-policy-name)))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSecurityPolicyName$Builder this]
    (-> this (.getProject))))

(defn get-security-policy
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalSecurityPolicyName$Builder this]
    (-> this (.getSecurityPolicy))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder [^ProjectGlobalSecurityPolicyName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-security-policy
  "security-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName$Builder [^ProjectGlobalSecurityPolicyName$Builder this ^java.lang.String security-policy]
    (-> this (.setSecurityPolicy security-policy))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName`"
  (^com.google.cloud.compute.v1.ProjectGlobalSecurityPolicyName [^ProjectGlobalSecurityPolicyName$Builder this]
    (-> this (.build))))

