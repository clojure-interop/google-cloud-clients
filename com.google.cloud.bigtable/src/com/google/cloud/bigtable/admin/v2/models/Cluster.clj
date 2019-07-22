(ns com.google.cloud.bigtable.admin.v2.models.Cluster
  "A cluster represents the actual Cloud Bigtable service. Each cluster belongs to a single Cloud
  Bigtable instance, and an instance can have up to 2 clusters. When your application sends
  requests to a Cloud Bigtable instance, those requests are actually handled by one of the clusters
  in the instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Cluster]))

(defn *from-proto
  "Wraps a protobuf response.

   This method is considered an internal implementation detail and not meant to be used by
   applications.

  proto - `com.google.bigtable.admin.v2.Cluster`

  returns: `com.google.cloud.bigtable.admin.v2.models.Cluster`"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster [^com.google.bigtable.admin.v2.Cluster proto]
    (Cluster/fromProto proto)))

(defn get-id
  "Gets the cluster's id.

  returns: `java.lang.String`"
  (^java.lang.String [^Cluster this]
    (-> this (.getId))))

(defn get-instance-id
  "Gets the instance id.

  returns: `java.lang.String`"
  (^java.lang.String [^Cluster this]
    (-> this (.getInstanceId))))

(defn get-zone
  "Get the zone where this cluster is located.

  returns: `java.lang.String`"
  (^java.lang.String [^Cluster this]
    (-> this (.getZone))))

(defn get-state
  "Gets the current state of the cluster

  returns: `com.google.cloud.bigtable.admin.v2.models.Cluster$State`"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster$State [^Cluster this]
    (-> this (.getState))))

(defn get-serve-nodes
  "Get the number of nodes allocated to this cluster. More nodes enable higher throughput and more
   consistent performance.

  returns: `int`"
  (^Integer [^Cluster this]
    (-> this (.getServeNodes))))

(defn get-storage-type
  "The type of storage used by this cluster to serve its parent instance's tables, unless
   explicitly overridden.

  returns: `com.google.cloud.bigtable.admin.v2.models.StorageType`"
  (^com.google.cloud.bigtable.admin.v2.models.StorageType [^Cluster this]
    (-> this (.getStorageType))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Cluster this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Cluster this]
    (-> this (.hashCode))))

