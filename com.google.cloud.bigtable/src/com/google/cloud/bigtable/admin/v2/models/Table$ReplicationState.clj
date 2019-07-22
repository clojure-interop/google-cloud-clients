(ns com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Table$ReplicationState]))

(def NOT_KNOWN
  "Enum Constant.

  The replication state of the table is unknown in this cluster.

  type: com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState"
  Table$ReplicationState/NOT_KNOWN)

(def INITIALIZING
  "Enum Constant.

  The cluster was recently created, and the table must finish copying over pre-existing data
   from other clusters before it can begin receiving live replication updates and serving Data
   API requests.

  type: com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState"
  Table$ReplicationState/INITIALIZING)

(def PLANNED_MAINTENANCE
  "Enum Constant.

  The table is temporarily unable to serve Data API requests from this cluster due to planned
   internal maintenance.

  type: com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState"
  Table$ReplicationState/PLANNED_MAINTENANCE)

(def UNPLANNED_MAINTENANCE
  "Enum Constant.

  The table is temporarily unable to serve Data API requests from this cluster due to unplanned
   or emergency maintenance.

  type: com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState"
  Table$ReplicationState/UNPLANNED_MAINTENANCE)

(def READY
  "Enum Constant.

  The table can serve Data API requests from this cluster. Depending on replication delay,
   reads may not immediately reflect the state of the table in other clusters.

  type: com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState"
  Table$ReplicationState/READY)

(def UNRECOGNIZED
  "Enum Constant.

  The replication state of table is not known by this client. Please upgrade your client.

  type: com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState"
  Table$ReplicationState/UNRECOGNIZED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Table.ReplicationState c : Table.ReplicationState.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState[]`"
  ([]
    (Table$ReplicationState/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState [^java.lang.String name]
    (Table$ReplicationState/valueOf name)))

(defn *from-proto
  "Wraps the protobuf. This method is considered an internal implementation detail and not meant
   to be used by applications.

  proto - `com.google.bigtable.admin.v2.Table$ClusterState$ReplicationState`

  returns: `com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState`"
  (^com.google.cloud.bigtable.admin.v2.models.Table$ReplicationState [^com.google.bigtable.admin.v2.Table$ClusterState$ReplicationState proto]
    (Table$ReplicationState/fromProto proto)))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  returns: `com.google.bigtable.admin.v2.Table$ClusterState$ReplicationState`"
  (^com.google.bigtable.admin.v2.Table$ClusterState$ReplicationState [^Table$ReplicationState this]
    (-> this (.toProto))))

