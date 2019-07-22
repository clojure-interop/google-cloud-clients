(ns com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy
  "A AppProfile.RoutingPolicy that routes all requests to a specific cluster."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models AppProfile$SingleClusterRoutingPolicy]))

(defn *from-proto
  "Wraps a protobuf response.

   This method is considered an internal implementation detail and not meant to be used by
   applications.

  proto - `com.google.bigtable.admin.v2.AppProfile$SingleClusterRouting`

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy [^com.google.bigtable.admin.v2.AppProfile$SingleClusterRouting proto]
    (AppProfile$SingleClusterRoutingPolicy/fromProto proto)))

(defn *of
  "Builds a new instance of the routing policy that will send all requests to the specified
   cluster. This variant enables the ability to re-enable single row transactions at the cost of
   consistency.

   Please see the online
   documentation for more details.

  cluster-id - `java.lang.String`
  allow-transaction-writes - `boolean`

  returns: `com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy`"
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy [^java.lang.String cluster-id ^Boolean allow-transaction-writes]
    (AppProfile$SingleClusterRoutingPolicy/of cluster-id allow-transaction-writes))
  (^com.google.cloud.bigtable.admin.v2.models.AppProfile$SingleClusterRoutingPolicy [^java.lang.String cluster-id]
    (AppProfile$SingleClusterRoutingPolicy/of cluster-id)))

(defn get-cluster-id
  "Gets the target cluster of this policy.

  returns: `java.lang.String`"
  (^java.lang.String [^AppProfile$SingleClusterRoutingPolicy this]
    (-> this (.getClusterId))))

(defn get-allow-transactional-writes?
  "Checks if transactional writes are enabled.

  returns: `boolean`"
  (^Boolean [^AppProfile$SingleClusterRoutingPolicy this]
    (-> this (.getAllowTransactionalWrites))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^AppProfile$SingleClusterRoutingPolicy this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^AppProfile$SingleClusterRoutingPolicy this]
    (-> this (.hashCode))))

