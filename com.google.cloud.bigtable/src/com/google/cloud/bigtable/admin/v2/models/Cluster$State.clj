(ns com.google.cloud.bigtable.admin.v2.models.Cluster$State
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Cluster$State]))

(def NOT_KNOWN
  "Enum Constant.

  The state of the cluster could not be determined.

  type: com.google.cloud.bigtable.admin.v2.models.Cluster$State"
  Cluster$State/NOT_KNOWN)

(def READY
  "Enum Constant.

  The cluster has been successfully created and is ready to serve requests.

  type: com.google.cloud.bigtable.admin.v2.models.Cluster$State"
  Cluster$State/READY)

(def CREATING
  "Enum Constant.

  The cluster is currently being created, and may be destroyed if the creation process
   encounters an error. A cluster may not be able to serve requests while being created.

  type: com.google.cloud.bigtable.admin.v2.models.Cluster$State"
  Cluster$State/CREATING)

(def RESIZING
  "Enum Constant.

  The cluster is currently being resized, and may revert to its previous node count if the
   process encounters an error. A cluster is still capable of serving requests while being
   resized, but may exhibit performance as if its number of allocated nodes is between the
   starting and requested states.

  type: com.google.cloud.bigtable.admin.v2.models.Cluster$State"
  Cluster$State/RESIZING)

(def DISABLED
  "Enum Constant.

  The cluster has no backing nodes. The data (tables) still exist, but no operations can be
   performed on the cluster.

  type: com.google.cloud.bigtable.admin.v2.models.Cluster$State"
  Cluster$State/DISABLED)

(def UNRECOGNIZED
  "Enum Constant.

  The state of the cluster is not known by this client. Please upgrade your client.

  type: com.google.cloud.bigtable.admin.v2.models.Cluster$State"
  Cluster$State/UNRECOGNIZED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Cluster.State c : Cluster.State.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigtable.admin.v2.models.Cluster$State[]`"
  ([]
    (Cluster$State/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigtable.admin.v2.models.Cluster$State`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster$State [^java.lang.String name]
    (Cluster$State/valueOf name)))

(defn *from-proto
  "Wraps the protobuf. This method is considered an internal implementation detail and not meant
   to be used by applications.

  proto - `com.google.bigtable.admin.v2.Cluster$State`

  returns: `com.google.cloud.bigtable.admin.v2.models.Cluster$State`"
  (^com.google.cloud.bigtable.admin.v2.models.Cluster$State [^com.google.bigtable.admin.v2.Cluster$State proto]
    (Cluster$State/fromProto proto)))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  returns: `com.google.bigtable.admin.v2.Cluster$State`"
  (^com.google.bigtable.admin.v2.Cluster$State [^Cluster$State this]
    (-> this (.toProto))))

