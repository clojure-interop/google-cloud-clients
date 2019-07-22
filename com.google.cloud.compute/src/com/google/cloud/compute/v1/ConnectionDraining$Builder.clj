(ns com.google.cloud.compute.v1.ConnectionDraining$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.compute.v1 ConnectionDraining$Builder]))

(defn merge-from
  "other - `com.google.cloud.compute.v1.ConnectionDraining`

  returns: `com.google.cloud.compute.v1.ConnectionDraining$Builder`"
  (^com.google.cloud.compute.v1.ConnectionDraining$Builder [^ConnectionDraining$Builder this ^com.google.cloud.compute.v1.ConnectionDraining other]
    (-> this (.mergeFrom other))))

(defn get-draining-timeout-sec
  "Time for which instance will be drained (not accept new connections, but still work to finish
   started).

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ConnectionDraining$Builder this]
    (-> this (.getDrainingTimeoutSec))))

(defn set-draining-timeout-sec
  "Time for which instance will be drained (not accept new connections, but still work to finish
   started).

  draining-timeout-sec - `java.lang.Integer`

  returns: `com.google.cloud.compute.v1.ConnectionDraining$Builder`"
  (^com.google.cloud.compute.v1.ConnectionDraining$Builder [^ConnectionDraining$Builder this ^java.lang.Integer draining-timeout-sec]
    (-> this (.setDrainingTimeoutSec draining-timeout-sec))))

(defn build
  "returns: `com.google.cloud.compute.v1.ConnectionDraining`"
  (^com.google.cloud.compute.v1.ConnectionDraining [^ConnectionDraining$Builder this]
    (-> this (.build))))

(defn clone
  "returns: `com.google.cloud.compute.v1.ConnectionDraining$Builder`"
  (^com.google.cloud.compute.v1.ConnectionDraining$Builder [^ConnectionDraining$Builder this]
    (-> this (.clone))))

