(ns com.google.cloud.compute.v1.FirewallLogConfig$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 FirewallLogConfig$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.FirewallLogConfig`

  returns: `com.google.cloud.compute.v1.FirewallLogConfig$Builder`"
  (^com.google.cloud.compute.v1.FirewallLogConfig$Builder [^FirewallLogConfig$Builder this ^com.google.cloud.compute.v1.FirewallLogConfig other]
    (-> this (.mergeFrom other))))

(defn get-enable?
  "This field denotes whether to enable logging for a particular firewall rule.

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^FirewallLogConfig$Builder this]
    (-> this (.getEnable))))

(defn set-enable
  "This field denotes whether to enable logging for a particular firewall rule.

  enable - `java.lang.Boolean`

  returns: `com.google.cloud.compute.v1.FirewallLogConfig$Builder`"
  (^com.google.cloud.compute.v1.FirewallLogConfig$Builder [^FirewallLogConfig$Builder this ^java.lang.Boolean enable]
    (-> this (.setEnable enable))))

(defn build
  "returns: `com.google.cloud.compute.v1.FirewallLogConfig`"
  (^com.google.cloud.compute.v1.FirewallLogConfig [^FirewallLogConfig$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.FirewallLogConfig$Builder`"
  (^com.google.cloud.compute.v1.FirewallLogConfig$Builder [^FirewallLogConfig$Builder this]
    (-> this (.clone))))

