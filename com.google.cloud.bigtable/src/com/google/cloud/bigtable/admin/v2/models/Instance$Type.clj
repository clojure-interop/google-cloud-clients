(ns com.google.cloud.bigtable.admin.v2.models.Instance$Type
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Instance$Type]))

(def PRODUCTION
  "Enum Constant.

  An instance meant for production use. `serve_nodes` must be set on the cluster.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$Type"
  Instance$Type/PRODUCTION)

(def DEVELOPMENT
  "Enum Constant.

  The instance is meant for development and testing purposes only.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$Type"
  Instance$Type/DEVELOPMENT)

(def UNRECOGNIZED
  "Enum Constant.

  The type of instance is not known by this client. Please upgrade your client.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$Type"
  Instance$Type/UNRECOGNIZED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Instance.Type c : Instance.Type.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigtable.admin.v2.models.Instance$Type[]`"
  ([]
    (Instance$Type/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigtable.admin.v2.models.Instance$Type`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigtable.admin.v2.models.Instance$Type [^java.lang.String name]
    (Instance$Type/valueOf name)))

(defn *from-proto
  "Wraps the protobuf. This method is considered an internal implementation detail and not meant
   to be used by applications.

  proto - `com.google.bigtable.admin.v2.Instance$Type`

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance$Type`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance$Type [^com.google.bigtable.admin.v2.Instance$Type proto]
    (Instance$Type/fromProto proto)))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  returns: `com.google.bigtable.admin.v2.Instance$Type`"
  (^com.google.bigtable.admin.v2.Instance$Type [^Instance$Type this]
    (-> this (.toProto))))

