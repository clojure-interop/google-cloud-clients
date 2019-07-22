(ns com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest
  "Parameters for creating a new Bigtable cluster.

  A cluster represents the actual Cloud Bigtable service. Each cluster belongs to a single Cloud
  Bigtable instance. When your application sends requests to a Cloud Bigtable instance, those
  requests are actually handled by one of the clusters in the instance.

  Each cluster is located in a single zone. An instance's clusters must be in unique zones that
  are within the same region. For example, if the first cluster is in us-east1-b, then us-east1-c
  is a valid zone for the second cluster. For a list of zones and regions where Cloud Bigtable is
  available, see Cloud Bigtable
  Locations.

  Examples:



  // Small production instance:
  CreateClusterRequest clusterRequest = CreateClusterRequest.of(\"my-existing-instance\", \"my-cluster\")
    .setZone(\"us-east1-c\")
    .setServeNodes(3)
    .setStorageType(StorageType.SSD);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models CreateClusterRequest]))

(defn *of
  "Builds a new request to create a new cluster to the specified instance with the specified
   cluster id.

  instance-id - `java.lang.String`
  cluster-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest [^java.lang.String instance-id ^java.lang.String cluster-id]
    (CreateClusterRequest/of instance-id cluster-id)))

(defn set-zone
  "Sets the zone where the new cluster will be located. Must be different from the existing
   cluster.

  zone - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest [^CreateClusterRequest this ^java.lang.String zone]
    (-> this (.setZone zone))))

(defn set-serve-nodes
  "Sets the number of nodes allocated to this cluster. More nodes enable higher throughput and
   more consistent performance.

  num-nodes - `int`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest [^CreateClusterRequest this ^Integer num-nodes]
    (-> this (.setServeNodes num-nodes))))

(defn set-storage-type
  "Sets the type of storage used by this cluster to serve its parent instance's tables. Defaults
   to SSD.

  storage-type - `com.google.cloud.bigtable.admin.v2.models.StorageType`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateClusterRequest [^CreateClusterRequest this ^com.google.cloud.bigtable.admin.v2.models.StorageType storage-type]
    (-> this (.setStorageType storage-type))))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  project-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.CreateClusterRequest`"
  (^com.google.bigtable.admin.v2.CreateClusterRequest [^CreateClusterRequest this ^java.lang.String project-id]
    (-> this (.toProto project-id))))

