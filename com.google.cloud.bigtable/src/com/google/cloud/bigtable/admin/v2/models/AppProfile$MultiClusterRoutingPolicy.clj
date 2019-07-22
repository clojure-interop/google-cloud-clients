(ns com.google.cloud.bigtable.admin.v2.models.AppProfile$MultiClusterRoutingPolicy
  "A AppProfile.RoutingPolicy that tells Cloud Bigtable that it can route each request to any
  available cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models AppProfile$MultiClusterRoutingPolicy]))

(defn *of
  "Creates a new instance of AppProfile.MultiClusterRoutingPolicy.

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile$MultiClusterRoutingPolicy`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile$MultiClusterRoutingPolicy []
    (AppProfile$MultiClusterRoutingPolicy/of )))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AppProfile$MultiClusterRoutingPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AppProfile$MultiClusterRoutingPolicy this]
    (-> this (.hashCode))))

