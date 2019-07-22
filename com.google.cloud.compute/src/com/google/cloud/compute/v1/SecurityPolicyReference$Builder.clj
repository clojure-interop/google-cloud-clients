(ns com.google.cloud.compute.v1.SecurityPolicyReference$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 SecurityPolicyReference$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.SecurityPolicyReference`

  returns: `com.google.cloud.compute.v1.SecurityPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference$Builder [^SecurityPolicyReference$Builder this ^com.google.cloud.compute.v1.SecurityPolicyReference other]
    (-> this (.mergeFrom other))))

(defn get-security-policy
  "returns: `java.lang.String`"
  (^java.lang.String [^SecurityPolicyReference$Builder this]
    (-> this (.getSecurityPolicy))))

(defn set-security-policy
  "security-policy - `java.lang.String`

  returns: `com.google.cloud.compute.v1.SecurityPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference$Builder [^SecurityPolicyReference$Builder this ^java.lang.String security-policy]
    (-> this (.setSecurityPolicy security-policy))))

(defn build
  "returns: `com.google.cloud.compute.v1.SecurityPolicyReference`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference [^SecurityPolicyReference$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.SecurityPolicyReference$Builder`"
  (^com.google.cloud.compute.v1.SecurityPolicyReference$Builder [^SecurityPolicyReference$Builder this]
    (-> this (.clone))))

