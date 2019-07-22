(ns com.google.cloud.bigtable.admin.v2.models.StorageType
  (:refer-clojure :only [require comment defn ->])
  (:import [com.google.cloud.bigtable.admin.v2.models StorageType]))

(def HDD
  "Enum Constant.

  Flash (SSD) storage should be used.

  type: com.google.cloud.bigtable.admin.v2.models.StorageType"
  StorageType/HDD)

(def SSD
  "Enum Constant.

  Magnetic drive (HDD) storage should be used.

  type: com.google.cloud.bigtable.admin.v2.models.StorageType"
  StorageType/SSD)

(def UNRECOGNIZED
  "Enum Constant.

  The storage type is not known by this client. Please upgrade your client.

  type: com.google.cloud.bigtable.admin.v2.models.StorageType"
  StorageType/UNRECOGNIZED)

(defn *values
  "Returns an array containing the constants of this enum type, in
  the order they are declared.  This method may be used to iterate
  over the constants as follows:


  for (StorageType c : StorageType.values())
      System.out.println(c);

  returns: an array containing the constants of this enum type, in the order they are declared - `com.google.cloud.bigtable.admin.v2.models.StorageType[]`"
  ([]
    (StorageType/values )))

(defn *value-of
  "Returns the enum constant of this type with the specified name.
  The string must match exactly an identifier used to declare an
  enum constant in this type.  (Extraneous whitespace characters are
  not permitted.)

  name - the name of the enum constant to be returned. - `java.lang.String`

  returns: the enum constant with the specified name - `com.google.cloud.bigtable.admin.v2.models.StorageType`

  throws: java.lang.IllegalArgumentException - if this enum type has no constant with the specified name"
  (^com.google.cloud.bigtable.admin.v2.models.StorageType [^java.lang.String name]
    (StorageType/valueOf name)))

(defn *from-proto
  "Wraps the protobuf. This method is considered an internal implementation detail and not meant
   to be used by applications.

  proto - `com.google.bigtable.admin.v2.StorageType`

  returns: `com.google.cloud.bigtable.admin.v2.models.StorageType`"
  (^com.google.cloud.bigtable.admin.v2.models.StorageType [^com.google.bigtable.admin.v2.StorageType proto]
    (StorageType/fromProto proto)))

(defn to-proto
  "returns: `com.google.bigtable.admin.v2.StorageType`"
  (^com.google.bigtable.admin.v2.StorageType [^StorageType this]
    (-> this (.toProto))))

