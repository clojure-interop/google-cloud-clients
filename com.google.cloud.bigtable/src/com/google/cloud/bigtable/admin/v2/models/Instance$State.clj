(ns com.google.cloud.bigtable.admin.v2.models.Instance$State
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models Instance$State]))

(def NOT_KNOWN
  "Enum Constant.

  The state of the instance could not be determined by the server.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$State"
  Instance$State/NOT_KNOWN)

(def READY
  "Enum Constant.

  The instance has been successfully created and can serve requests to its tables.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$State"
  Instance$State/READY)

(def CREATING
  "Enum Constant.

  The instance is currently being created, and may be destroyed if the creation process
   encounters an error.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$State"
  Instance$State/CREATING)

(def UNRECOGNIZED
  "Enum Constant.

  The state of instance is not known by this client. Please upgrade your client.

  type: com.google.cloud.bigtable.admin.v2.models.Instance$State"
  Instance$State/UNRECOGNIZED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (Instance.State c : Instance.State.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigtable.admin.v2.models.Instance$State[]`"
  ([]
    (Instance$State/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigtable.admin.v2.models.Instance$State`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigtable.admin.v2.models.Instance$State [^java.lang.String name]
    (Instance$State/valueOf name)))

(defn *from-proto
  "Wraps the protobuf. This method is considered an internal implementation detail and not meant
   to be used by applications.

  proto - `com.google.bigtable.admin.v2.Instance$State`

  returns: `com.google.cloud.bigtable.admin.v2.models.Instance$State`"
  (^com.google.cloud.bigtable.admin.v2.models.Instance$State [^com.google.bigtable.admin.v2.Instance$State proto]
    (Instance$State/fromProto proto)))

(defn to-proto
  "Creates the request protobuf. This method is considered an internal implementation detail and
   not meant to be used by applications.

  returns: `com.google.bigtable.admin.v2.Instance$State`"
  (^com.google.bigtable.admin.v2.Instance$State [^Instance$State this]
    (-> this (.toProto))))

