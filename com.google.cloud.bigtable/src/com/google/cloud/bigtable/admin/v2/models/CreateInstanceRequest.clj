(ns com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest
  "Parameters for creating a new Bigtable Instance.

  A Cloud Bigtable instance is mostly just a container for your clusters and nodes, which do all
  of the real work. Instances come in 2 flavors:


    Production
    A standard instance with either 1 or 2 clusters, as well as 3 or more nodes in each
        cluster. You cannot downgrade a production instance to a development instance.
    Development
    A low-cost instance for development and testing, with performance limited to the equivalent
        of a 1-node cluster. Development instances only support a single 1 node cluster.


  When creating an Instance, you must create at least one cluster in it.

  Examples:



  // Small production instance:
  CreateInstanceRequest smallProdInstanceRequest = CreateInstanceRequest.of(\"my-small-instance\")
    .addCluster(\"cluster1\", \"us-east1-c\", 3, StorageType.SSD);

  // Development instance:
  CreateInstanceRequest smallProdInstanceRequest = CreateInstanceRequest.of(\"my-dev-instance\")
    .setType(Type.DEVELOPMENT)
    .addCluster(\"cluster1\", \"us-east1-c\", 1, StorageType.SSD);"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models CreateInstanceRequest]))

(defn *of
  "Builds a new request to create a new instance with the specified id.

  instance-id - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest [^java.lang.String instance-id]
    (CreateInstanceRequest/of instance-id)))

(defn set-display-name
  "Sets the friendly display name of the instance. If left unspecified, it will default to the id

  display-name - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest [^CreateInstanceRequest this ^java.lang.String display-name]
    (-> this (.setDisplayName display-name))))

(defn set-type
  "Sets the type of instance.

   Can be either DEVELOPMENT or PRODUCTION. Defaults to PRODUCTION. Please see class javadoc
   for details.

  type - `com.google.cloud.bigtable.admin.v2.models.Instance$Type`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest [^CreateInstanceRequest this ^com.google.cloud.bigtable.admin.v2.models.Instance$Type type]
    (-> this (.setType type))))

(defn add-label
  "Adds an arbitrary label to the instance.

   Labels are key-value pairs that you can use to group related instances and store metadata
   about an instance.

  key - `java.lang.String`
  value - `java.lang.String`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest [^CreateInstanceRequest this ^java.lang.String key ^java.lang.String value]
    (-> this (.addLabel key value))))

(defn add-cluster
  "Adds a cluster to the instance request.

   All new instances must have at least one cluster. DEVELOPMENT instances must have exactly
   one cluster.

  cluster-id - The name of the cluster. - `java.lang.String`
  zone - The zone where the cluster will be created. - `java.lang.String`
  serve-nodes - The number of nodes that cluster will contain. DEVELOPMENT instance clusters must have exactly one node. - `int`
  storage-type - The type of storage used by this cluster to serve its parent instance's tables. - `com.google.cloud.bigtable.admin.v2.models.StorageType`

  returns: `com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest`"
  (^com.google.cloud.bigtable.admin.v2.models.CreateInstanceRequest [^CreateInstanceRequest this ^java.lang.String cluster-id ^java.lang.String zone ^Integer serve-nodes ^com.google.cloud.bigtable.admin.v2.models.StorageType storage-type]
    (-> this (.addCluster cluster-id zone serve-nodes storage-type))))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  project-id - `java.lang.String`

  returns: `com.google.bigtable.admin.v2.CreateInstanceRequest`"
  (^com.google.bigtable.admin.v2.CreateInstanceRequest [^CreateInstanceRequest this ^java.lang.String project-id]
    (-> this (.toProto project-id))))

