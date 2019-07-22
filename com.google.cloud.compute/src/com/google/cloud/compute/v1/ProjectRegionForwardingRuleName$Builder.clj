(ns com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ProjectRegionForwardingRuleName$Builder]))

(defn ->builder
  "Constructor.

  project-region-forwarding-rule-name - `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`"
  (^ProjectRegionForwardingRuleName$Builder [^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName project-region-forwarding-rule-name]
    (new ProjectRegionForwardingRuleName$Builder project-region-forwarding-rule-name)))

(defn get-forwarding-rule
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName$Builder this]
    (-> this (.getForwardingRule))))

(defn get-project
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName$Builder this]
    (-> this (.getProject))))

(defn get-region
  "returns: `java.lang.String`"
  (^java.lang.String [^ProjectRegionForwardingRuleName$Builder this]
    (-> this (.getRegion))))

(defn set-forwarding-rule
  "forwarding-rule - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder [^ProjectRegionForwardingRuleName$Builder this ^java.lang.String forwarding-rule]
    (-> this (.setForwardingRule forwarding-rule))))

(defn set-project
  "project - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder [^ProjectRegionForwardingRuleName$Builder this ^java.lang.String project]
    (-> this (.setProject project))))

(defn set-region
  "region - `java.lang.String`

  returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName$Builder [^ProjectRegionForwardingRuleName$Builder this ^java.lang.String region]
    (-> this (.setRegion region))))

(defn build
  "returns: `com.google.cloud.compute.v1.ProjectRegionForwardingRuleName`"
  (^com.google.cloud.compute.v1.ProjectRegionForwardingRuleName [^ProjectRegionForwardingRuleName$Builder this]
    (-> this (.build))))

