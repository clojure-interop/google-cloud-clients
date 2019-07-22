(ns com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectGlobalForwardingRuleName$Builder]))

(defn ->builder
  "Constructor.

  project-global-forwarding-rule-name - `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`"
  (^ProjectGlobalForwardingRuleName$Builder [^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName project-global-forwarding-rule-name]
    (new ProjectGlobalForwardingRuleName$Builder project-global-forwarding-rule-name)))

(defn get-forwarding-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalForwardingRuleName$Builder this]
    (-> this (.getForwardingRule))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectGlobalForwardingRuleName$Builder this]
    (-> this (.getProject))))

(defn set-forwarding-rule
  "forwarding-rule - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder [^ProjectGlobalForwardingRuleName$Builder this ^java.lang.String forwarding-rule]
    (-> this (.setForwardingRule forwarding-rule))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName$Builder [^ProjectGlobalForwardingRuleName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName`"
  (^com.google.cloud.compute.v1.ProjectGlobalForwardingRuleName [^ProjectGlobalForwardingRuleName$Builder this]
    (-> this (.build))))

